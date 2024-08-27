package Onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//		Questions Q1=new Questions();
//		Q1.setQuestion("What is big data");
//		
//		Answer1 A1=new Answer1();
//		A1.setAnswer("big data is larg and complex data we con not esayly store ");
//		A1.setQuestions(Q1);	
//		Answer1 A2=new Answer1();
//		A2.setAnswer("big data is  sets are so voluminous that traditional data processing software just can't manage them ");
//		A2.setQuestions(Q1);
//		Answer1 A3=new Answer1();
//		A3.setAnswer("that traditional data processing software just can't manage them ");
//		A3.setQuestions(Q1);
//		List<Answer1> list=new ArrayList<Answer1>();
//		list.add(A1);
//		list.add(A2);
//		list.add(A3);
//		Q1.setAnswers(list);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		session.persist(Q1);
//		session.persist(A1);
//		session.persist(A2);
//		session.persist(A3);
		Questions q1 = (Questions) session.get(Questions.class, 4);
		/*System.out.println(q1.getQuestion());
		for (Answer1 a : q1.getAnswers()) {
			System.out.println(a.getAnswer());*/
		System.out.println(q1.getId());
		System.out.println(q1.getQuestion());
		tx.commit();
		
		session.close();
		factory.close();
		}
		
	}
    

