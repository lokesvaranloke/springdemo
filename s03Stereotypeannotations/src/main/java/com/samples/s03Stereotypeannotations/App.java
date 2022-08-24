package com.samples.s03Stereotypeannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.s03Stereotypeannotations.model.Instructors;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s03Stereotypeannotations/SpringConfig.xml");
        
//        Instructors ins = (Instructors) springContainer.getBean("instructors");
//        System.out.println(ins);
        
        Instructors ins = (Instructors) springContainer.getBean("inst"); // to use "inst" name we should mention same in component("inst")
        System.out.println(ins);
        
//        Instructors ins1 = (Instructors) springContainer.getBean("inst"); 
//        System.out.println(ins1); // if we create 2 instances and values using stereo that is using @value it will assing same values to all
        
    }
}
