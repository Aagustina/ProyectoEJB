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
 * Entity implementation class for Entity: EstadoEvento
 *
 */
@Entity
@Table(name = "ESTADOS_EVENTOS")
@NamedQuery(name = "EstadoEvento.findAll", query = "SELECT e FROM EstadoEvento e")
public class EstadoEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_EST_EVTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_EST_EVTO")
	@Column(name = "ID_ESTADO_EVENTO")
	private long idEstadoEvento;

	@Column(nullable = false)
	private int estado;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "estadoEvento")
	private List<Evento> eventos;

	public long getIdEstadoEvento() {
		return idEstadoEvento;
	}

	public void setIdEstadoEvento(long idEstadoEvento) {
		this.idEstadoEvento = idEstadoEvento;
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

}
