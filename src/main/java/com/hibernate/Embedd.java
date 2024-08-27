package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Embedd {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Student student = new Student();
        student.setId(1231);
        student.setName("Shoaib");
        student.setCity("delhi");
        
        Certifucate certifucate = new Certifucate(); // corrected the class name
        certifucate.setCoures("BCA");
        certifucate.setDuration("3 years");
        student.setCert(certifucate);

        
        Student student1 = new Student();
        student1.setId(1243);
        student1.setName("Arhaan");
        student1.setCity("delhi islamabad");
        
       

        Certifucate certificate1 = new Certifucate(); // corrected the class name
        certificate1.setCoures("BSC IT");
        certificate1.setDuration("2 years");
        student1.setCert(certificate1);

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

       session.persist(student);
       session.persist(student1);
        tx.commit();
        session.close();
        factory.close();
    }
}
