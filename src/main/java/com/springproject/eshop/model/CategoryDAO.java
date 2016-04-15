package com.springproject.eshop.model;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.repository.CategoryRepository;
import com.springproject.eshop.service.CategoryService;

@Service
@Transactional(readOnly = true)
public class CategoryDAO implements CategoryService{

	@Inject
	private CategoryRepository repository;
	
	@Override
	public List<Category> findAll() {

		return (List<Category>) repository.findAll();
	}


}