package com.asahi.mvc.bankTest.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.asahi.mvc.bankTest.entities.Account;

@Component("savingsAccount")
public class SavingsAccount extends Account {

	public SavingsAccount() {
		
	}
	
	@Override
	public synchronized void deposit(double amount, Account accountDetailOfCurrentUser) {
		System.out.println("In deposit of Savings Account...");
		if (amount < 50) {
			System.out.println("You can deposit only more than Rs.50...");
		} else {
			accountDetailOfCurrentUser.setAccountBalance(accountDetailOfCurrentUser.getAccountBalance() + amount);
			System.out.println("Your Transcations is success.....");
		}
		System.out.println("Current Balance: " + accountDetailOfCurrentUser.getAccountBalance());
	}

	@Override
	public synchronized void withdraw(double amount, Account accountDetailOfCurrentUser) {
		System.out.println("In withdraw of Savings Account...");
		if (amount < 50 || accountDetailOfCurrentUser.getAccountBalance() < amount) {
			System.out.println("Insufficient Amount...");
		} else {
			accountDetailOfCurrentUser.setAccountBalance(accountDetailOfCurrentUser.getAccountBalance() - amount);
			System.out.println("Your Transcations is success.....");
		}
		System.out.println("Current Balance: " + accountDetailOfCurrentUser.getAccountBalance());
	}

	@Override
	public String getAccount() {
		return "savings";
	}

}

