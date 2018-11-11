package com.prm.prmrelistion;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Complants {
	private Long cid;
	private String discrption;
	private Vistor vistor;
	private List<Diseases> diseaseslist;
	private List<Medication> medicationlist;
	@OneToMany(mappedBy="complant",cascade=CascadeType.ALL)
	public List<Medication> getMedicationlist() {
		return medicationlist;
	}
	public void setMedicationlist(List<Medication> medicationlist) {
		this.medicationlist = medicationlist;
	}
	@ManyToMany
	@JoinTable(
			name="complaint_disease",
			joinColumns={@JoinColumn(name="cid")},
			inverseJoinColumns={@JoinColumn(name="disid")}
	)
	public List<Diseases> getDiseaseslist() {
		return diseaseslist;
	}
	public void setDiseaseslist(List<Diseases> diseaseslist) {
		this.diseaseslist = diseaseslist;
	}
	@ManyToOne
	@JoinColumn(name="fkvid")
	public Vistor getVistor() {
		return vistor;
	}
	@Id
	@GeneratedValue
	  public Long getCid() {
			return cid;
		}
		public void setCid(Long cid) {
				this.cid = cid;
		} 

	public String getDiscrption() {
		return discrption;
	}
	public void setDiscrption(String discrption) {
		this.discrption = discrption;
	}
	public void setVistor(Vistor vistor) {
		this.vistor = vistor;
	}
	


}
