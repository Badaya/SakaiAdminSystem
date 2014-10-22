package com.sakai.system.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Section {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String title;
	
	@ManyToOne
	private Block block;
	
	@OneToOne
	private Teacher faculty;
	
	@ManyToOne
	private Course course;
	
	@ManyToMany
	@JoinTable(name = "student_section", joinColumns = {
	@JoinColumn(name = "section_id") }, inverseJoinColumns = { @JoinColumn(name = "student_id") })
	private List<Student> students = new ArrayList<Student>();
	
	private int numberOfStudents;
	
	public Section(){}
	
	public Section(String title, int numberOfStudents, Course course) {
		super();
		
		this.numberOfStudents = numberOfStudents;
		this.course = course;
		this.title = title;
		//course.addSection(this);
		//System.out.println("Section Added with course: " + course.getTitle());
	}

	
	public Section(String title, Teacher faculty, List<Student> students) {
		super();
		this.title = title;
		this.faculty = faculty;
		this.students = students;
		
	}
	
	public void addStudents(Student student){
		this.students.add(student);
		student.addSection(this);
	}
	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Teacher getFaculty() {
		return faculty;
	}


	public void setFaculty(Teacher faculty) {
		this.faculty = faculty;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	
	
}
