package com.tix.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: GestAnalistaEvt
 *
 */
@Entity
@Table(name = "GEST_ANALISTA_EVTOS")
@NamedQuery(name = "GestAnalistaEvto.findAll", query = "SELECT g FROM GestAnalistaEvto g")
public class GestAnalistaEvto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_GE_AN_EVTOS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_GE_AN_EVTOS")
	@Column(name = "ID_GEST_ANALISTA_EVTO")
	private long idGestAnalistaEvto;

	@ManyToOne
	@JoinColumn(name = "ID_ANALISTA")
	private Analista analista;

	@ManyToOne
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;

	public long getIdGestAnalistaEvto() {
		return idGestAnalistaEvto;
	}

	public void setIdGestAnalistaEvto(long idGestAnalistaEvto) {
		this.idGestAnalistaEvto = idGestAnalistaEvto;
	}

}
