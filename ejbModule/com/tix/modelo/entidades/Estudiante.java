package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ESTUDIANTES database table.
 * 
 */
@Entity
@Table(name="ESTUDIANTES")
@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e")
public class Estudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ESTUDIANTES_IDESTUDIANTE_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ESTUDIANTES_IDESTUDIANTE_GENERATOR")
	@Column(name="ID_ESTUDIANTE")
	private long idEstudiante;

	private BigDecimal generacion;

	//bi-directional many-to-one association to AsistEstEvto
	@OneToMany(mappedBy="estudiante")
	private List<AsistEstEvto> asistEstEvtos;

	//bi-directional many-to-one association to Constancia
	@OneToMany(mappedBy="estudiante")
	private List<Constancia> constancias;

	//bi-directional one-to-one association to Usuario
	@OneToOne
	@JoinColumn(name="ID_ESTUDIANTE")
	private Usuario usuario;

	//bi-directional many-to-one association to Justificacione
	@OneToMany(mappedBy="estudiante")
	private List<Justificacion> justificaciones;

	//bi-directional many-to-one association to Reclamo
	@OneToMany(mappedBy="estudiante")
	private List<Reclamo> reclamos;

	public Estudiante() {
	}

	public long getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public BigDecimal getGeneracion() {
		return this.generacion;
	}

	public void setGeneracion(BigDecimal generacion) {
		this.generacion = generacion;
	}

	public List<AsistEstEvto> getAsistEstEvtos() {
		return this.asistEstEvtos;
	}

	public void setAsistEstEvtos(List<AsistEstEvto> asistEstEvtos) {
		this.asistEstEvtos = asistEstEvtos;
	}

	public AsistEstEvto addAsistEstEvto(AsistEstEvto asistEstEvto) {
		getAsistEstEvtos().add(asistEstEvto);
		asistEstEvto.setEstudiante(this);

		return asistEstEvto;
	}

	public AsistEstEvto removeAsistEstEvto(AsistEstEvto asistEstEvto) {
		getAsistEstEvtos().remove(asistEstEvto);
		asistEstEvto.setEstudiante(null);

		return asistEstEvto;
	}

	public List<Constancia> getConstancias() {
		return this.constancias;
	}

	public void setConstancias(List<Constancia> constancias) {
		this.constancias = constancias;
	}

	public Constancia addConstancia(Constancia constancia) {
		getConstancias().add(constancia);
		constancia.setEstudiante(this);

		return constancia;
	}

	public Constancia removeConstancia(Constancia constancia) {
		getConstancias().remove(constancia);
		constancia.setEstudiante(null);

		return constancia;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Justificacion> getJustificaciones() {
		return this.justificaciones;
	}

	public void setJustificaciones(List<Justificacion> justificaciones) {
		this.justificaciones = justificaciones;
	}

	public Justificacion addJustificacione(Justificacion justificacione) {
		getJustificaciones().add(justificacione);
		justificacione.setEstudiante(this);

		return justificacione;
	}

	public Justificacion removeJustificacione(Justificacion justificacione) {
		getJustificaciones().remove(justificacione);
		justificacione.setEstudiante(null);

		return justificacione;
	}

	public List<Reclamo> getReclamos() {
		return this.reclamos;
	}

	public void setReclamos(List<Reclamo> reclamos) {
		this.reclamos = reclamos;
	}

	public Reclamo addReclamo(Reclamo reclamo) {
		getReclamos().add(reclamo);
		reclamo.setEstudiante(this);

		return reclamo;
	}

	public Reclamo removeReclamo(Reclamo reclamo) {
		getReclamos().remove(reclamo);
		reclamo.setEstudiante(null);

		return reclamo;
	}

}