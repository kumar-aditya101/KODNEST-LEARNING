package com.learn.spring.SpringProject4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.SpringProject4.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    	Employee emp1obj = (Employee)ctx.getBean("emp1");
        System.out.println(emp1obj);
        
        Employee emp2obj = (Employee)ctx.getBean("emp2");
        System.out.println(emp2obj);
        
        CompanyXYZ cmpobj = (CompanyXYZ)ctx.getBean("cmp");
        System.out.println(cmpobj);

       
    }
}
