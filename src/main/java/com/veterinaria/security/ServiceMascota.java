package com.veterinaria.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.model.Mascota;
import com.veterinaria.repository.MascotaRepository;

@Service
public class ServiceMascota {
	@Autowired
	MascotaRepository mascotaRepository;
	
	public void crearMascota(Mascota mascota) {
		this.mascotaRepository.save(mascota);
	}
	public List<Mascota> listaMascotas(){
		return this.mascotaRepository.findAll();
	}
	public Mascota buscarMascota(int id) {
		return this.mascotaRepository.findById(id);
	}
}
