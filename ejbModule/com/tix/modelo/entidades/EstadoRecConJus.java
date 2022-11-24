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
 * Entity implementation class for Entity: EstadoRecConJus
 *
 */
@Entity
@Table(name = "ESTADOS_REC_CON_JUS")
@NamedQuery(name = "EstadoRecConJus.findAll", query = "SELECT e FROM EstadoRecConJus e")
public class EstadoRecConJus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_EST_RCJ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_EST_RCJ")
	@Column(name = "ID_ESTADOS_REC_CON_JUS")
	private long idEstadosRecConJus;

	@Column(nullable = false)
	private int estado;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "estadoRecConJus")
	private List<Constancia> constancias;

	@OneToMany(mappedBy = "estadoRecConJus")
	private List<Justificacion> justificaciones;

	@OneToMany(mappedBy = "estadoRecConJus")
	private List<Reclamo> reclamos;

	public long getIdEstadosRecConJus() {
		return idEstadosRecConJus;
	}

	public void setIdEstadosRecConJus(long idEstadosRecConJus) {
		this.idEstadosRecConJus = idEstadosRecConJus;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
