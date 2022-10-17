package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ESTADOS_REC_CON_JUS database table.
 * 
 */
@Entity
@Table(name="ESTADOS_REC_CON_JUS")
@NamedQuery(name="EstadosRecConJus.findAll", query="SELECT e FROM EstadosRecConJus e")
public class EstadosRecConJus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ESTADOS_REC_CON_JUS_IDESTADOSRECCONJUS_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ESTADOS_REC_CON_JUS_IDESTADOSRECCONJUS_GENERATOR")
	@Column(name="ID_ESTADOS_REC_CON_JUS")
	private long idEstadosRecConJus;

	private BigDecimal estado;

	private String nombre;

	//bi-directional many-to-one association to Constancia
	@OneToMany(mappedBy="estadosRecConJus")
	private List<Constancia> constancias;

	//bi-directional many-to-one association to Justificacione
	@OneToMany(mappedBy="estadosRecConJus")
	private List<Justificacion> justificaciones;

	//bi-directional many-to-one association to Reclamo
	@OneToMany(mappedBy="estadosRecConJus")
	private List<Reclamo> reclamos;

	public EstadosRecConJus() {
	}

	public long getIdEstadosRecConJus() {
		return this.idEstadosRecConJus;
	}

	public void setIdEstadosRecConJus(long idEstadosRecConJus) {
		this.idEstadosRecConJus = idEstadosRecConJus;
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
		constancia.setEstadosRecConJus(this);

		return constancia;
	}

	public Constancia removeConstancia(Constancia constancia) {
		getConstancias().remove(constancia);
		constancia.setEstadosRecConJus(null);

		return constancia;
	}

	public List<Justificacion> getJustificaciones() {
		return this.justificaciones;
	}

	public void setJustificaciones(List<Justificacion> justificaciones) {
		this.justificaciones = justificaciones;
	}

	public Justificacion addJustificacione(Justificacion justificacione) {
		getJustificaciones().add(justificacione);
		justificacione.setEstadosRecConJus(this);

		return justificacione;
	}

	public Justificacion removeJustificacione(Justificacion justificacione) {
		getJustificaciones().remove(justificacione);
		justificacione.setEstadosRecConJus(null);

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
		reclamo.setEstadosRecConJus(this);

		return reclamo;
	}

	public Reclamo removeReclamo(Reclamo reclamo) {
		getReclamos().remove(reclamo);
		reclamo.setEstadosRecConJus(null);

		return reclamo;
	}

}