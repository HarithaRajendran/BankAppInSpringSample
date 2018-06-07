package com.asahi.mvc.bankTest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asahi.mvc.bankTest.entities.Account;
import com.asahi.mvc.bankTest.entities.LoginPojo;
import com.asahi.mvc.bankTest.entities.SavingsAccount;
import com.asahi.mvc.bankTest.entities.User;

@Controller
public class DAOController {

	HttpSession session = null;

	// @Autowired
	// private User user;
	User logg;

	@RequestMapping("/processForm")
	public String loginCheck(@ModelAttribute("loginModel") LoginPojo theLoginUser, HttpServletRequest request) {

		String result = null;

		Long passedAccountNo = theLoginUser.getAccountNo();
		
		String passedAccountType = theLoginUser.getAccountType();

		System.out.println(passedAccountNo + " llllllllllll");

		User loggedInUser = CRUDOperation.readForLoginCheck(passedAccountNo,passedAccountType);

		HttpSession session = null;

		if (passedAccountNo.equals(loggedInUser.getAccountNo())) {

			session = request.getSession(true); 

			System.out.println("inside login session");

			session.setAttribute("loggedInUser", loggedInUser);

			result = "operation";
		} else {

			request.setAttribute("error", "account Number Not exist...");

			System.out.println("login wrong");

			result = "login";
		}
		return result;

	}

	@RequestMapping("/deposit")
	public String depositPage(Model model1, HttpServletRequest request) {

		session = request.getSession(false);

		logg = (User) session.getValue("loggedInUser");

		Account theAccountDetails = new SavingsAccount();

		model1.addAttribute("account", theAccountDetails);

		return "depositingPage";
	}

	@RequestMapping("/depositProcessingPage")
	public String depositMethod(@ModelAttribute("user") User theUser, HttpServletRequest request) {

		session = request.getSession(false);

		logg = (User) session.getValue("loggedInUser");
		
		

		return "thankyouPage";
	}

}
