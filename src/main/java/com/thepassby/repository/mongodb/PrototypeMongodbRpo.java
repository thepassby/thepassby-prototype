/**
 * 
 */
package com.thepassby.repository.mongodb;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;

/**
 * @author reset
 *
 */
@Repository
public class PrototypeMongodbRpo {
	private static Logger log = LoggerFactory.getLogger(PrototypeMongodbRpo.class);
	@Autowired
	MongoTemplate mongoTemplate;
	
	// 插入
	public <T> T insert(T obj) {
		mongoTemplate.insert(obj, obj.getClass().getSimpleName());
		return obj;
	}
	
	// 更新
	public <T> T update(T obj) {
		mongoTemplate.save(obj, obj.getClass().getSimpleName());
//		mongoTemplate.updateMulti(
//				Query.query(Criteria.where("iid").is(iid)), 
//				Update.update("key", "value"), 
//				obj.getClass().getSimpleName());
		return obj;
	}
	
	// 查询
	public <T> List<T> find(Map<String, String> conditions, Class<T> clazz) {
		Criteria c = null;
		
		for(Entry<String, String> e : conditions.entrySet()) {
			if(c == null) {
				c = Criteria.where(e.getKey()).regex(e.getValue());
			} else {
				c.and(e.getKey()).regex(e.getValue());
			}
		}
		
		return mongoTemplate.find(
				Query.query(c), 
				clazz, 
				clazz.getSimpleName());
	}
	
	// 删除
	public <T> int delete(Integer index, Class<T> clazz) {
		WriteResult r = mongoTemplate.remove(
				Query.query(Criteria.where("index").is(index)), 
				clazz.getSimpleName());
		
		log.info("r.getUpsertedId(): " + r.getUpsertedId() + ", r.getN(): " + r.getN());
		return r.getN();
	}
}
