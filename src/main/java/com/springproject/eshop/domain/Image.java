package com.springproject.eshop.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Image {

	@Id
	@GeneratedValue
	private int imageId;
	private String url;
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
