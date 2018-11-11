package com.prm.prmrelistion.vistordao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Vistor;
@Repository
public interface VistorDao extends JpaRepository<Vistor, Long>{

}
