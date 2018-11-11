package com.prm.prmrelistion.medicineservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prm.prmrelistion.Medicine;
import com.prm.prmrelistion.medicinedao.MedicineDao;

@Service
public class MedicineService {
	@Autowired
	private MedicineDao mdao;
	public void savemedicine(Medicine med){
		mdao.save(med);
	}
	public void saveallmedicine(List<Medicine> med){
		mdao.saveAll(med);
	}
	

}
