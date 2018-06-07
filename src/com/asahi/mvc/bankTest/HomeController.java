package com.asahi.mvc.bankTest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asahi.mvc.bankTest.entities.LoginPojo;
import com.asahi.mvc.bankTest.entities.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String loginPage(Model model) {	

		LoginPojo theLogin = InstanceGivingClass.CurrentUserObject();
				
		model.addAttribute("loginModel", theLogin);
		
		return "login";
	}

}
