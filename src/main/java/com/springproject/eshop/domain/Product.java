package com.springproject.eshop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Product {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private double price;
	private int currQty;
	private List<Image> images = new ArrayList<Image>();
	private int stockId;
	private int catId;
	
	
}
