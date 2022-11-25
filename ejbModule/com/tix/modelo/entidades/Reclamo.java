package com.tix.modelo.entidades;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Reclamos
 *
 */
@Entity
@Table(name = "RECLAMOS")
@NamedQuery(name = "Reclamo.findAll", query = "SELECT r FROM Reclamo r")
public class Reclamo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_RECL")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_RECL")
	@Column(name = "ID_RECLAMO")
	private long idReclamo;

	@Column(nullable = false, length = 100)
	private String asunto;

	@Column(length = 500)
	private String detalle;

	@Column(nullable = false)
	private Timestamp fechahora;

	@Column(name = "TIPO_RECL", nullable = false, length = 25)
	private String tipoRecl;

	@Column(name = "NOM_EVENTO", length = 100)
	private String nomEvento;

	@Column(name = "NOM_ACTIVIDAD", length = 100)
	private String nomActividad;

	private int semestre;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(length = 60)
	private String docente;

	private int creditos;

	@OneToMany(mappedBy = "reclamo")
	private List<AccionReclamo> accionReclamos;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADOS_REC_CON_JUS")
	private EstadoRecConJus estadoRecConJus;

	@ManyToOne
	@JoinColumn(name = "ID_ESTUDIANTE")
	private Estudiante estudiante;

	public long getIdReclamo() {
		return idReclamo;
	}

	public void setIdReclamo(long idReclamo) {
		this.idReclamo = idReclamo;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
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

	public String getTipoRecl() {
		return tipoRecl;
	}

	public void setTipoRecl(String tipoRecl) {
		this.tipoRecl = tipoRecl;
	}

	public String getNomEvento() {
		return nomEvento;
	}

	public void setNomEvento(String nomEvento) {
		this.nomEvento = nomEvento;
	}

	public String getNomActividad() {
		return nomActividad;
	}

	public void setNomActividad(String nomActividad) {
		this.nomActividad = nomActividad;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "ID: " + idReclamo + '\n'
				+ "Estado: " + estadoRecConJus.getNombre() + '\n'
				+ "Asunto: " + asunto + '\n' 
				+ "Detalle: " + detalle + '\n'
				+ "Estudiante: " + estudiante.getNombre1() + " " + estudiante.getApellido1() + '\n'
				+ "Nombre Actividad: " + nomActividad + '\n'
				+ "Nombre Evento: " + nomEvento + '\n'
				+ "Créditos: " + creditos + '\n'
				+ "Semestre: " + semestre + '\n'
				+ "Fecha: " + fecha + '\n'
				+ "Docente: " + docente;
	}
	
	
	
	

}
