package com.ashish.excelr2026javacoremaven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.excelr2026javacoremaven.entity.Student;
public class AppForDelete {

	


	    public static void main( String[] args )
	    {
	    	Configuration cfg=new Configuration();
	    	cfg.configure();
	    	SessionFactory factory=cfg.buildSessionFactory();


	    	Session session1=factory.openSession();
	    	Transaction tx=session1.beginTransaction();
	    	
	    	Student s1 = session1.get(Student.class, 1);
	    	session1.remove(s1);
	    	
	    	tx.commit();
	    	session1.close();
	    	factory.close();
	    	System.out.println("All resources closed.");
	    	
	    	
	    	
	    	

	    }
	

}