package com.prm.prmrelistion.diseasescontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Diseases;
import com.prm.prmrelistion.diseases.DiseasesDao;
import com.prm.prmrelistion.disesasesserivces.DisesasesSerivce;

@RestController
@RequestMapping("Diseases")
public class DiseasesControler {
	@Autowired
	private DisesasesSerivce disesseservice;
	@PostMapping("/save")
	public void save(@RequestBody Diseases dis){
		disesseservice.save(dis);
}
	@PostMapping("/saveall")
	public void saveall(@RequestBody List<Diseases> dis){
		disesseservice.saveall (dis);
	}
	
	
	
		
	

}
