package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "idMascota")
public class Mascota {
	@Id
	private int id;
	private String nombre;
	

}
