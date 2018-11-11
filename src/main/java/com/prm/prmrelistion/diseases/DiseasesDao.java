package com.prm.prmrelistion.diseases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Diseases;
@Repository
public interface DiseasesDao  extends JpaRepository<Diseases, Long>{

}
