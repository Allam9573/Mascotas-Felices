package com.veterinaria.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinaria.repository.CitaRepository;
import com.veterinaria.model.Cita;
import java.util.List;

@Service
public class ServiceCita {

	@Autowired
	CitaRepository citaRepository;

	public void crearCita(Cita cita) {
		this.citaRepository.save(cita);
	}

	public List<Cita> listaCitas() {
		return this.citaRepository.findAll();
	}
	public Cita buscarCita(int id) {
		return this.citaRepository.findById(id);
	}
}
