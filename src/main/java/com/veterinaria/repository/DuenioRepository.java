package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.model.Duenio;

public interface DuenioRepository extends JpaRepository<Duenio, Integer>{
	
	public Duenio findById(int id);

}
