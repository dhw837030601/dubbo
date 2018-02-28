package com.dhw.test;

//import org.junit.Test;

import com.dhw.client.MyClient;
import com.dhw.client.MyConsumer;

public class AppTest {
	//@Test
	public  void test() {  
       MyClient myClient = new MyClient();  
       myClient.sayHello();  
    } 

	public static void main(String[] args){
		MyConsumer consumer = new MyConsumer();
		//System.out.println("consumer 返回 ===== "+consumer.testPrint("我是少军"));;
	}
}
