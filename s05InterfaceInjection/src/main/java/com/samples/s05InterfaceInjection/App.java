package com.samples.s05InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.s05InterfaceInjection.service.OrderService;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s05InterfaceInjection/SpringConfig.xml");
        
        OrderService ser = (OrderService) springContainer.getBean("orderservice");
        System.out.println(ser);
        ser.placeOrder();
    }
}
