package com.tut;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("started");
		// SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// System.out.println(factory);
//    	System.out.println(factory.isClosed());
//    	System.out.println(" problem solve ");
		Addreess addreess = new Addreess();
		addreess.setId(129);
		addreess.setName("Adil noor");
		addreess.setCity("delhi");

		System.out.println(addreess);

		Addreess addreess1 = new Addreess();
		addreess1.setId(128);
		addreess1.setName("arhan");
		addreess1.setCity("lucknow");

		System.out.println(addreess1);

		Addreess addreess11 = new Addreess();
		addreess11.setId(126);
		addreess11.setName("Sameer siddiqui");
		addreess11.setCity("delhi");

		System.out.println(addreess11); 

		Addreess addreess111 = new Addreess();
		addreess111.setId(120);
		addreess111.setName("Shaoib siddiqui");
		addreess111.setCity("lucknow");

		System.out.println(addreess111);

		Student_Address student_Address = new Student_Address();
		student_Address.setStreet("street1");
		student_Address.setCity("lucknow");
		student_Address.setX(1234.22);
		student_Address.setAddeDate(new Date(0));
		student_Address.setOpen(true);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(addreess111);
		session.save(student_Address);
		session.save(addreess11);
		session.save(addreess1);
		session.save(addreess);
		transaction.commit();
		session.close();
		System.out.println("Done");
	}

}