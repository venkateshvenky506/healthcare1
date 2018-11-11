package com.prm.prmrelistion.complantservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prm.prmrelistion.Complants;
import com.prm.prmrelistion.Medication;
import com.prm.prmrelistion.complantdao.ComplaintDao;

@Service
public class ComplantService {
	@Autowired
	private ComplaintDao complantdao;
	
	public void savecomplant(Complants compl){
		List<Medication>medlist=compl.getMedicationlist();
		for(Medication med:medlist){
			med.setComplant(compl);
		}
		complantdao.save(compl);
	}
	public void saveallcomplants(List<Complants> compl){
		for(Complants comp:compl){
		List<Medication>midlist=comp.getMedicationlist();
		     for (Medication medication : midlist) {
		    	 medication.setComplant(comp);
				
			}
		}
		complantdao.saveAll(compl);
	}

	
	
	}


