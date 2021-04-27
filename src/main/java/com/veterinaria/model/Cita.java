package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {
	@Id
	private int id_cita;
	private String diagnostico;
	private double valor;
	

}
