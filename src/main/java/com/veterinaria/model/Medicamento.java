package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicamentos")
public class Medicamento {
	
	@Id
	private int idMedicamento;
	

}
