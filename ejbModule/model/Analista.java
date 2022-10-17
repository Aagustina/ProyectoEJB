package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ANALISTAS database table.
 * 
 */
@Entity
@Table(name="ANALISTAS")
@NamedQuery(name="Analista.findAll", query="SELECT a FROM Analista a")
public class Analista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ANALISTAS_IDANALISTA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ANALISTAS_IDANALISTA_GENERATOR")
	@Column(name="ID_ANALISTA")
	private long idAnalista;

	//bi-directional many-to-one association to AccionConstancia
	@OneToMany(mappedBy="analista")
	private List<AccionConstancia> accionConstancias;

	//bi-directional many-to-one association to AccionJustificacione
	@OneToMany(mappedBy="analista")
	private List<AccionJustificacion> accionJustificaciones;

	//bi-directional many-to-one association to AccionReclamo
	@OneToMany(mappedBy="analista")
	private List<AccionReclamo> accionReclamos;

	//bi-directional one-to-one association to Usuario
	@OneToOne
	@JoinColumn(name="ID_ANALISTA")
	private Usuario usuario;

	//bi-directional many-to-one association to GestAnalistaEvto
	@OneToMany(mappedBy="analista")
	private List<GestAnalistaEvto> gestAnalistaEvtos;

	public Analista() {
	}

	public long getIdAnalista() {
		return this.idAnalista;
	}

	public void setIdAnalista(long idAnalista) {
		this.idAnalista = idAnalista;
	}

	public List<AccionConstancia> getAccionConstancias() {
		return this.accionConstancias;
	}

	public void setAccionConstancias(List<AccionConstancia> accionConstancias) {
		this.accionConstancias = accionConstancias;
	}

	public AccionConstancia addAccionConstancia(AccionConstancia accionConstancia) {
		getAccionConstancias().add(accionConstancia);
		accionConstancia.setAnalista(this);

		return accionConstancia;
	}

	public AccionConstancia removeAccionConstancia(AccionConstancia accionConstancia) {
		getAccionConstancias().remove(accionConstancia);
		accionConstancia.setAnalista(null);

		return accionConstancia;
	}

	public List<AccionJustificacion> getAccionJustificaciones() {
		return this.accionJustificaciones;
	}

	public void setAccionJustificaciones(List<AccionJustificacion> accionJustificaciones) {
		this.accionJustificaciones = accionJustificaciones;
	}

	public AccionJustificacion addAccionJustificacione(AccionJustificacion accionJustificacione) {
		getAccionJustificaciones().add(accionJustificacione);
		accionJustificacione.setAnalista(this);

		return accionJustificacione;
	}

	public AccionJustificacion removeAccionJustificacione(AccionJustificacion accionJustificacione) {
		getAccionJustificaciones().remove(accionJustificacione);
		accionJustificacione.setAnalista(null);

		return accionJustificacione;
	}

	public List<AccionReclamo> getAccionReclamos() {
		return this.accionReclamos;
	}

	public void setAccionReclamos(List<AccionReclamo> accionReclamos) {
		this.accionReclamos = accionReclamos;
	}

	public AccionReclamo addAccionReclamo(AccionReclamo accionReclamo) {
		getAccionReclamos().add(accionReclamo);
		accionReclamo.setAnalista(this);

		return accionReclamo;
	}

	public AccionReclamo removeAccionReclamo(AccionReclamo accionReclamo) {
		getAccionReclamos().remove(accionReclamo);
		accionReclamo.setAnalista(null);

		return accionReclamo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<GestAnalistaEvto> getGestAnalistaEvtos() {
		return this.gestAnalistaEvtos;
	}

	public void setGestAnalistaEvtos(List<GestAnalistaEvto> gestAnalistaEvtos) {
		this.gestAnalistaEvtos = gestAnalistaEvtos;
	}

	public GestAnalistaEvto addGestAnalistaEvto(GestAnalistaEvto gestAnalistaEvto) {
		getGestAnalistaEvtos().add(gestAnalistaEvto);
		gestAnalistaEvto.setAnalista(this);

		return gestAnalistaEvto;
	}

	public GestAnalistaEvto removeGestAnalistaEvto(GestAnalistaEvto gestAnalistaEvto) {
		getGestAnalistaEvtos().remove(gestAnalistaEvto);
		gestAnalistaEvto.setAnalista(null);

		return gestAnalistaEvto;
	}

}