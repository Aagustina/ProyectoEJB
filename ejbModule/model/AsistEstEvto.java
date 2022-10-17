package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ASIST_EST_EVTOS database table.
 * 
 */
@Entity
@Table(name="ASIST_EST_EVTOS")
@NamedQuery(name="AsistEstEvto.findAll", query="SELECT a FROM AsistEstEvto a")
public class AsistEstEvto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ASIST_EST_EVTOS_IDASISTESTEVTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ASIST_EST_EVTOS_IDASISTESTEVTO_GENERATOR")
	@Column(name="ID_ASIST_EST_EVTO")
	private long idAsistEstEvto;

	private String asistencia;

	private BigDecimal calificacion;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="ID_ESTUDIANTE")
	private Estudiante estudiante;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;

	public AsistEstEvto() {
	}

	public long getIdAsistEstEvto() {
		return this.idAsistEstEvto;
	}

	public void setIdAsistEstEvto(long idAsistEstEvto) {
		this.idAsistEstEvto = idAsistEstEvto;
	}

	public String getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(String asistencia) {
		this.asistencia = asistencia;
	}

	public BigDecimal getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(BigDecimal calificacion) {
		this.calificacion = calificacion;
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