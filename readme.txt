1. This test app uses XML configuration for JmsTemplate bean + JMSListener Annotation

2. web.xml ->yorkchen-servlet.xml ->applicationContext-jms.xml

   Web.xml: cofigure DispatcherServlet
   
      yorkchen-servlet.xml: define ViewResolver bean
           
           applicationContext-jms.xml: 
               connectionFactory 
               redeliveryPolicy
               jmsTemplate 
               jmsListenerContainerFactory
               jmsTransactionManager
   
     
   
   