package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.time.LocalDate;

@Entity
@Table(name = "mascotas")
public class Mascota {
	@Id
	private int idMascota;
	private String nombre;
	private String tipo;
	private LocalDate fechaNacimiento;
	
	@ManyToOne
	@JoinColumn(name="idDuenio")
	@JsonBackReference
	private Duenio duenio;
	
	public Mascota() {
		
	}

	public Mascota(int idMascota, String nombre, String tipo, LocalDate fechaNacimiento) {
		super();
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
