package com.javaLearning;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    //from
	public static void fromClause(Session session){
		String hql = "from Student";
		Query query = session.createQuery(hql);
		query.setFirstResult(1);
		query.setMaxResults(4);
		List<Student> list = query.list();
		System.out.println("StudentName  \t StudentAge   \t StudentCourse");
		for(Student s :list){
			System.out.println(s.getStudentName()+"\t"+s.getStudentAge()
			+"\t"+s.getStudentCourse());
		}
		session.close();
		System.out.println();
		
	}
	
	//select
	public static void selectClause(Session session){
		String hql = "select s.studentName , s.studentCourse from Student s";
		Query query = session.createQuery(hql);
		List<Object[]> list = (List<Object[]>)query.list();
		for(Object[] obj :list){
			String name = (String)obj[0];
			String course = (String)obj[1];
			System.out.println("StudentName :"+name+" \tCourseEnrolled :"+course);
		}
	}
	
	//update
	public static void updateClause(Session session){
		session.beginTransaction();
		String hql ="update Student s set s.studentCity =:city where s.studentId=:id";
	    Query query = session.createQuery(hql);
	    query.setParameter("city", "Canberra");
	    query.setParameter("id", 3);
	    int i = query.executeUpdate();
	    session.getTransaction().commit();
	    System.out.println(i+" row affected");
	    
	}
	
	//delete
	public static void deleteClause(Session session){
		session.beginTransaction();
		String hql = "delete from Student s where s.studentId=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", 10);
		int i = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println(i+" row affected");
	}
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
	    Session session = factory.openSession();
	   // fromClause(session);
	   // selectClause(session);
	   // updateClause(session);
	    deleteClause(session);
	}

}


