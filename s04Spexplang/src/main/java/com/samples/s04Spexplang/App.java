package com.samples.s04Spexplang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.s04Spexplang.model.CarDealer;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s04Spexplang/SpringConfig.xml");
        
        CarDealer car = (CarDealer) springContainer.getBean("carDealer");
        System.out.println(car);
        
    }
}
