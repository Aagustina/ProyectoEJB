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
 * Entity implementation class for Entity: Evento
 *
 */
@Entity
@Table(name = "EVENTOS")
@NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_EVTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_EVTO")
	@Column(name = "ID_EVENTO")
	private long idEvento;

	@Column(name = "FECHAHORA_FIN", nullable = false)
	private Timestamp fechahoraFin;

	@Column(name = "FECHAHORA_INICIO", nullable = false)
	private Timestamp fechahoraInicio;

	@Column(length = 100)
	private String localizacion;

	@Column(nullable = false, length = 250)
	private String titulo;

	@OneToMany(mappedBy = "evento")
	private List<AsistEstEvto> asistEstEvtos;

	@OneToMany(mappedBy = "evento")
	private List<Constancia> constancias;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADO_EVENTO")
	private EstadoEvento estadoEvento;

	@ManyToOne
	@JoinColumn(name = "ID_ITR")
	private Itr itr;

	@ManyToOne
	@JoinColumn(name = "ID_MODALIDAD")
	private Modalidad modalidad;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_EVENTO")
	private TipoEvento tipoEvento;

	@OneToMany(mappedBy = "evento")
	private List<GestAnalistaEvto> gestAnalistaEvtos;

	@OneToMany(mappedBy = "evento")
	private List<Justificacion> justificaciones;

	@OneToMany(mappedBy = "evento")
	private List<RespTutorEvto> respTutorEvtos;

	public long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public Timestamp getFechahoraFin() {
		return fechahoraFin;
	}

	public void setFechahoraFin(Timestamp fechahoraFin) {
		this.fechahoraFin = fechahoraFin;
	}

	public Timestamp getFechahoraInicio() {
		return fechahoraInicio;
	}

	public void setFechahoraInicio(Timestamp fechahoraInicio) {
		this.fechahoraInicio = fechahoraInicio;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
