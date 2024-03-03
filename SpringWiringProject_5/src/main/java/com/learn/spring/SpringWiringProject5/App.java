package com.learn.spring.SpringWiringProject5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Mobile mob1obj = (Mobile)ctx.getBean("mob1");
        System.out.println(mob1obj);
        
        Person perobj =(Person)ctx.getBean("Per");
        System.out.println(perobj);
    }
}
