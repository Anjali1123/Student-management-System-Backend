package com.example.StudentManagementSystem.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.StudentManagementSystem.dao.StudentDao;
import com.example.StudentManagementSystem.entity.Student;

@Service
public class StudentService {

	
	@Autowired
	StudentDao dao;
	
	
	public String InsertData(Student e) {
		String msg = dao.InsertData(e);
		return msg;
	}


	public List <Student>getAllData() {
		List <Student> list = dao.getAllData();
		return list;
	}


	public String DeleteData(int id) {
		String msg = dao.DeleteData(id);
		return msg;
	}


	public String UpdateData(int id,Student s) {
		String msg = dao.UpdateData(id, s);
		return msg;
	}


	public Student GetData(int id) {
		Student msg = dao.GetData(id);
		return msg;
	}

}
