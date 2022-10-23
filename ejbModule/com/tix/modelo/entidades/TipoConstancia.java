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
 * Entity implementation class for Entity: TipoConstancia
 *
 */
@Entity
@Table(name = "TIPOS_CONSTANCIAS")
@NamedQuery(name = "TipoConstancia.findAll", query = "SELECT t FROM TipoConstancia t")
public class TipoConstancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_TPO_CONST")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_TPO_CONST")
	@Column(name = "ID_TIPO_CONSTANCIA")
	private long idTipoConstancia;

	@Column(nullable = false)
	private int estado;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "tipoConstancia")
	private List<Constancia> constancias;

	public long getIdTipoConstancia() {
		return idTipoConstancia;
	}

	public void setIdTipoConstancia(long idTipoConstancia) {
		this.idTipoConstancia = idTipoConstancia;
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

}
