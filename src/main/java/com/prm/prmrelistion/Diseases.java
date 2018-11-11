package com.prm.prmrelistion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Diseases {

	private String description;
	private String name;
	private Long disid;
	@Id
	@GeneratedValue
	public Long getDisid() {
		return disid;
	}
	public void setDisid(Long disid) {
		this.disid = disid;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

	


