package com.tix.modelo.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Estudiante
 *
 */
@Entity
@Table(name = "ESTUDIANTES")
@NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e")
@PrimaryKeyJoinColumn(name = "ID_ESTUDIANTE")

public class Estudiante extends Usuario {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private int generacion;

	@OneToMany(mappedBy = "estudiante")
	private List<AsistEstEvto> asistEstEvtos;

	@OneToMany(mappedBy = "estudiante")
	private List<Constancia> constancias;

	@OneToMany(mappedBy = "estudiante")
	private List<Justificacion> justificaciones;

	@OneToMany(mappedBy = "estudiante")
	private List<Reclamo> reclamos;

	public int getGeneracion() {
		return generacion;
	}

	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}

}
