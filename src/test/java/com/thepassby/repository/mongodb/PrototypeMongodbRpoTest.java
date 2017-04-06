/**
 * 
 */
package com.thepassby.repository.mongodb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.PrototypeApplication;

/**
 * @author reset
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeMongodbRpoTest {
	@Autowired
	PrototypeMongodbRpo prototypeMongodbRpo;
	
	@Before
	public void setup() {};
	@After
	public void teardown() {};
	
	@Test
	public void antTest() {
		System.out.println("prototypeMongodbRpo: " + prototypeMongodbRpo);
	}
}
