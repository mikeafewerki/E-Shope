package com.springproject.eshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.domain.Product;

@Component
@Transactional(readOnly = true) 
public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByName(String name);

	@Query("from Product p where p.category.categoryId = :id ")
	List<Product> findByCateogry(@Param("id") long id);
}
