package com.prm.prmrelistion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Medicine {
	private Long meid;
	private String name;
	private String description;
	@Id
	@GeneratedValue
	public Long getMeid() {
		return meid;
	}
	public void setMeid(Long meid) {
		this.meid = meid;
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
