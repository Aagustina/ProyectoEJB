package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TUTORES database table.
 * 
 */
@Entity
@Table(name="TUTORES")
@NamedQuery(name="Tutor.findAll", query="SELECT t FROM Tutor t")
public class Tutor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TUTORES_IDTUTOR_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TUTORES_IDTUTOR_GENERATOR")
	@Column(name="ID_TUTOR")
	private long idTutor;

	private String tipo;

	//bi-directional many-to-one association to RespTutorEvto
	@OneToMany(mappedBy="tutore")
	private List<RespTutorEvto> respTutorEvtos;

	//bi-directional many-to-one association to Area
	@ManyToOne
	@JoinColumn(name="ID_AREA")
	private Area area;

	//bi-directional one-to-one association to Usuario
	@OneToOne
	@JoinColumn(name="ID_TUTOR")
	private Usuario usuario;

	public Tutor() {
	}

	public long getIdTutor() {
		return this.idTutor;
	}

	public void setIdTutor(long idTutor) {
		this.idTutor = idTutor;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<RespTutorEvto> getRespTutorEvtos() {
		return this.respTutorEvtos;
	}

	public void setRespTutorEvtos(List<RespTutorEvto> respTutorEvtos) {
		this.respTutorEvtos = respTutorEvtos;
	}

	public RespTutorEvto addRespTutorEvto(RespTutorEvto respTutorEvto) {
		getRespTutorEvtos().add(respTutorEvto);
		respTutorEvto.setTutore(this);

		return respTutorEvto;
	}

	public RespTutorEvto removeRespTutorEvto(RespTutorEvto respTutorEvto) {
		getRespTutorEvtos().remove(respTutorEvto);
		respTutorEvto.setTutore(null);

		return respTutorEvto;
	}

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}