package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("started");
		// SessionFactory fectory=new Configuration().configure().buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure(); 
		SessionFactory factory = cfg.buildSessionFactory();
		// System.out.println(factory);
//    	System.out.println(factory.isClosed());
//    	System.out.println(" problem solve ");
		Students st = new Students();
	
		st.setName("sahil");
		st.setCity("mumbai");
		st.setAddress("mumbra maharashtra");
		
		Students st1 = new Students();
		
		st1.setName("ahmad");
		st1.setCity("delhi");
		st1.setAddress("delhi jama musjid");
		

		// System.out.println(st);
		Address ad = new Address();
		ad.setIdAddress(105);
		ad.setName("shoaib");
		ad.setStreet("street1");
		ad.setIsopen(true);
		ad.setX(234.54);
		ad.setAddedDate(new Date());
		
		Address ad1 = new Address();
		ad1.setIdAddress(106);
		ad1.setName("arhaan");
		ad1.setStreet("street2");
		ad1.setIsopen(true);
		ad1.setX(232.54);
		ad1.setAddedDate(new Date());
		

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(st);
		session.save(st1);
		session.save(ad);
		session.save(ad1);
		transaction.commit();
		factory.close();
		session.close();
		System.out.println(" Program Done");

	}

}
