package com.asahi.mvc.bankTest.entities;

import org.springframework.stereotype.Component;

//@Component("loginPojo")
public class LoginPojo {
	
	private Long accountNo;
	private String accountType;

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
