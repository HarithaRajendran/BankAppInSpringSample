package com.asahi.mvc.bankTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.asahi.mvc.bankTest.connectionJDBC.DaoInJdbc;
import com.asahi.mvc.bankTest.entities.Account;
import com.asahi.mvc.bankTest.entities.LoanAccount;
import com.asahi.mvc.bankTest.entities.LoginPojo;
import com.asahi.mvc.bankTest.entities.SavingsAccount;
import com.asahi.mvc.bankTest.entities.User;
/*import com.asahi.mvc.bankTest.manager.AccountManager;
import com.asahi.mvc.bankTest.manager.UserManager;*/

public class InstanceGivingClass {
	//static ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("spring-mvc-demo-servlet.xml");

	public static User userObject(String accountType) {
		
		
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); User theUser =
		 * (User) context.getBean("user",User.class);
		 * 
		 * context.close();
		 * 
		 * return theUser;
		 */

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");

		System.out.println("fghjghcd" + accountType);
		if (accountType.startsWith("sav")) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config-file.xml");
			User theGenerateAccountType = context.getBean("mySavingsAccount", User.class);
			context.close();

			return theGenerateAccountType;

		} else {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config-file.xml");
			User theGenerateAccountType = context.getBean("myLoanAccount", User.class);
			context.close();

			return theGenerateAccountType;
		}
	}
	public static DaoInJdbc daoInJdbcObject() {
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); User theUser =
		 * (User) context.getBean("user",User.class);
		 * 
		 * context.close();
		 * 
		 * return theUser;
		 */

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");

		ClassPathXmlApplicationContext context = 
	    	   new ClassPathXmlApplicationContext("config-file.xml");
		
		DaoInJdbc theDaoObject = (DaoInJdbc) context.getBean("daoInJdbc", DaoInJdbc.class);

		context.close();

		return theDaoObject;
	}
	
	public static LoginPojo CurrentUserObject() {
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); User theUser =
		 * (User) context.getBean("user",User.class);
		 * 
		 * context.close();
		 * 
		 * return theUser;
		 */
		
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("config-file.xml");

		//ApplicationContext context = 
		//    	   new ClassPathXmlApplicationContext("spring-mvc-demo-servlet2.xml");
		
		LoginPojo theCurrentUser = context.getBean("loginPojo", LoginPojo.class);

		context.close();
		return theCurrentUser;
	}
/*
	public static GenerateAccounts generateAccountType(String accountType) {

		System.out.println("fghjghcd" + accountType);
		if (accountType.startsWith("sav")) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			GenerateAccounts theGenerateAccountType = context.getBean("mySavingsAccount", GenerateAccounts.class);
			context.close();

			return theGenerateAccountType;

		} else {

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			GenerateAccounts theGenerateAccountType = context.getBean("myLoanAccount", GenerateAccounts.class);
			context.close();

			return theGenerateAccountType;
		}
	}*/

	public static Account accountObject(String accountType) {
		if (accountType.startsWith("savin")) {
			ClassPathXmlApplicationContext context = 
			    	   new ClassPathXmlApplicationContext("config-file.xml");
			Account theAccountType = context.getBean("savingsAccount", SavingsAccount.class);
			context.close();

			return theAccountType;

		} else {

			ClassPathXmlApplicationContext context = 
			    	   new ClassPathXmlApplicationContext("config-file.xml");
			Account theAccountType = context.getBean("loanAccount", LoanAccount.class);
			context.close();

			return theAccountType;
		}
	}
}
