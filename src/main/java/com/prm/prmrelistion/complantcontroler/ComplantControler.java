package com.prm.prmrelistion.complantcontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Complants;
import com.prm.prmrelistion.complantservice.ComplantService;

@RestController
@RequestMapping("Complant")
public class ComplantControler {
	@Autowired
	private ComplantService complsarvice;
	@PostMapping("/save")
	public void savecomplant(@RequestBody Complants compl){
		complsarvice.savecomplant(compl);
	}
	@PostMapping("/saveall")
	public void saveallcomplant(@RequestBody List<Complants> compl){
		complsarvice.saveallcomplants(compl);
		
	}

}
