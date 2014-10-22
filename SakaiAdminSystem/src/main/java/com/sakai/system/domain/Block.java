package com.sakai.system.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Block {
	
	@Id
	@GeneratedValue
	private long blockId;
	
	private String title;
	
	private String description;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date endDate;
	
	@OneToMany(mappedBy="block",fetch=FetchType.EAGER)
	List<Section> listSection = new ArrayList<Section>();
	
	public Block(){}
		
	 
	 public Block(long blockId, String title, Date startDate, Date endDate) {
		super();
		this.blockId = blockId;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}





	public void addSection(Section section){
		 listSection.add(section);
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

	public List<Section> getListSection() {
		return listSection;
	}

	public void setListSection(List<Section> listSection) {
		this.listSection = listSection;
	}
	
	

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Block [title=" + title + ", description=" + description + "]";
	}


	public long getBlockId() {
		return blockId;
	}


	public void setBlockId(long blockId) {
		this.blockId = blockId;
	}
	 
	 
	
	
}
