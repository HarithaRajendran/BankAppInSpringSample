/*package com.asahi.mvc.bankTest.configFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asahi.mvc.bankTest.connectionJDBC.DaoInJdbc;
import com.asahi.mvc.bankTest.entities.Account;
import com.asahi.mvc.bankTest.entities.LoginPojo;
import com.asahi.mvc.bankTest.entities.User;

public class ObjectFactoryClass {

	public static User objectSender() {

		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext("spring-mvc-demo-servlet.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigFile.class);
		User theUser = context.getBean("user", User.class);

		context.close();

		return theUser;
	}

	public static DaoInJdbc daoObjectSender() {

		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext("spring-mvc-demo-servlet.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigFile.class);

		DaoInJdbc theDaoObject = context.getBean("daoInJdbc", DaoInJdbc.class);

		context.close();

		return theDaoObject;
	}
	
	
	public static LoginPojo loginObjectSender() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigFile.class);

		LoginPojo theLoginPojo = context.getBean("loginPojo", LoginPojo.class);

		context.close();

		return theLoginPojo;
	}
	
	
	  public static Account accountObjectSender() {
	  
	  AnnotationConfigApplicationContext context = new
	  AnnotationConfigApplicationContext(ConfigFile.class);
	  
	  Account account = context.getBean("acc", Account.class);
	  
	  context.close();
	  
	  return account; }
	 
}
*/