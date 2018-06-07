package com.asahi.mvc.bankTest.configFile;

import com.asahi.mvc.bankTest.entities.Account;

public class GenerateAccounts<T extends Account>{
	private T instanceOfAccountType;

	public GenerateAccounts() {
	}

	public GenerateAccounts(T object) {
		this.instanceOfAccountType = object;
	}
	
	public void withdraw(double amount, Account accountDetailOfCurrentUser) {
		this.instanceOfAccountType.withdraw(amount, accountDetailOfCurrentUser);
	}

	public void deposit(double amount, Account accountDetailOfCurrentUser) {
		this.instanceOfAccountType.deposit(amount, accountDetailOfCurrentUser);
	}
}