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
<<<<<<< HEAD
	@Query("from Product p where p.category.categoryId = :id")
	List<Product> findByCategoryId(@Param("id") long id);
=======

	@Query("from Product p where p.category.categoryId = :id ")
	List<Product> findByCateogry(@Param("id") long id);
>>>>>>> bd27f75764ff693988ff9126254543424e105713
}
