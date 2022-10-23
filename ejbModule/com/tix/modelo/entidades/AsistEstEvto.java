package com.tix.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

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
 * Entity implementation class for Entity: AsistEstEvt
 *
 */
@Entity
@Table(name = "ASIST_EST_EVTOS")
@NamedQuery(name = "AsistEstEvto.findAll", query = "SELECT a FROM AsistEstEvto a")
public class AsistEstEvto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_AS_EST_EVTOS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_AS_EST_EVTOS")
	@Column(name = "ID_ASIST_EST_EVTO")
	private long idAsistEstEvto;

	@Column(length = 25)
	private String asistencia;

	private BigDecimal calificacion;

	@ManyToOne
	@JoinColumn(name = "ID_ESTUDIANTE")
	private Estudiante estudiante;

	@ManyToOne
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;

	public long getIdAsistEstEvto() {
		return idAsistEstEvto;
	}

	public void setIdAsistEstEvto(long idAsistEstEvto) {
		this.idAsistEstEvto = idAsistEstEvto;
	}

	public String getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(String asistencia) {
		this.asistencia = asistencia;
	}

	public BigDecimal getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(BigDecimal calificacion) {
		this.calificacion = calificacion;
	}

}
