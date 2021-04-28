package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.model.Cita;

public interface CitaRepository extends JpaRepository<Cita, Integer>{
	
	public Cita findById(int id);

}
