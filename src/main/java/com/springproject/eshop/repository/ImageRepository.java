package com.springproject.eshop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.eshop.domain.Image;

@Component
@Transactional(readOnly = true) 
public interface ImageRepository extends CrudRepository<Image, Long> {
//	List<Image> findByUrl(String url);
}
