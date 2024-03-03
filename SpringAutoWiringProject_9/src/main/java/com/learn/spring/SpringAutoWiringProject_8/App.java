package com.learn.spring.SpringAutoWiringProject_8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	 Engine engobj= (Engine) ctx.getBean("eng");
         System.out.println(engobj);

    	
    	Car carobj =(Car)ctx.getBean("cr");
        System.out.println( carobj);
        
  }
}
