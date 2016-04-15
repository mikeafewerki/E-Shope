package com.springproject.eshop;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public String adminHome(Model model) {
		
		
		return "admin/adminHome";
	}
}
