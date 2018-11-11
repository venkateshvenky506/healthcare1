package com.prm.prmrelistion.vistorcontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Vistor;
import com.prm.prmrelistion.vistorservice.VistorService;

@RestController
@RequestMapping("Vistor")
public class VistorControler {
	@Autowired
	private VistorService vistorservice;
	@PostMapping("/save")
	public void savevistor(@RequestBody Vistor vistor){
		vistorservice.savevistor(vistor);
	}
	@PostMapping("/saveall")
	public void saveallvistors(@RequestBody List<Vistor> vistor){
		vistorservice.saveallvistors(vistor);
	}

}
