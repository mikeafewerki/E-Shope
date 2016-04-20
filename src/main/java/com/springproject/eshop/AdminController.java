package com.springproject.eshop;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springproject.eshop.domain.Administrator;
import com.springproject.eshop.domain.Category;



@Controller
public class AdminController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminHome(Model model) {
		
		model.addAttribute("page","adminHome.jsp");
		return "admin/index";
	}
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String adminLogin(Model model) {
		Administrator login = new Administrator();
		model.addAttribute("login",login);
		
		return "admin/login";
	}
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String processAdminLogin(@ModelAttribute("login") Administrator admin, Model model) {
		String username = admin.getUserName();
		String password = admin.getPassword();
		return "redirect:/adminHome";
	}
}
