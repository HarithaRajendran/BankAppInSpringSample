/*package com.asahi.mvc.bankTest.configFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestParam;

import com.asahi.mvc.bankTest.connectionJDBC.DaoInJdbc;
import com.asahi.mvc.bankTest.entities.Account;
import com.asahi.mvc.bankTest.entities.LoanAccount;
import com.asahi.mvc.bankTest.entities.LoginPojo;
import com.asahi.mvc.bankTest.entities.SavingsAccount;
import com.asahi.mvc.bankTest.entities.User;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.ObjectFactory;

@Configuration
public class ConfigFile {

	@Bean
	public User user() {

		return new User(acc());
	}
	
	@Bean
	public LoginPojo loginPojo() {
		return new LoginPojo();
	}
	
	@Bean
	public DaoInJdbc daoInJdbc() {
		return new DaoInJdbc();
	}
	
	@Bean
	public Account acc() {
		String accountType = "savings";
		return InstanceClass.instanceOfAccountType(accountType);
	}
}*/

	
	/*@Bean
	public Account acc1() {
		
			return new LoanAccount();
		
	}


	
	
	@Bean
	public GenerateAccount generateAccount(Account account) {
		return acc();
	}
	
	@Bean
	public Account acc() {
		return  InstanceClass.instanceOfAccountType(ObjectFactoryClass.objectSender().getAccountDetails().getAccountType());
	}
	
	
	
	Account accounty = View.instanceOfAccountType(accountDetail.getAccountType());
	System.out.println(accountDetail.getAccountType());
	GenerateAccounts<Account> checkAccountTypeToDoOperation = new GenerateAccounts<Account>(accounty);

}
*/