package com.springproject.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springproject.eshop.domain.Image;

@Controller
public class ImageController {
	@RequestMapping(value = "/admin/image", method = RequestMethod.GET)
	public String adminCategory(Model model) {
		model.addAttribute("page","image/all");
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/addImage", method = RequestMethod.GET)
	public String adminAddImage(Model model) {
		Image img = new Image();
		model.addAttribute(img);
		model.addAttribute("page","image/add.jsp");
		return "admin/index";
	}
}
