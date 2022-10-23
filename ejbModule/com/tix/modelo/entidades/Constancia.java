package com.tix.modelo.entidades;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Constancia
 *
 */
@Entity
@Table(name = "CONSTANCIAS")
@NamedQuery(name = "Constancia.findAll", query = "SELECT c FROM Constancia c")
public class Constancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_CONST")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_CONST")
	@Column(name = "ID_CONSTANCIA")
	private long idConstancia;

	@Column(nullable = false)
	private Timestamp fechahora;

	@Column(name = "INFO_ADJUNTA", length = 500)
	private String infoAdjunta;

	@OneToMany(mappedBy = "constancia")
	private List<AccionConstancia> accionConstancias;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADOS_REC_CON_JUS")
	private EstadoRecConJus estadoRecConJus;

	@ManyToOne
	@JoinColumn(name = "ID_ESTUDIANTE")
	private Estudiante estudiante;

	@ManyToOne
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_CONSTANCIA")
	private TipoConstancia tipoConstancia;

	public long getIdConstancia() {
		return idConstancia;
	}

	public void setIdConstancia(long idConstancia) {
		this.idConstancia = idConstancia;
	}

	public Timestamp getFechahora() {
		return fechahora;
	}

	public void setFechahora(Timestamp fechahora) {
		this.fechahora = fechahora;
	}

	public String getInfoAdjunta() {
		return infoAdjunta;
	}

	public void setInfoAdjunta(String infoAdjunta) {
		this.infoAdjunta = infoAdjunta;
	}

}
