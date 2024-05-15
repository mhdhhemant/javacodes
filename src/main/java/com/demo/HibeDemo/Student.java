package com.demo.HibeDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int rollno;
	private String name;
	private String emailid;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Student(int rollno, String name, String emailid) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", emailid=" + emailid + "]";
	}
	
	
}
