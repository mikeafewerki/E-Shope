package com.springproject.eshop.model;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springproject.eshop.domain.Category;
import com.springproject.eshop.domain.Product;
import com.springproject.eshop.repository.ProductRepository;
import com.springproject.eshop.service.IProductDAO;

@Service
@Transactional
public class ProductDAOImpl implements IProductDAO {

	@Inject
	private ProductRepository repository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return (List<Product>) repository.findAll();
	}

	@Override
	public Product findById(long productId) {
		// TODO Auto-generated method stub
		return repository.findOne(productId);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		repository.deleteAll();
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		repository.delete(product);
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		repository.save(product);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		repository.save(product);
	}

	@Override
	public List<Product> findByCategory(long categoryId) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return repository.findByCategoryId(categoryId);
=======
		repository. findByCateogry(categoryId);
		return null;
>>>>>>> bd27f75764ff693988ff9126254543424e105713
	}

}
