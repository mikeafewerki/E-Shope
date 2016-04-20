package com.springproject.eshop;

import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.domain.Product;
import com.springproject.eshop.domain.SiteSetting;
import com.springproject.eshop.domain.Slider;
import com.springproject.eshop.domain.User;
import com.springproject.eshop.service.ICategoryDAO;
import com.springproject.eshop.service.IProductDAO;
import com.springproject.eshop.service.ISiteSettingDAO;
import com.springproject.eshop.service.ISliderDAO;
import com.springproject.eshop.service.IUserDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Resource
	private ICategoryDAO categoryDAO;
	@Resource
	private IUserDAO userDAOImpl;
	@Resource
	private ISliderDAO sliderDAOImpl;
	@Resource
	private IProductDAO productDAOImpl;
	@Resource
	private ISiteSettingDAO siteSettingDAOImpl;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<Category> categories = categoryDAO.findAll();
		
		model.addAttribute("categories",categories);
		
		List<Slider> sliders = sliderDAOImpl.findAll();
		
		model.addAttribute("sliders",sliders);
		
		List<SiteSetting> siteSettings = siteSettingDAOImpl.findAll();
		
		model.addAttribute("siteSettings",siteSettings);
		
		return "home";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String search(@ModelAttribute("searchResult") Product product, Model model,@RequestParam("txtSearch") String txtSearch,
			final RedirectAttributes redirectAttributes) {
		model.addAttribute("txtSearch",txtSearch);
		model.addAttribute("page", "/searchResult.jsp");
		
		return "redirect:/searchResult/"+txtSearch;
	}

	@RequestMapping(value = "/searchResult/{id}", method = RequestMethod.GET)
	public String searchResult(@ModelAttribute("searchResult") Product product,Model model, @PathVariable String id) {
		List<Product> products = productDAOImpl.findByName(id);
		model.addAttribute("products",products);
		return "searchResult";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		List<Category> categories = categoryDAO.findAll();
		User user = new User();
		model.addAttribute(user);
		model.addAttribute("categories",categories);
		return "signup";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveAddUser(@ModelAttribute("user") User user, Model model,
			final RedirectAttributes redirectAttributes) {
		//System.out.println(category.getName());
		userDAOImpl.create(user);
		model.addAttribute("page", "user/list.jsp");
		redirectAttributes.addFlashAttribute("message", "User Added Successfully..");
		return "redirect:/";
	}

}
