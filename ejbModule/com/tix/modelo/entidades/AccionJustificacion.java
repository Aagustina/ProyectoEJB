package com.tix.modelo.entidades;

import java.io.Serializable;
import java.sql.Timestamp;

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
 * Entity implementation class for Entity: Accion_Justificacion
 *
 */
@Entity
@Table(name = "ACCION_JUSTIFICACIONES")
@NamedQuery(name = "AccionJustificacion.findAll", query = "SELECT a FROM AccionJustificacion a")
public class AccionJustificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_ACC_JUSTF")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_ACC_JUSTF")
	@Column(name = "ID_ACC_JUSTIFICACION")
	private long idAccJustificacion;

	@Column(length = 500)
	private String detalle;

	@Column(nullable = false)
	private Timestamp fechahora;
	
	@ManyToOne
	@JoinColumn(name="ID_ANALISTA")
	private Analista analista;

	@ManyToOne
	@JoinColumn(name="ID_JUSTIFICACION")
	private Justificacion justificacion;

	public long getIdAccJustificacion() {
		return idAccJustificacion;
	}

	public void setIdAccJustificacion(long idAccJustificacion) {
		this.idAccJustificacion = idAccJustificacion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Timestamp getFechahora() {
		return fechahora;
	}

	public void setFechahora(Timestamp fechahora) {
		this.fechahora = fechahora;
	}

}
