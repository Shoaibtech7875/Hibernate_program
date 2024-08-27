package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Addreess student_Address=(Addreess)session.get(Addreess.class, 124); 
		
		session.close();
		factory.close();
	}

}
