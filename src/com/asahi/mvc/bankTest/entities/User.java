package com.asahi.mvc.bankTest.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("session")
public class User {
	
	private String name;
	private String email;
	
	private Account accountDetails;
	
	private String accountType;
	private long accountNo;
	
	public User() {
	}
	
	public User(Account accountDetails) {
		this.accountDetails = accountDetails;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	/*public Account getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(Account accountDetails) {
		this.accountDetails = accountDetails;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name+","+email+","+accountNo+","+accountDetails;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Account getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(Account accountDetails) {
		this.accountDetails = accountDetails;
	}
}
