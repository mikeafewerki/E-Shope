package com.springproject.eshop.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Stock {
	@Id
	@GeneratedValue
	private int id;
	private int qty;
	private int productId;
}
