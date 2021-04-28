package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recetas")
public class Receta {

	@Id
	private int idReceta;
	private String nombreMedicamento;
	private double precio;
	private int dosis;

	public Receta() {

	}

	public Receta(int idReceta, String nombreMedicamento, double precio, int dosis) {
		super();
		this.idReceta = idReceta;
		this.nombreMedicamento = nombreMedicamento;
		this.precio = precio;
		this.dosis = dosis;
	}

	public int getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

}
