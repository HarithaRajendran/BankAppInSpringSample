package com.asahi.mvc.bankTest.entities;

import org.springframework.stereotype.Component;


public abstract class Account {

	private String accountType;
	private long accountNo;
	private double accountBalance;
	
	/*public Account(String accountType) {
		
	}*/
	
	public abstract String getAccount();
	
	public abstract void deposit(double amount, Account accountDetailOfCurrentUser);
	public abstract void withdraw(double amount, Account accountDetailOfCurrentUser);

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public String toString() {
		return accountType + "," + accountNo + "," + accountBalance ;
	}

}
