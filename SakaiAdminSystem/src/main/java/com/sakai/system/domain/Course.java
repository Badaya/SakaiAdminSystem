package com.sakai.system.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Course {
	
	
	@Id @GeneratedValue
	private long id;
	@NotEmpty
	private String title;
	@NotEmpty
	private String description;
	
	@NotEmpty
	private String subjectCode;
	
	
	private String category;
	

	private String subcategory;
	
	

	@OneToMany(mappedBy="course")
	private List<Section> sections = new ArrayList<Section>();
	
	public Course() {	}
	
	public Course(String title, String description, String subjectCode) {
		super();
		this.title = title;
		this.description = description;
		this.subjectCode = subjectCode;
	}
	
	public void addSection(Section section){
		sections.add(section);
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	

}
