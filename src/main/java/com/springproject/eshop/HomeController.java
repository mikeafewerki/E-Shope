package com.springproject.eshop;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.service.ICategoryDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Resource
	private ICategoryDAO categoryDAO;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Category> categories = categoryDAO.findAll();
		
		model.addAttribute("categories",categories);
		return "home";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		List<Category> categories = categoryDAO.findAll();
		
		model.addAttribute("categories",categories);
		return "signup";
	}

}
