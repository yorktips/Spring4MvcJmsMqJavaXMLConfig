/**
 * 
 */
package com.york.springmvc.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.york.springmvc.model.Order;

import javax.annotation.Resource;
import javax.jms.*;


/**
 * @author Misato
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-jms.xml"})
public class OrderInventoryServiceImplTest {

	@Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;

	
	public OrderInventoryServiceImplTest() {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.york.springmvc.service.OrderInventoryServiceImpl#processOrder(com.york.springmvc.model.Order)}.
	 */
	@Test
	public final void testProcessOrder() {
		Order order = new Order();
		
		OrderInventoryService orderInventoryService= new OrderInventoryServiceImpl();
		
		fail("Not yet implemented"); // TODO
	}

}
