/**
 * 
 */
package com.thepassby.repository.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import io.swagger.model.seq.Sequence;

/**
 * @author reset
 *
 */
@Repository
public class PrototypeMongoSequence {
	@Autowired
	MongoTemplate mongoTemplate;
	
	// increase id
	public Integer getNextIndex(String key) {
		Query query = new Query(Criteria.where("key").is(key));
		Update update = new Update();
		update.inc("value", 1);
		FindAndModifyOptions options = new FindAndModifyOptions();
		options.upsert(true);
		options.returnNew(true);
		Sequence sequence = mongoTemplate.findAndModify(query, update, options, Sequence.class);
		return sequence.getValue();
	}
}
