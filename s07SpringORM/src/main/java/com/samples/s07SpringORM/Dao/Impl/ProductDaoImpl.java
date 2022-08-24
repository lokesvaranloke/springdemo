package com.samples.s07SpringORM.Dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.s07SpringORM.Dao.ProductDAO;
import com.samples.s07SpringORM.entity.Product;

@Component("productdao")
public class ProductDaoImpl implements ProductDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

}
