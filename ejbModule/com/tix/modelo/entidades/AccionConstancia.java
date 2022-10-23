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
 * Entity implementation class for Entity: AccionConstancia
 *
 */
@Entity
@Table(name = "ACCION_CONSTANCIAS")
@NamedQuery(name = "AccionConstancia.findAll", query = "SELECT a FROM AccionConstancia a")
public class AccionConstancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_ACC_CONST")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_ACC_CONST")
	@Column(name = "ID_ACC_CONSTANCIA")
	private long idAccConstancia;

	@ManyToOne
	@JoinColumn(name = "ID_ANALISTA")
	private Analista analista;

	@ManyToOne
	@JoinColumn(name = "ID_CONSTANCIA")
	private Constancia constancia;

	@Column(length = 500)
	private String detalle;

	@Column(nullable = false)
	private Timestamp fechahora;

}
