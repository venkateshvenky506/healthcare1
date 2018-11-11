package com.prm.prmrelistion.docterservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prm.prmrelistion.Docter;
import com.prm.prmrelistion.docterdao.DocterDao;

import antlr.DocBookCodeGenerator;

@Service
public class DocterService {
	@Autowired
	private DocterDao dao;
	public void savedocter(Docter doc){
		dao.save(doc);
	}
	public void savealldocter(List<Docter> doc){
		dao.saveAll(doc);
		
	}
	
	
	

}
