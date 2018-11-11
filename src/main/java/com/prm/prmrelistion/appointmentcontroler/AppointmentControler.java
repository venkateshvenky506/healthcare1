package com.prm.prmrelistion.appointmentcontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prm.prmrelistion.Appointment;
import com.prm.prmrelistion.appointmentserivice.AppointmentSerivice;

@RestController
@RequestMapping("Appointment")
public class AppointmentControler {
	@Autowired
	private AppointmentSerivice appointservice;
	@PostMapping("/save")
	public void saveappointment(@RequestBody Appointment appoint){
		appointservice.saveappointment(appoint);
	}
	@RequestMapping("/saveall")
	public void saveallappointments(@RequestBody List<Appointment> appoint){
		appointservice.saveallappointments(appoint);
	}

}
