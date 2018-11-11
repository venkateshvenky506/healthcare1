package com.prm.prmrelistion.complantdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Complants;
@Repository
public interface ComplaintDao extends JpaRepository<Complants, Long> {

}
