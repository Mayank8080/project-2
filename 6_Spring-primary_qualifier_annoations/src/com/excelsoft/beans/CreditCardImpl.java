package com.excelsoft.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCardImpl implements Account{
	public String credit(float amt) {
		return "The amt of "+amt+" credited in your credit card "
				+ "account";
	}
}
