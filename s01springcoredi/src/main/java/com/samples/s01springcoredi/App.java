package com.samples.s01springcoredi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s01springcoredi/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp");
        System.out.println(emp);
        
//        Hospital hospital = (Hospital) springContainer.getBean("hospital");
//        System.out.println(hospital);
        
//        CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
//        System.out.println(dealer);
        
//        Customer cust = (Customer) springContainer.getBean("customer");
//        System.out.println(cust);
        
//        ShoppingCart sc = (ShoppingCart) springContainer.getBean("shoppingcart");
//        System.out.println(sc);
    	
//    	CountriesandLanguages c = (CountriesandLanguages) springContainer.getBean("countries");
//    	System.out.println(c);
    	
//    	Student student = (Student) springContainer.getBean("student");
//    	System.out.println(student);
        
//    	AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s01springcoredi/SpringConfig.xml");
//        Patient p = (Patient) springContainer.getBean("patient");
//        System.out.println(p);
//        springContainer.registerShutdownHook();
        
    }
}
