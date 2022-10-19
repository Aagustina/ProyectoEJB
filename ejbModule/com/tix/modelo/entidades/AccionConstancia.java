package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ACCION_CONSTANCIAS database table.
 * 
 */
@Entity
@Table(name="ACCION_CONSTANCIAS")
@NamedQuery(name="AccionConstancia.findAll", query="SELECT a FROM AccionConstancia a")
public class AccionConstancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCION_CONSTANCIAS_IDACCCONSTANCIA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCION_CONSTANCIAS_IDACCCONSTANCIA_GENERATOR")
	@Column(name="ID_ACC_CONSTANCIA")
	private long idAccConstancia;

	private String detalle;

	private Timestamp fechahora;

	//bi-directional many-to-one association to Analista
	@ManyToOne
	@JoinColumn(name="ID_ANALISTA")
	private Analista analista;

	//bi-directional many-to-one association to Constancia
	@ManyToOne
	@JoinColumn(name="ID_CONSTANCIA")
	private Constancia constancia;

	public AccionConstancia() {
	}

	public long getIdAccConstancia() {
		return this.idAccConstancia;
	}

	public void setIdAccConstancia(long idAccConstancia) {
		this.idAccConstancia = idAccConstancia;
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

	public Constancia getConstancia() {
		return this.constancia;
	}

	public void setConstancia(Constancia constancia) {
		this.constancia = constancia;
	}

}