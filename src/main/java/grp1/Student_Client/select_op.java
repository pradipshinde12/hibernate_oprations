package grp1.Student_Client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.tka.entites.Student;

public class select_op {
	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("in/tka/config/hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tc = s.beginTransaction();
		
		

		try {
			Student s1= s.get(Student.class, 1);
			
			if(s1!=null)
			{
				System.err.println(s1.getId());
				System.out.println(s1.getName());
				System.out.println(s1.getMarks());
			}
			else
			{
				System.out.println("student not found");
			}
			

		} catch (Exception e)

		{
			tc.rollback();
			e.printStackTrace();

		}

	}
}
