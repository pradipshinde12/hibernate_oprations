package grp1.Student_Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.tka.entites.Student;

public class insert {
	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setId(11);
		s1.setName("pradip");
		s1.setMarks(99);

		Configuration cfg = new Configuration();
		cfg.configure("in/tka/config/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tc = s.beginTransaction();

		try {
			s.save(s1);
			tc.commit();
			

		} catch (Exception e)

		{
			tc.rollback();
			e.printStackTrace();

		}

	}
}
