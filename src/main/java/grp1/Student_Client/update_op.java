package grp1.Student_Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.tka.entites.Student;

public class update_op {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("in/tka/config/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tc = s.beginTransaction();

		try {
		Student s1=	s.get(Student.class, 1);
		s1.setName("abhi");
			
			s.update(s1);
			tc.commit();
			
			System.out.println(" the data updated success");
			

		} catch (Exception e)

		{
			tc.rollback();
			e.printStackTrace();

		}

	}
}
