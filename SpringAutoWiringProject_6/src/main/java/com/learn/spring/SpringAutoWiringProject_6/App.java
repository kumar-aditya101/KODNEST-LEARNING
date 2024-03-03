package com.learn.spring.SpringAutoWiringProject_6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Instructing Spring framwork to start its activity
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Engine engobj =(Engine)ctx.getBean("eng1");
        System.out.println(engobj);
        
        Engine eng2obj =(Engine)ctx.getBean("eng");
        System.out.println(eng2obj);
        
        Car crobj = (Car)ctx.getBean("cr");
        System.out.println(crobj);
    }
}
