package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ACCION_RECLAMOS database table.
 * 
 */
@Entity
@Table(name="ACCION_RECLAMOS")
@NamedQuery(name="AccionReclamo.findAll", query="SELECT a FROM AccionReclamo a")
public class AccionReclamo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCION_RECLAMOS_IDACCRECLAMO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCION_RECLAMOS_IDACCRECLAMO_GENERATOR")
	@Column(name="ID_ACC_RECLAMO")
	private long idAccReclamo;

	private String detalle;

	private Timestamp fechahora;

	//bi-directional many-to-one association to Analista
	@ManyToOne
	@JoinColumn(name="ID_ANALISTA")
	private Analista analista;

	//bi-directional many-to-one association to Reclamo
	@ManyToOne
	@JoinColumn(name="ID_RECLAMO")
	private Reclamo reclamo;

	public AccionReclamo() {
	}

	public long getIdAccReclamo() {
		return this.idAccReclamo;
	}

	public void setIdAccReclamo(long idAccReclamo) {
		this.idAccReclamo = idAccReclamo;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Timestamp getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Timestamp fechahora) {
		this.fechahora = fechahora;
	}

	public Analista getAnalista() {
		return this.analista;
	}

	public void setAnalista(Analista analista) {
		this.analista = analista;
	}

	public Reclamo getReclamo() {
		return this.reclamo;
	}

	public void setReclamo(Reclamo reclamo) {
		this.reclamo = reclamo;
	}

}