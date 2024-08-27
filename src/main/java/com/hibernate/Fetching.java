package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetching {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
	Students students=(Students)session.load( Students.class,2);
		System.out.println(students);
		 
		Address	ad=(Address)session.get(Address.class, 1);
		System.out.println(ad.getName()+":"+ad.getStreet());
		
		
		session.close();
		factory.close();

	}

}
