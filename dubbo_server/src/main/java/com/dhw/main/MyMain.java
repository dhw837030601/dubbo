package com.dhw.main;

import java.io.IOException;

//import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });

		context.start();
		System.out.println("按任意键退出");
		System.in.read();

	}
	//@Test
	public void test() throws IOException{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });

		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}
