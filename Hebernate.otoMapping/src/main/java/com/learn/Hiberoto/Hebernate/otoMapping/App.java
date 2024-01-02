package com.learn.Hiberoto.Hebernate.otoMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    private static final Bike bk3 = null;
	private static final Bike bk2 = null;
	private static final Bike bk1 = null;

	public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction tr=session.beginTransaction();
    	
    	Person p1=new Person();
    	Person p2=new Person();
    	Person p3=new Person();
    	
    	Bike bk1=new Bike(1234,"hero",125000,p1);
    	Bike bk2=new Bike(2233,"honda",145000,p2);
    	Bike bk3=new Bike(5678,"ktm",195000,p3);
    	
    	p1.setP_id(1);
    	p1.setP_name("shaheed");
    	p1.setP_age(22);
    	p1.setB(bk1);
    	
    	p2.setP_id(2);
    	p2.setP_name("azmal");
    	p2.setP_age(23);
    	p2.setB(bk2);
    	
    	p3.setP_id(3);
    	p3.setP_name("habeeb");
    	p3.setP_age(25);
    	p3.setB(bk3);	
    	session.save(p1);
    	session.save(p2);
    	session.save(p3);
    	session.save(bk1);
    	session.save(bk2);
    	session.save(bk3);
    	
    	tr.commit();
        System.out.println("objects are saved");
    }
}
