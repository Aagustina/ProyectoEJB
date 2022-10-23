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
 * Entity implementation class for Entity: TipoEvento
 *
 */
@Entity
@Table(name = "TIPOS_EVENTOS")
@NamedQuery(name = "TipoEvento.findAll", query = "SELECT t FROM TipoEvento t")
public class TipoEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_TPO_EVTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_TPO_EVTO")
	@Column(name = "ID_TIPO_EVENTO")
	private long idTipoEvento;

	@Column(nullable = false, length = 100, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "tipoEvento")
	private List<Evento> eventos;

	public long getIdTipoEvento() {
		return idTipoEvento;
	}

	public void setIdTipoEvento(long idTipoEvento) {
		this.idTipoEvento = idTipoEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
