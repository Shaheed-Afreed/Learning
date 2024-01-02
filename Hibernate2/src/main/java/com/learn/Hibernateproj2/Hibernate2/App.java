package com.learn.Hibernateproj2.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static  void main( String[] args )
    {
    Configuration cfg= new Configuration();
    cfg.configure();
  SessionFactory factory = cfg.buildSessionFactory();
  Session session=factory.openSession();
  Transaction tr=session.beginTransaction();
 Student st=new Student(1,"shaheed",45);
  session.save(st);
  tr.commit();
  
        System.out.println( "student object is created" );
    }
}
