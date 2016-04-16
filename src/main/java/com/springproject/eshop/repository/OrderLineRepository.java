package com.springproject.eshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.springproject.eshop.domain.OrderLine;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long>{

	
}
