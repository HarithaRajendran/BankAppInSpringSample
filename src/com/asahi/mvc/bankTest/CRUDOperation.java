package com.asahi.mvc.bankTest;

import com.asahi.mvc.bankTest.connectionJDBC.DaoInJdbc;
import com.asahi.mvc.bankTest.entities.User;

public class CRUDOperation {
	
	
	public static void insert() {
		
	}
	
	public static User readForLoginCheck(Long passesAccountNo,String passedAccountType) {
		User user = null;
		
		DaoInJdbc objOfDao = InstanceGivingClass.daoInJdbcObject();
		
		user = objOfDao.read(passesAccountNo,passedAccountType);
		
		System.out.println("inreadfile "+user);
		
		return user;
	}
	
	public static void update() {
		
	}
	
}
