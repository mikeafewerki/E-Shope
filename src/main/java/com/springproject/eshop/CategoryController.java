package com.springproject.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.eshop.domain.Category;

@Controller
public class CategoryController {
	@RequestMapping(value = "/admin/category", method = RequestMethod.GET)
	public String adminCategory(Model model) {
		model.addAttribute("page", "category/list.jsp");
		return "admin/index";
	}

	@RequestMapping(value = "/admin/addCategory", method = RequestMethod.GET)
	public String adminAddCategory(Model model) {
		Category cat = new Category();
		model.addAttribute(cat);
		model.addAttribute("page", "category/add.jsp");
		return "admin/index";
	}

	@RequestMapping(value = "/admin/addCategory", method = RequestMethod.POST)
	public String saveAddCategory(@ModelAttribute("category") Category category, Model model,
			final RedirectAttributes redirectAttributes) {
		System.out.println(category.getName());
		model.addAttribute("page", "category/list.jsp");
		redirectAttributes.addFlashAttribute("message", "Category Added Successfully..");
		return "redirect:/admin/category";
	}
}
