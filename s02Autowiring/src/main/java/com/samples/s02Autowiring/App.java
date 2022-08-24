package com.samples.s02Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.s02Autowiring.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s02Autowiring/SpringConfig.xml");
        
        Employee emp = (Employee) springContainer.getBean("emp");
        System.out.println(emp);
        
    }
}
