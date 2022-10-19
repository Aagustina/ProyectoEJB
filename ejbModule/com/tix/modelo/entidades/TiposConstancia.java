package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TIPOS_CONSTANCIAS database table.
 * 
 */
@Entity
@Table(name="TIPOS_CONSTANCIAS")
@NamedQuery(name="TiposConstancia.findAll", query="SELECT t FROM TiposConstancia t")
public class TiposConstancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPOS_CONSTANCIAS_IDTIPOCONSTANCIA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPOS_CONSTANCIAS_IDTIPOCONSTANCIA_GENERATOR")
	@Column(name="ID_TIPO_CONSTANCIA")
	private long idTipoConstancia;

	private BigDecimal estado;

	private String nombre;

	//bi-directional many-to-one association to Constancia
	@OneToMany(mappedBy="tiposConstancia")
	private List<Constancia> constancias;

	public TiposConstancia() {
	}

	public long getIdTipoConstancia() {
		return this.idTipoConstancia;
	}

	public void setIdTipoConstancia(long idTipoConstancia) {
		this.idTipoConstancia = idTipoConstancia;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Constancia> getConstancias() {
		return this.constancias;
	}

	public void setConstancias(List<Constancia> constancias) {
		this.constancias = constancias;
	}

	public Constancia addConstancia(Constancia constancia) {
		getConstancias().add(constancia);
		constancia.setTiposConstancia(this);

		return constancia;
	}

	public Constancia removeConstancia(Constancia constancia) {
		getConstancias().remove(constancia);
		constancia.setTiposConstancia(null);

		return constancia;
	}

}