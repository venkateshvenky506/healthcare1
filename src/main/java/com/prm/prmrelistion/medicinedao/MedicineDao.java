package com.prm.prmrelistion.medicinedao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Medicine;
@Repository
public interface MedicineDao  extends JpaRepository<Medicine, Long>{

}
