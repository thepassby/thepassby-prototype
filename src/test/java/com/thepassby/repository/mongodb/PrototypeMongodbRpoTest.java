/**
 * 
 */
package com.thepassby.repository.mongodb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.PrototypeApplication;
import io.swagger.model.Region;

/**
 * @author reset
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeMongodbRpoTest {
	@Autowired
	PrototypeMongodbRpo prototypeMongodbRpo;
	@Autowired
	PrototypeMongoSequence prototypeMongoSequence;
	
	@Before
	public void setup() {};
	@After
	public void teardown() {};
	
	@Test
	public void antTest() {
		System.out.println("prototypeMongodbRpo: " + prototypeMongodbRpo);
	}
	
	@Test
	public void insertTest() {
		Region r = prototypeMongodbRpo.insert(buildRegion());
		System.out.println(r.toString());
	}
	
	@Test
	public void findTest() {
		Map<String, String> conditions = new HashMap<>();
		conditions.put("code", "CN");
		List<Region> list = prototypeMongodbRpo.find(conditions, Region.class);
		System.out.println(list);
	}
	
	private Region buildRegion() {
		Region r = new Region();
		
		r.setIndex(prototypeMongoSequence.getNextIndex(Region.class.getSimpleName()));
		r.setCode("CN");
		r.setLevel(1);
		r.setName("china");
		r.setParent(null);
		r.setDescription("chinese");
		
		return r;
	}
}
