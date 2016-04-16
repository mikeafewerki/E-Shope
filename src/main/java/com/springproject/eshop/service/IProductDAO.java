package com.springproject.eshop.service;

import java.util.List;

import com.springproject.eshop.domain.Product;

public interface IProductDAO {
	public List<Product> findAll();
	public Product findById(long productId);
	public void deleteAll();
	public void delete(Product product);
	public void create(Product product);
	public void update(Product product);
}
