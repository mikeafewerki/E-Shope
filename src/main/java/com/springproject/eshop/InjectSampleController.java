package com.springproject.eshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springproject.eshop.domain.Order;
import com.springproject.eshop.domain.OrderLine;
import com.springproject.eshop.domain.Product;
import com.springproject.eshop.domain.Status;
import com.springproject.eshop.domain.User;
import com.springproject.eshop.service.IOrderDAO;
import com.springproject.eshop.service.IOrderLineDAO;
import com.springproject.eshop.service.IProductDAO;
import com.springproject.eshop.service.IUserDAO;
@Controller
public class InjectSampleController {
	@Resource
	private IUserDAO userDAO;
	@Resource
	private IProductDAO productDAO;
	@Resource
	private IOrderDAO orderDAO;
	@Resource
	private IOrderLineDAO orderLineDAO;
	@RequestMapping(value = "/admin/injectData", method = RequestMethod.GET)
	public String adminOrder(Model model) {
		injectData();
		return "redirect:/";
	}

	public void injectData(){
		User usr1 = userDAO.findById(1011);
		
		Product prod1 = productDAO.findById(1031);
		Product prod2 =  productDAO.findById(1034);
		Product prod3 =  productDAO.findById(1036);
		Product prod4 =  productDAO.findById(1038);
		Product prod5 =  productDAO.findById(1040);

		Order ord1 = new Order(new Date(),0,usr1,Status.PENDING);

		OrderLine ol1 = new OrderLine(3,prod1,ord1);
		OrderLine ol2 = new OrderLine(1,prod2,ord1);
		OrderLine ol3 = new OrderLine(2,prod3,ord1);
		
		ord1.addOrderLines(ol1);
		ord1.addOrderLines(ol2);
		ord1.addOrderLines(ol3);

		orderDAO.create(ord1);
		orderLineDAO.create(ol1);
		orderLineDAO.create(ol2);
		orderLineDAO.create(ol3);
	}
}
