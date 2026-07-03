package com.ashish.excelr2026javacoremaven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.excelr2026javacoremaven.entity.Student;
public class AppForLoad {

	


	    public static void main( String[] args )
	    {
	    	Configuration cfg=new Configuration();
	    	cfg.configure();
	    	SessionFactory factory=cfg.buildSessionFactory();


	    	Session session1=factory.openSession();
	    	
//	    	Student s1 = session1.load(Student.class, 1);
//	    	System.out.println("Hii");
//	    	
//	    	System.out.println(s1.getRno());
//	    	
//	    	System.out.println("Hello");
//	    	
//	    	System.out.println(s1.getPer());
	    	
	    	//if we pass anything which is not present in the table it throw exception -> ObjectNotFound
	    	
//	    	Student s2 = session1.load(Student.class, 12);
//	    	System.out.println(s2);
	    	
	    	session1.close();
	    	factory.close();
	    	System.out.println("All resources closed.");
	    	
	    	
	    	
	    	

	    }
	

}