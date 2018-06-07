package com.asahi.mvc.bankTest.entities;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("loanAccount")
public class LoanAccount extends Account {

	
	public LoanAccount() {
		
	}
	
	@Override
	public synchronized void deposit(double amount, Account accountDetailOfCurrentUser) {
		System.out.println("In deposit of Loan Account...");
		if (amount < 50 || accountDetailOfCurrentUser.getAccountBalance() < amount) {
			System.out.println("You can deposit only more than Rs.50...");
		} else {
			accountDetailOfCurrentUser.setAccountBalance(accountDetailOfCurrentUser.getAccountBalance() - amount);
			System.out.println("Your Transcations is success.....");
		}
		System.out.println("Current Balance: " + accountDetailOfCurrentUser.getAccountBalance());

	}

	@Override
	public synchronized void withdraw(double amount, Account accountDetailOfCurrentUser) {
		System.out.println("In deposit of Loan Account...");
		if (amount < 50) {
			System.out.println("Insufficient Balance...");
		} else {
			accountDetailOfCurrentUser.setAccountBalance(accountDetailOfCurrentUser.getAccountBalance() + amount);
			System.out.println("Your Transcations is success.....");
		}
		System.out.println("Current Balance: " + accountDetailOfCurrentUser.getAccountBalance());
	}

	@Override
	public String getAccount() {
		return "loan";
	}
}
