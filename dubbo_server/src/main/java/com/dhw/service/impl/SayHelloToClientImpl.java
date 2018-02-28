package com.dhw.service.impl;

import com.dhw.service.SayHelloToClient;

public class SayHelloToClientImpl implements SayHelloToClient{

	public String sayHello(String hello) {
		 System.out.println("你好" + hello);  
		 return hello + "你好" ; 
	}

	/*public String sayHi(String name) {
		System.out.println("���յ���"+name+" say hi");
		
		return name + "��Ҳ�ð�";
	}*/
}
