package com.tix.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Departamento
 *
 */
@Entity
@Table(name = "DEPARTAMENTOS")
@NamedQuery(name = "Departamento.findAll", query = "SELECT d FROM Departamento d")

public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_DPTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_DPTO")
	@Column(name = "ID_DEPARTAMENTO", nullable = false)
	private long idDepartamento;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "departamento")
	private List<Itr> itrs;

	@OneToMany(mappedBy = "departamento")
	private List<Localidad> localidades;

	public long getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(long idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Itr> getItrs() {
		return itrs;
	}

	public void setItrs(List<Itr> itrs) {
		this.itrs = itrs;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
