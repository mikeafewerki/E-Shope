package com.springproject.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springproject.eshop.domain.User;
@Controller
public class UserController {
	@RequestMapping(value = "/admin/user", method = RequestMethod.GET)
	public String adminUser(Model model) {
		model.addAttribute("page","user/all");
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/addUser", method = RequestMethod.GET)
	public String adminAddUser(Model model) {
		User user = new User();
		model.addAttribute(user);
		model.addAttribute("page","user/add.jsp");
		return "admin/index";
	}
}
