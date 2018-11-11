package com.prm.prmrelistion.vistorservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prm.prmrelistion.Vistor;
import com.prm.prmrelistion.vistordao.VistorDao;

@Service
public class VistorService {
	@Autowired
	private VistorDao vistordao;
	public void savevistor(Vistor vistor){
		vistordao.save(vistor);
	}
	public void saveallvistors(List<Vistor> vistor){
		vistordao.saveAll(vistor);
	}

}
