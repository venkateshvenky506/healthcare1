package com.prm.prmrelistion;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Medication {
	private Integer mid;
	private String howToUse;
	private Integer quentity;
	private Integer durestion;
	private Complants complant;
   private  Medicine  medicine;
   @ManyToOne
   @JoinColumn(name="fkmid")
	public Medicine getMedicine() {
	return medicine;
}
public void setMedicine(Medicine medicine) {
	this.medicine = medicine;
}
	@ManyToOne
	@JoinColumn(name="fkcid")
	public Complants getComplant() {
		return complant;
	}
	public void setComplant(Complants complant) {
		this.complant = complant;
	}
	@Id
	@GeneratedValue
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getHowToUse() {
		return howToUse;
	}
	public void setHowToUse(String howToUse) {
		this.howToUse = howToUse;
	}
	public Integer getQuentity() {
		return quentity;
	}
	public void setQuentity(Integer quentity) {
		this.quentity = quentity;
	}
	public Integer getDurestion() {
		return durestion;
	}
	public void setDurestion(Integer durestion) {
		this.durestion = durestion;
	}
	

}
