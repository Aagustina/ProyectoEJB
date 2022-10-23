package com.tix.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Localidad
 *
 */
@Entity
@Table(name = "LOCALIDADES")
@NamedQuery(name = "Localidad.findAll", query = "SELECT l FROM Localidad l")

public class Localidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_LOC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_LOC")
	@Column(name = "ID_LOCALIDAD")
	private long idLocalidad;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "ID_DEPARTAMENTO", nullable = false)
	private Departamento departamento;
	
	@OneToMany(mappedBy="localidad")
	private List<Usuario> usuarios;

	public long getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
