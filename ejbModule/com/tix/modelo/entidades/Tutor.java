package com.tix.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Tutor
 *
 */
@Entity
@Table(name = "TUTORES")
@NamedQuery(name = "Tutor.findAll", query = "SELECT t FROM Tutor t")
@PrimaryKeyJoinColumn(name = "ID_TUTOR")
public class Tutor extends Usuario {
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, length = 50)
	private String tipo;

	@ManyToOne
	@JoinColumn(name = "ID_AREA")
	private Area area;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
