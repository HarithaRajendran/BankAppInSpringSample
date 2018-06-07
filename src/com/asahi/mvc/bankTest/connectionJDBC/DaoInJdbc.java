package com.asahi.mvc.bankTest.connectionJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.asahi.mvc.bankTest.InstanceGivingClass;
import com.asahi.mvc.bankTest.entities.Account;
import com.asahi.mvc.bankTest.entities.User;

@Component("daoInJdbc")
public class DaoInJdbc {

	public DaoInJdbc() {
	}

	public User read(Long passedAccountNo,String accountType) {
		System.out.println("in jdbc" + passedAccountNo);
		User currentUser = InstanceGivingClass.userObject(accountType);
		Account currentUserAccount = InstanceGivingClass.accountObject(accountType);
	
		// Code to retrieve data from jdbc
		Connection con = ConnectionPool.getConnectionPool();

		ResultSet rs = null;
		Statement stmt;
		try {
			stmt = con.createStatement();

			String query = "select * from User where accountNo = " + passedAccountNo;

			System.out.println("jjjjjjjjjjjjjjjjj");
			rs = stmt.executeQuery(query);
			
			Long originalAccountNo = null;

			while(rs.next()) {
				currentUser.setName(rs.getString("name"));
				currentUser.setEmail(rs.getString("email"));
				currentUser.setAccountType(rs.getString("accountType"));;
				originalAccountNo = rs.getLong("accountNo");
			}

			String query2 = "select * from Account where accountNo = " + originalAccountNo;
			rs = stmt.executeQuery(query2);

			while(rs.next()) {
				currentUserAccount.setAccountType(rs.getString("accountType"));
				currentUserAccount.setAccountBalance(rs.getDouble("accountBalance"));
				currentUserAccount.setAccountNo(rs.getLong("accountNo"));

				currentUser.setAccountDetails(currentUserAccount);
			}

			System.out.println("ggggggggggggg "+currentUser);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return currentUser;
	}

	public void create() {

	}

	public void update() {

	}
}
