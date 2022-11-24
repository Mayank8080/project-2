package com.excelsoft.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	//initialize the spring container .......
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	AccountService service=(AccountService) ctx.getBean("accService");
	String res=service.creditService(100000);
	System.out.println(res);
}
}
