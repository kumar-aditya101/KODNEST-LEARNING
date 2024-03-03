package com.learn.spring.SpringAutoWiringProject_8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Product probj = (Product)ctx.getBean("pr1");
        System.out.println( probj);
        
        Shop shobj = (Shop)ctx.getBean("sh");
        System.out.println(shobj);
    }
}
