package com.veterinaria.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.model.Veterinario;
import com.veterinaria.repository.VeterinarioRepository;

@Service
public class ServiceVeterinario {
	
	@Autowired
	VeterinarioRepository veterinarioRepository;
	
	public void crearVeterinario(Veterinario veterinario) {
		this.veterinarioRepository.save(veterinario);
	}
	public List<Veterinario> listaVeterinarios(){
		return this.veterinarioRepository.findAll();
	}
	public Veterinario buscarVeterinario(int id) {
		return this.veterinarioRepository.findById(id);
	}
}
