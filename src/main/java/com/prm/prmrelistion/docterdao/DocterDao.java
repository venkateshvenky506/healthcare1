package com.prm.prmrelistion.docterdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Docter;
@Repository
public interface DocterDao extends JpaRepository<Docter, Long>{

}
