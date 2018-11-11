package com.prm.prmrelistion.disesasesserivces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prm.prmrelistion.Diseases;
import com.prm.prmrelistion.diseases.DiseasesDao;

@Service
public class DisesasesSerivce {
	@Autowired
	private DiseasesDao dao;
	
	public void save(Diseases dis){
	dao.save(dis);
}
	public void saveall(List<Diseases> dis){
		dao.saveAll(dis);
	}

}
