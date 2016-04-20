package com.springproject.eshop;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.service.ICategoryDAO;

/**
 * Handles requests for the application home page.
 */
@RestController
public class AjaxController {
	@Resource
	private ICategoryDAO categoryDAO;
	@Autowired
	private HttpSession httpSession;

	private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);

	@ResponseBody
	@RequestMapping(value = "/addCart/{id}", method = RequestMethod.GET)
	public String addCart(Locale locale, Model model, @PathVariable long id) {
		httpSession.setAttribute("shree","raj");
		
		String result = (String) httpSession.getAttribute("shree");
		JSONObject obj = new JSONObject();
		obj.put("name", "mkyong.com");
		
		return obj.toJSONString();
	}

}
