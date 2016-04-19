package com.springproject.eshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.multipart.MultipartFile;
=======
>>>>>>> bd27f75764ff693988ff9126254543424e105713
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.domain.Image;
import com.springproject.eshop.domain.Product;
import com.springproject.eshop.service.ICategoryDAO;
import com.springproject.eshop.service.IImageDAO;
import com.springproject.eshop.service.IProductDAO;

@Controller
public class ProductController {

	@Resource
	private IProductDAO productDao;
	@Resource
	ICategoryDAO categorytDao;
	@Resource
	IImageDAO imageDao;

	@RequestMapping(value = "/admin/product", method = RequestMethod.GET)
	public String adminProduct(Model model) {
		List<Product> products = productDao.findAll();
		//List<Product> products = productDao.findByCategory(4L);
		model.addAttribute("products", products);
		model.addAttribute("page", "product/list.jsp");
		return "admin/index";
	}

	@RequestMapping(value = "/admin/addProduct", method = RequestMethod.GET)
	public String adminAddProduct(Model model) {
		Product pro = new Product();
		model.addAttribute(pro);
		model.addAttribute("page", "product/add.jsp");

		List<Category> categories = categorytDao.findAll();
		model.addAttribute("categories", categories);
		return "admin/index";
	}

	@RequestMapping(value = "/admin/addProduct", method = RequestMethod.POST)
	public String saveAddProduct(@ModelAttribute("product") Product product, Model model,
<<<<<<< HEAD
			@RequestParam("file") MultipartFile[] file, @RequestParam("cat") Long catId,
			final RedirectAttributes redirectAttributes) throws IOException {

		List<Image> images = new ArrayList<Image>();
		for(int i=0;i<file.length;i++){
			Image img = new Image();
			img.setImage(file[i].getBytes());
			img.setProduct(product);
			product.addImage(img);
			images.add(img);
			//imageDao.create(img);
		}
		
=======
			@RequestParam("cat") Long catId, final RedirectAttributes redirectAttributes) {

>>>>>>> bd27f75764ff693988ff9126254543424e105713
		Category proCat = categorytDao.findById(catId);
		product.setCategory(proCat);
		productDao.create(product);
		
		for(Image image : images){
			imageDao.create(image);
		}
		
		model.addAttribute("page", "product/list.jsp");
		redirectAttributes.addFlashAttribute("message", "Product Added Successfully..");
		return "redirect:/admin/product";
	}

	@RequestMapping(value = "/admin/editProduct/{id}", method = RequestMethod.GET)
	public String updateProduct(Model model, @PathVariable long id){
		Product pro = productDao.findById(id);
		model.addAttribute(pro);
		model.addAttribute("page", "product/add.jsp");
		
		List<Category> categories = categorytDao.findAll();
		model.addAttribute("categories", categories);
		
		Category currentCat = pro.getCategory();
		model.addAttribute("currentCat", currentCat);
		
		return "admin/index";
	}
	
	@RequestMapping(value = "/admin/editProduct/{id}", method = RequestMethod.POST)
	public String saveUpdateProduct(Model model, @PathVariable long id, @ModelAttribute("product") Product product,
			@RequestParam("cat") Long catId, final RedirectAttributes redirectAttributes){
		
		Product pro = productDao.findById(id);
		pro.setName(product.getName());
		pro.setDescription(product.getDescription());
		pro.setCurrQty(product.getCurrQty());
		pro.setPrice(product.getPrice());
		
		Category proCat = categorytDao.findById(catId);
		pro.setCategory(proCat);
		productDao.update(pro);
		
		redirectAttributes.addFlashAttribute("message","Product is updated successfully");
		return "redirect:/admin/product";
	}
	
	@RequestMapping(value = "/admin/deleteProduct/{id}", method = RequestMethod.GET)
	public String deleteProduct(Model model, @PathVariable long id, final RedirectAttributes redirectAttributes) {
		Product product = productDao.findById(id);
		productDao.delete(product);
		redirectAttributes.addFlashAttribute("message", "Product is deleted successfully...");
		return "redirect:/admin/product";
	}
}
