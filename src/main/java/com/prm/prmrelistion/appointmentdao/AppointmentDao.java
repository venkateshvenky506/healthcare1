package com.prm.prmrelistion.appointmentdao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prm.prmrelistion.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long> {
	

}
