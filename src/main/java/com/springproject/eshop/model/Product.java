package com.springproject.eshop.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Product {
	@Id
	@GeneratedValue
	private int productId;
	private String name;
	private String description;
	private double price;
	private int currQty;
	
	@OneToMany
	@JoinColumn(name="imageId")
	private List<Image> images = new ArrayList<Image>();
	
	@OneToMany(mappedBy="stockId")
	private int stockId;
	@ManyToOne
	@JoinColumn(name="categoryId")
	private int catId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCurrQty() {
		return currQty;
	}
	public void setCurrQty(int currQty) {
		this.currQty = currQty;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	
	
}
