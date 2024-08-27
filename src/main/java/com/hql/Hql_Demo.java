package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.tut.Addreess;

public class Hql_Demo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		String query = "from Addreess where id=122";

		Query query2 = session.createQuery(query);

		List<Addreess> list = query2.list();
		for (Addreess addreess : list) {
			System.out.println(addreess.getName());
			System.out.println("----------------------------------------------------");
			
			Transaction txTransaction = session.beginTransaction();
			Query q1=session.createQuery("update Addreess set city=:c where name=:n");
			q1.setParameter("c", "mumbai");
			q1.setParameter("n", "arhan");
			
			int r=q1.executeUpdate();
			System.out.println("Deleted Successfully :"+r);

			txTransaction.commit();
			factory.close();
			session.close();

			/*
			 * Query q =
			 * session.createQuery("delete from Addreess session where session.city=:c ");
			 * q.setParameter("c", "delhi");
			 * 
			 * int r = q.executeUpdate(); System.out.println("Detele");
			 * System.out.println(r);
			 */
			

			

		}

	}

}
