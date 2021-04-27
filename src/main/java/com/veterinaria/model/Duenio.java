package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "duenios")
public class Duenio {
	@Id
	private int id_duenio;
	private String nombre;
	private String telefono;
	private String direccion;
	private String corre;

	public Duenio() {

	}

	public Duenio(int id_duenio, String nombre, String telefono, String direccion, String corre) {
		super();
		this.id_duenio = id_duenio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.corre = corre;
	}

	public int getId_duenio() {
		return id_duenio;
	}

	public void setId_duenio(int id_duenio) {
		this.id_duenio = id_duenio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

}
