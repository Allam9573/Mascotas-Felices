package com.veterinaria.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.veterinaria.model.Cita;
import com.veterinaria.model.Mascota;
import com.veterinaria.model.Veterinario;
import com.veterinaria.security.ServiceCita;
import com.veterinaria.security.ServiceDuenio;
import com.veterinaria.security.ServiceMascota;

@Controller
public class AppController {

	@Autowired
	ServiceCita serviceCita;
	@Autowired
	ServiceMascota serviceMascota;
	@Autowired
	ServiceDuenio serviceDuenio;

	@GetMapping({ "/", "/home" })
	public String home() {
		return "index";
	}

	@GetMapping("/misCitas")
	public String misCitas() {
		return "misCitas";
	}
	@GetMapping("/crearCita")
	public String nuevaCita() {
		return "nuevaCita";
	}
	// crear una cita

	@RequestMapping(value = "/crearCita", method = RequestMethod.POST)

	public String crearCita(@RequestParam(name = "idCita") int idCita, @RequestParam(name = "diagnostico") String diagnostico,
			@RequestParam(name = "valor") double valor,
			@RequestParam(name = "fecha") @DateTimeFormat(iso = ISO.DATE) LocalDate fecha,
			@RequestParam(name = "veterinario") Veterinario veterinario,
			@RequestParam(name = "mascota") Mascota mascota) {
		Cita cita = new Cita(idCita, diagnostico, valor, fecha, veterinario, mascota);
		this.serviceCita.crearCita(cita);
		return "nuevaCita";
	}

	// ver citas
	@RequestMapping(value = "/verCitas", method = RequestMethod.POST)
	public List<Cita> verCitas() {
		return this.serviceCita.listaCitas();
	}
}
