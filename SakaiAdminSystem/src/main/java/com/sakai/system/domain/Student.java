package com.sakai.system.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Student extends Person {
	
	@ManyToMany(mappedBy="students")
	private List<Section> sections= new ArrayList<Section>();

	@ManyToOne
	private Teacher advisor;
	
	
	private int rollNum;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, String phone, String email,
			Address address, UserCredentials user) {
		super(id, name, phone, email, address, user);
		// TODO Auto-generated constructor stub
	}
	
	public void addSection(Section section){
		sections.add(section);
	}
	
	public Teacher getAdvisor() {
		return advisor;
	}
	public void setAdvisor(Teacher advisor) {
		this.advisor = advisor;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	
	
}
