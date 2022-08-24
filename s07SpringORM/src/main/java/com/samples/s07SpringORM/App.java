package com.samples.s07SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.s07SpringORM.Dao.ProductDAO;
import com.samples.s07SpringORM.entity.Product;

public class App {
	public static void main( String[] args ) {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s07SpringORM/SpringConfig.xml");
        
        ProductDAO productDAO = (ProductDAO) springContainer.getBean("productdao");
        
        Product product = new Product();
        product.setId(1);
        product.setName("Furniture");
        product.setDescription("Rose Wood");
        product.setPrice(1000);
        productDAO.create(product);
        
    }
}
