package com.tix.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Area
 *
 */
@Entity
@Table(name = "AREAS")
@NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a")

public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_AREAS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_AREAS")
	@Column(name = "ID_AREA")
	private long idArea;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "area")
	private List<Tutor> tutores;

	public long getIdArea() {
		return idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
