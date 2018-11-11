package com.prm.prmrelistion;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Docter {
	@Id
	@GeneratedValue
	private Integer did;
	private String  docterName ;
	private String specalization;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDocterName() {
		return docterName;
	}
	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}
	public String getSpecalization() {
		return specalization;
	}
	public void setSpecalization(String specalization) {
		this.specalization = specalization;
	}
	

	
}