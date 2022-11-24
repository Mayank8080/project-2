package com.excelsoft.beans;

import org.springframework.stereotype.Component;
@Component//replaces <bean>
public class SavingsAccountImpl implements Account {
	public SavingsAccountImpl() {
		System.out.println("Savings Acc constructor");
	}
	
	public String credit(float amt) {
		return "The amt of "+amt+" credited in your account";
	}

}
