package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AREAS database table.
 * 
 */
@Entity
@Table(name="AREAS")
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AREAS_IDAREA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREAS_IDAREA_GENERATOR")
	@Column(name="ID_AREA")
	private long idArea;

	private String nombre;

	//bi-directional many-to-one association to Tutore
	@OneToMany(mappedBy="area")
	private List<Tutor> tutores;

	public Area() {
	}

	public long getIdArea() {
		return this.idArea;
	}

	public void setIdArea(long idArea) {
		this.idArea = idArea;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tutor> getTutores() {
		return this.tutores;
	}

	public void setTutores(List<Tutor> tutores) {
		this.tutores = tutores;
	}

	public Tutor addTutore(Tutor tutore) {
		getTutores().add(tutore);
		tutore.setArea(this);

		return tutore;
	}

	public Tutor removeTutore(Tutor tutore) {
		getTutores().remove(tutore);
		tutore.setArea(null);

		return tutore;
	}

}