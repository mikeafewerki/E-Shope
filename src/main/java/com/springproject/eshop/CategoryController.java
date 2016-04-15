package com.springproject.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {
	@RequestMapping(value = "/admin/cateogry", method = RequestMethod.GET)
	public String adminCategory(Model model) {
		model.addAttribute("page","category/all");
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/addCategory", method = RequestMethod.GET)
	public String adminAddCategory(Model model) {
		model.addAttribute("page","category/add.jsp");
		return "admin/index";
	}
}
