package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the JUSTIFICACIONES database table.
 * 
 */
@Entity
@Table(name="JUSTIFICACIONES")
@NamedQuery(name="Justificacion.findAll", query="SELECT j FROM Justificacion j")
public class Justificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="JUSTIFICACIONES_IDJUSTIFICACION_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="JUSTIFICACIONES_IDJUSTIFICACION_GENERATOR")
	@Column(name="ID_JUSTIFICACION")
	private long idJustificacion;

	private String detalle;

	private Timestamp fechahora;

	@Column(name="INFO_ADJUNTA")
	private String infoAdjunta;

	//bi-directional many-to-one association to AccionJustificacione
	@OneToMany(mappedBy="justificacione")
	private List<AccionJustificacion> accionJustificaciones;

	//bi-directional many-to-one association to EstadosRecConJus
	@ManyToOne
	@JoinColumn(name="ID_ESTADOS_REC_CON_JUS")
	private EstadosRecConJus estadosRecConJus;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="ID_ESTUDIANTE")
	private Estudiante estudiante;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;

	public Justificacion() {
	}

	public long getIdJustificacion() {
		return this.idJustificacion;
	}

	public void setIdJustificacion(long idJustificacion) {
		this.idJustificacion = idJustificacion;
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

	public String getInfoAdjunta() {
		return this.infoAdjunta;
	}

	public void setInfoAdjunta(String infoAdjunta) {
		this.infoAdjunta = infoAdjunta;
	}

	public List<AccionJustificacion> getAccionJustificaciones() {
		return this.accionJustificaciones;
	}

	public void setAccionJustificaciones(List<AccionJustificacion> accionJustificaciones) {
		this.accionJustificaciones = accionJustificaciones;
	}

	public AccionJustificacion addAccionJustificacione(AccionJustificacion accionJustificacione) {
		getAccionJustificaciones().add(accionJustificacione);
		accionJustificacione.setJustificacione(this);

		return accionJustificacione;
	}

	public AccionJustificacion removeAccionJustificacione(AccionJustificacion accionJustificacione) {
		getAccionJustificaciones().remove(accionJustificacione);
		accionJustificacione.setJustificacione(null);

		return accionJustificacione;
	}

	public EstadosRecConJus getEstadosRecConJus() {
		return this.estadosRecConJus;
	}

	public void setEstadosRecConJus(EstadosRecConJus estadosRecConJus) {
		this.estadosRecConJus = estadosRecConJus;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}