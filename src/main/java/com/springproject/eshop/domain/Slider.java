package com.springproject.eshop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
public class Slider {
	@Id
	@GeneratedValue
	private long sliderId;
	
	private String description;
	
	private transient CommonsMultipartFile sliderPicture = null;
	
	@Lob
	private Byte[] image;
	
	
	private String title;
	
	public long getSliderId() {
		return sliderId;
	}
	public void setSliderId(long sliderId) {
		this.sliderId = sliderId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public CommonsMultipartFile getSliderPicture() {
		return sliderPicture;
	}
	public void setSliderPicture(CommonsMultipartFile sliderPicture) {
		this.sliderPicture = sliderPicture;
	}
}
