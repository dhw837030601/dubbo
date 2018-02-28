package com.dhw.client;

//import org.junit.Test;
//import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dhw.service.TestProvider;

public class MyConsumer {
	//@Test
	public  void testPrint(){
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });  
			
	      context.start();  
	
	      //��ȡ�������Ǳߵ�bean  
	      TestProvider demoService = (TestProvider) context.getBean("testService");  
	
	     // System.out.println(demoService.testPrint(content));  
	      /*return*/ System.out.println (demoService.testPrint("我是少军"));
	     
	}
	public  static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });  
		
		context.start();  
		
		//��ȡ�������Ǳߵ�bean  
		TestProvider demoService = (TestProvider) context.getBean("testService");  
		
		// System.out.println(demoService.testPrint(content));  
		/*return*/ System.out.println (demoService.testPrint("我是少军"));
		
	}
}
