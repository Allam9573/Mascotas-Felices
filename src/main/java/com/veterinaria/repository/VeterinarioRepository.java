package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.model.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer>{
	
	public Veterinario findById(int id);

}
