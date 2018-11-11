package com.prm.prmrelistion.patientserivces;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prm.prmrelistion.Patients;
import com.prm.prmrelistion.dao.PatientsDao;
@Service
public class PatientSerivces {
	@Autowired
	private PatientsDao patientdao;
	 public void save(Patients p){
		 patientdao.save(p); 
	 }
	 public void saveall(List<Patients> p){
		 patientdao.saveAll(p);
	 }

	 public List<Object[]>findypatentmedicine(String medicinename){
	      return  patientdao.findypatentmedicine(medicinename);
	 }
	 public List<Object[]> getbydeseasesname(String deseasesname){
		return patientdao.getbydeseasesname(deseasesname);
	 }
	 public List<Object> getbypatientname(String patientname){
		return  patientdao.getbypatientname(patientname);
	 }
	
	public List<Patients> getallpatientdata(){
		return patientdao.findAll();
	}
	public Patients getpatientid(Long pid){
		return patientdao.findById(pid).get();
	}
	
	public void deletepatient(Long pid){
		patientdao.deleteById(pid);

	}
	

}
