package com.prm.prmrelistion.appointmentserivice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prm.prmrelistion.Appointment;
import com.prm.prmrelistion.appointmentdao.AppointmentDao;

@Service
public class AppointmentSerivice {
	@Autowired
	private AppointmentDao appointdao;
	public void saveappointment(Appointment appoint){
		appointdao.save(appoint);
	}
	public void saveallappointments(List<Appointment> appoint){
		appointdao.saveAll(appoint);
	}

}
