package com.tix.modelo.entidades;

import java.io.Serializable;
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
 * Entity implementation class for Entity: Itr
 *
 */
@Entity
@Table(name = "ITRS")
@NamedQuery(name = "Itr.findAll", query = "SELECT i FROM Itr i")

public class Itr implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_ITRS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_ITRS")

	@Column(name = "ID_ITR")
	private long idItr;

	@Column(nullable = false)
	private int estado;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "DEPARTAMENTO", nullable = false)
	private Departamento departamento;

	@OneToMany(mappedBy = "itr")
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy="itr")
	private List<Evento> eventos;

	public long getIdItr() {
		return idItr;
	}

	public void setIdItr(long idItr) {
		this.idItr = idItr;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
