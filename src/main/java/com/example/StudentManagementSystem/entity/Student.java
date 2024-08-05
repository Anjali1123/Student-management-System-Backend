package com.example.StudentManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String name ;
	private String rollno ;
	private String mark;
	
	public Student(int id, String name, String rollno, String mark) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.mark = mark;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", rollno=" + rollno + ", mark=" + mark + "]";
	}

	
	
	
	
	

}
