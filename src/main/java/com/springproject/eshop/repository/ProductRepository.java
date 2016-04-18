package com.springproject.eshop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.eshop.domain.Product;

@Component
@Transactional(readOnly = true) 
public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByName(String name);
}
