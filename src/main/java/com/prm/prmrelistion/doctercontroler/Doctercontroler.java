package com.prm.prmrelistion.doctercontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Docter;
import com.prm.prmrelistion.docterdao.DocterDao;
import com.prm.prmrelistion.docterservice.DocterService;

@RestController
@RequestMapping("Docter")
public class Doctercontroler {
	@Autowired
	private DocterService docs;
	
	@PostMapping("/save")
	public void savedocter(@RequestBody Docter doc){
		docs.savedocter(doc);
	}
	@PostMapping("/saveall")
	public void savealldocter(@RequestBody List<Docter> doc){
		docs.savealldocter(doc);
		
	}
	
	
	}


