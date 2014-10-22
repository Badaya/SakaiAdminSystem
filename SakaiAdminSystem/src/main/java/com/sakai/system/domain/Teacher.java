package com.sakai.system.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Teacher extends Person {
	
	
	@OneToOne(mappedBy="faculty")
	private Section section;
	
	@OneToMany(mappedBy="advisor")
	private List<Student> listStudent = new ArrayList<Student>();

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(long id, String name, String phone, String email,
			Address address, UserCredentials user) {
		super(id, name, phone, email, address, user);
		// TODO Auto-generated constructor stub
	}

		
	   
        public void addStudent(Student student){
	    	 listStudent.add(student);
	     }

	

		public List<Student> getListStudent() {
			return listStudent;
		}

		public void setListStudent(List<Student> listStudent) {
			this.listStudent = listStudent;
		}
	
        
        
}
