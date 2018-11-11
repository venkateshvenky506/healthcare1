package com.prm.prmrelistion.controler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Patients;
import com.prm.prmrelistion.dao.PatientsDao;
import com.prm.prmrelistion.patientserivces.PatientSerivces;
@RestController
@RequestMapping("Patients")
@CrossOrigin
public class PatientsControler {
	@Autowired
	private PatientSerivces patientserivces;
	@PostMapping("/save")
	public void save(@RequestBody Patients p){
		patientserivces .save(p); 
	 }
	@PostMapping("/saveall")
	 public void saveall(@RequestBody List<Patients> p){
		 patientserivces.saveall(p);
	 }
	@GetMapping("/getmedicinname/{name}")
	public List<Object[]>findypatentmedicine(@PathVariable(name="name") String medicinename){
		return patientserivces.findypatentmedicine(medicinename);
	}
	@GetMapping("/getdeasesname/{name}")
	public List<Object[]> getbydeseasesname(@PathVariable(name="name")String deseasesname){
		return patientserivces.getbydeseasesname(deseasesname);
	}
	@GetMapping("/patientname/{name}")
	public List<Object> getbypatientname(@PathVariable("name")String patientname){
		return patientserivces.getbypatientname(patientname);
	}
	@GetMapping("/get")
   public List<Patients> getallpatientdata(){
	   return patientserivces.getallpatientdata();
   }
	@GetMapping("/{id}")
	public Patients getpatientid(@PathVariable("id") Long pid){
		return patientserivces.getpatientid(pid);
	}
	@DeleteMapping("/delete/{id}")
	public void deletepatient(@PathVariable ("id") Long pid){
		patientserivces.deletepatient(pid);
		
	}


}
