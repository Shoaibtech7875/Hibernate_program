package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		cfg.configure("onetomany/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Question Q1 = new Question();
		Q1.setQuestionId(123);
		Q1.setQuestion("What is java");

		Answer A1 = new Answer();
		A1.setAnswerId(321);
		A1.setAnswer(" java is programming language");
		Q1.setAnswer(A1);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// Your database operations
		session.persist(Q1);

		tx.commit();
		factory.close();
		session.close();
	}
}
