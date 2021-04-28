package com.veterinaria.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "citas")
public class Cita {
	@Id
	private int idCita;
	private String diagnostico;
	private double valor;
	private LocalDate fecha;
	private int mascota;
	private int veterinario;

	public Cita() {

	}

	public Cita(int idCita, String diagnostico, double valor, LocalDate fecha, Veterinario veterinario, Mascota mascota) {
		super();
		this.idCita = idCita;
		this.diagnostico = diagnostico;
		this.valor = valor;
		this.fecha = fecha;
		this.mascota = mascota.getIdMascota();
		this.veterinario = veterinario.getIdVeterinario();
	}

	public int getIdCita() {
		return idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota.getIdMascota();
	}

	public int getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Mascota veterinario) {
		this.veterinario = veterinario.getIdMascota();
	}

	
	

}
