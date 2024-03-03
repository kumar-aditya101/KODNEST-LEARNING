package com.learn.hibernate.HibernateProjectEx_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tr = session.beginTransaction();
    
    	Person pr1 = new Person(1,"Aditya",24);
    	Person pr2 = new Person(2,"Sonu",22);
    	Person pr3 = new Person(3, "Ayush",21);
    	
    	session.save(pr1);
    	session.save(pr2);
    	session.save(pr3);
    	tr.commit();
        System.out.println( "Person object is created and saved" );
        
        Transaction tr2 = session.beginTransaction();
        Bike bk1 = new Bike(1111,"Glamour",10000);
        Bike bk2 = new Bike(1002,"Apache RTR",15000);
        Bike bk3 = new Bike(1003,"Royal Enfield",200000);
        session.save(bk1);
        session.save(bk2);
        session.save(bk3);
        tr2.commit();
        System.out.println("Bike object is created and saved");
    }
}
