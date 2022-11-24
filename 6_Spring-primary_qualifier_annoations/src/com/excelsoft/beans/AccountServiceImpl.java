package com.excelsoft.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("accService")//replaces <bean>
public class AccountServiceImpl implements AccountService{
	public AccountServiceImpl() {
System.out.println("Acc service constructor");
}
	@Autowired
	@Qualifier("savingsAccountImpl")
	private Account account=null;
	//@Autowired
	public void setAccount(Account account) {
		System.out.println("setter account.....");
		this.account = account;
	}
	public String creditService(float amt) {
		return account.credit(amt);
	}

	
	
}
