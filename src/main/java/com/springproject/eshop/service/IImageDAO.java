package com.springproject.eshop.service;

import java.util.List;

import com.springproject.eshop.domain.Image;

public interface IImageDAO {
	public List<Image> findAll();
	public Image findById(long imageId);
	public void deleteAll();
	public void delete(Image image);
	public void create(Image image);
	public void update(Image image);
}
