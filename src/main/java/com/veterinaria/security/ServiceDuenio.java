package com.veterinaria.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.model.Duenio;
import com.veterinaria.repository.DuenioRepository;

@Service
public class ServiceDuenio {
	
	@Autowired
	DuenioRepository duenioRepository;
	
	public void crearDuenio(Duenio duenio) {
		this.duenioRepository.save(duenio);
	}
	
	public List<Duenio> listaDuenios(){
		return this.duenioRepository.findAll();
	}
	public Duenio buscarDuenio(int id) {
		return this.duenioRepository.findById(id);
	}
	

}
