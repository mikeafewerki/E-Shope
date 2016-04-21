package com.springproject.eshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springproject.eshop.domain.OrderLine;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long>{

	@Query("from OrderLine ol where ol.order.orderId = :id")
	List<OrderLine> findByOrderId(@Param("id") long id);
}
