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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.domain.Image;
import com.springproject.eshop.domain.Product;
import com.springproject.eshop.service.ICategoryDAO;
import com.springproject.eshop.service.IProductDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FrontController {
	@Resource
	private ICategoryDAO categoryDAO;

	@Resource
	private IProductDAO productDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);


	
	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
	public String productByCat(Model model, @PathVariable long id) {
//		Category cat = categoryDAO.findById(id);
		List<Product> products = productDAO.findByCategory(id);
		for(Product p:products){
			Image img = p.getImage();
			System.out.println(img.getUrl());
		}
		
		List<Category> categories = categoryDAO.findAll();
		model.addAttribute("products",products);
		model.addAttribute("categories",categories);
		model.addAttribute("currentCat",categoryDAO.findById(id));
		return "products";
	}

}
