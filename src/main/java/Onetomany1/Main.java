package Onetomany1;

import java.util.ArrayList;
import java.util.List;

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
		
		Question q1=new Question();
		q1.setQuestionid(1232);
		q1.setQueston("what is java");
		
		Answer a1=new Answer();
		a1.setAnswerid(2134);
		a1.setAnswer("java is programming language");
		a1.setQuestion(q1);
		
		Answer a2=new Answer();
		a2.setAnswerid(2164);
		a2.setAnswer("with the help of creat softwere");
		a2.setQuestion(q1);
		
		Answer a3=new Answer();
		a3.setAnswerid(2135);
		a3.setAnswer("java is a diffrent type framworks");
		a3.setQuestion(q1);
		
		List<Answer> list=new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswers(list);
		
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	
	session.save(a1);
	session.save(a2);
	session.save(a3);
	session.save(q1);
	
	tx.commit();
	session.close();
	factory.close();
	}

}
