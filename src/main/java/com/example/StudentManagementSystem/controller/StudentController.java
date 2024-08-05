package com.example.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/insert")
	public String insertData(@RequestBody Student e ) {
		String msg = service.InsertData(e);
		return msg;
		
	}
	@GetMapping("/getall")
	public List<Student> getAllData() {
		List<Student> list = service.getAllData();
		return list;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.DeleteData(id);
		return msg;
		
	}
	@PutMapping("/update/{id}")
	public String updateData(@PathVariable int id,@RequestBody Student s) {
		String msg = service.UpdateData(id, s);
		return msg;
		
	}
	
	@GetMapping("/get/{id}")
	public Student getData(@PathVariable int id) {
		Student msg = service.GetData(id);
		
		return msg;
		
	}
}