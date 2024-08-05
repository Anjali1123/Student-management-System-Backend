package com.example.StudentManagementSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.SessionFactoryBuilder;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentManagementSystem.entity.Student;


@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;
	
	public String InsertData(Student e) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(e);
		session. getTransaction().commit();
		session.close();
		
		return " Record is insert";
	}

	public List<Student> getAllData() {
		
		Session session = factory.openSession();
		session.beginTransaction();
		String hqlQuery = "from Student";
		
		Query<Student>query = session.createQuery(hqlQuery,Student.class);
		List<Student> list = query.list();
		session.getTransaction().commit();
		session.close();
		return list;
	}

	public String DeleteData(int id) {
		Session session = factory.openSession();
		session.beginTransaction();
		Student s = session.get(Student.class,id);
		session.remove(s);
		return "record is delete";
	}

	
	public String UpdateData(int id, Student s) {
        Session session = factory.openSession();
        session.beginTransaction();
        Student s1 = session.get(Student.class, id);
        
            s1.setMark(s.getMark());
            s1.setName(s.getName());
            s1.setRollno(s.getRollno());
            session.update(s1);
            session.getTransaction().commit();
            session.close();
            return "Record updated";
        }
	public Student GetData(int id) {
		Session session = factory.openSession();
		session.beginTransaction();
		String hqlQuery = "from Student where id =: myid";
		Query<Student> query = session.createQuery(hqlQuery,Student.class);
		query.setParameter("myid", id);
		Student msg = query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		
		return msg ;
	}
	
	
	

}
