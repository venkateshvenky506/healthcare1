package com.prm.prmrelistion.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Patients;
@Repository
public interface PatientsDao extends JpaRepository<Patients, Long> {
	@Query("select d.docterName,p.patientName,di.name "
			+ "from Medication m join m. medicine me "
			+ "join m.complant c join c.vistor v "
			+ " join c.diseaseslist di join v.appointment a "
			+ "join v.docter d join a.patient p where me.name=?1")
	public List<Object[]>findypatentmedicine(String medicinename);

	@Query("select dis.name,p.patientName "
			+ "from Complants c join c.diseaseslist dis join "
			+ "c.vistor "
			+ "v join v.appointment a join "
			+ " a.patient p where dis.name=?1")
 public List<Object[]> getbydeseasesname(String desesasesname);
 
  @Query("select d.docterName from  Vistor v join v.docter d "
  		+ "join v.appointment a "
  		+ " join a.patient p where p.patientName=?1")
 public List<Object> getbypatientname(String patientname);
 
}
