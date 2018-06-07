/*package com.asahi.mvc.bankTest.configFile;

import com.asahi.mvc.bankTest.entities.Account;
import com.asahi.mvc.bankTest.entities.LoanAccount;
import com.asahi.mvc.bankTest.entities.SavingsAccount;

public class InstanceClass {
	
		public static Account instanceOfAccountType(String accountType) {
			if(accountType.equals(null)) {
				return new SavingsAccount();
			}
			else {
				if (accountType.equalsIgnoreCase("SAVINGS")) {
					return new SavingsAccount();
				} else {
					return new LoanAccount();
				}
			}
		}	
}
*/