package com.york.springmvc.messaging;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import com.york.springmvc.model.Order;
import com.york.springmvc.service.OrderInventoryService;

@Component
public class MessageReceiver {

	static final Logger LOG = LoggerFactory.getLogger(MessageReceiver.class);
	private static final String ORDER_QUEUE = "order-queue";
	
	@Autowired
	OrderInventoryService orderInventoryService;

	@JmsListener(destination = ORDER_QUEUE)
	public void receiveMessage(final Message<Order> message) throws JMSException {
		
		LOG.info("----------------------------------------------------");
		//try{
			MessageHeaders headers =  message.getHeaders();
			
			LOG.info("Application : headers received : {}", headers);
			System.out.println("jms_redelivered=" + headers.get("jms_redelivered"));
			//throw new JMSException("This is my error");
			
			Order order = message.getPayload();
			LOG.info("Application : product : {}",order);	
	
			orderInventoryService.processOrder(order);
			
			LOG.info("----------------------------------------------------");
			
		//}catch(Exception e) {
		//	LOG.info(e.getMessage());
		//}

	}
	
}
