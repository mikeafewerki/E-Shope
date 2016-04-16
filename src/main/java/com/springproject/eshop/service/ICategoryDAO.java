package com.springproject.eshop.service;

import java.util.List;

import com.springproject.eshop.domain.Category;

public interface ICategoryDAO {

	public List<Category> findAll();
}
