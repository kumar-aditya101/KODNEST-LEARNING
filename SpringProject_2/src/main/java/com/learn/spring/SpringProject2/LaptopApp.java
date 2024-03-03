package com.learn.spring.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Laptop lapbean1obj = (Laptop) ctx.getBean("lapbean1");
    	   System.out.println(lapbean1obj);
    	   
    	Laptop lapbean2obj = (Laptop) ctx.getBean("lapbean2");
    	System.out.println(lapbean2obj);
    	
    	Laptop lapbean3obj = (Laptop) ctx.getBean("lapbean3");
    	System.out.println(lapbean3obj);
    	
    	
    }
}
