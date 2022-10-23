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
 * Entity implementation class for Entity: Justificacion
 *
 */
@Entity
@Table(name = "JUSTIFICACIONES")
@NamedQuery(name = "Justificacion.findAll", query = "SELECT j FROM Justificacion j")
public class Justificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_JUSTF")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_JUSTF")
	@Column(name = "ID_JUSTIFICACION")
	private long idJustificacion;

	@Column(length = 500)
	private String detalle;

	@Column(nullable = false)
	private Timestamp fechahora;

	@Column(name = "INFO_ADJUNTA")
	private String infoAdjunta;

	@OneToMany(mappedBy = "justificacion")
	private List<AccionJustificacion> accionJustificaciones;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADOS_REC_CON_JUS")
	private EstadoRecConJus estadoRecConJus;

	@ManyToOne
	@JoinColumn(name = "ID_ESTUDIANTE")
	private Estudiante estudiante;

	@ManyToOne
	@JoinColumn(name = "ID_EVENTO")
	private Evento evento;

	public long getIdJustificacion() {
		return idJustificacion;
	}

	public void setIdJustificacion(long idJustificacion) {
		this.idJustificacion = idJustificacion;
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

	public String getInfoAdjunta() {
		return infoAdjunta;
	}

	public void setInfoAdjunta(String infoAdjunta) {
		this.infoAdjunta = infoAdjunta;
	}

}
