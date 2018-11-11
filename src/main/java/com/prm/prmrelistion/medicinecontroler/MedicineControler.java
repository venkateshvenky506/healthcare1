package com.prm.prmrelistion.medicinecontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Medicine;
import com.prm.prmrelistion.medicinedao.MedicineDao;
import com.prm.prmrelistion.medicineservice.MedicineService;

@RestController
@RequestMapping("Medicine")
public class MedicineControler {
	@Autowired
	
	private MedicineService meds;
	@PostMapping("/save")
	public void savemedicine(@RequestBody Medicine med){
		meds.savemedicine(med);
	}
	@PostMapping("/saveall")
	public void saveallmedicine(@RequestBody List<Medicine> med){
		meds.saveallmedicine(med);
	}
	

}
