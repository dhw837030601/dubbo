package com.dhw.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhw.service.SayHelloToClient;

public class MyClient {
	
	public void sayHello(){  
	      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });  
	
	      context.start();  
	
	      //��ȡ�������Ǳߵ�bean  
	      SayHelloToClient demoService = (SayHelloToClient) context.getBean("demoService");  
	
	      System.out.println(demoService.sayHello("lisi"));  
	      //SayHelloToClient myService = (SayHelloToClient) context.getBean("myService");  
	      
	      //System.out.println(myService.sayHi("dhw"));  
	  }  

}
