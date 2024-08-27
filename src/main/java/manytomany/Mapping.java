package manytomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Emplooye e1=new Emplooye();
		Emplooye e2=new Emplooye();
		
		e1.setEmplooyeid(12);
		e1.setEmplooyename("shaoib");
		
		e2.setEmplooyeid(13);
		e2.setEmplooyename("Aadil");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setProjectId(111);
		p1.setProjectname("labrary manegment system");
		
		p2.setProjectId(112);
		p2.setProjectname(" i am studying hibernat");
		
		List<Emplooye> list=new ArrayList<Emplooye>();
		List<Project> list2=new ArrayList<Project>();
		
		list.add(e1);
		list.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p1.setEmplooyes(list);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
	}

}
