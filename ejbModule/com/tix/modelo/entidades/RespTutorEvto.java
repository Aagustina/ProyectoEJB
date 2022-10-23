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
 * Entity implementation class for Entity: RespTutorEvt
 *
 */
@Entity
@Table(name = "RESP_TUTOR_EVTOS")
@NamedQuery(name = "RespTutorEvto.findAll", query = "SELECT r FROM RespTutorEvto r")
public class RespTutorEvto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_TUT_EVTOS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_TUT_EVTOS")
	@Column(name = "ID_RESP_TUTOR_EVTO")
	private long idRespTutorEvto;

	@ManyToOne
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;

	@ManyToOne
	@JoinColumn(name = "ID_TUTOR")
	private Tutor tutor;

	public long getIdRespTutorEvto() {
		return idRespTutorEvto;
	}

	public void setIdRespTutorEvto(long idRespTutorEvto) {
		this.idRespTutorEvto = idRespTutorEvto;
	}

}
