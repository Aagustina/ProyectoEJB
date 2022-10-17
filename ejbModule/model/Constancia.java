package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CONSTANCIAS database table.
 * 
 */
@Entity
@Table(name="CONSTANCIAS")
@NamedQuery(name="Constancia.findAll", query="SELECT c FROM Constancia c")
public class Constancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONSTANCIAS_IDCONSTANCIA_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONSTANCIAS_IDCONSTANCIA_GENERATOR")
	@Column(name="ID_CONSTANCIA")
	private long idConstancia;

	private Timestamp fechahora;

	@Column(name="INFO_ADJUNTA")
	private String infoAdjunta;

	//bi-directional many-to-one association to AccionConstancia
	@OneToMany(mappedBy="constancia")
	private List<AccionConstancia> accionConstancias;

	//bi-directional many-to-one association to EstadosRecConJus
	@ManyToOne
	@JoinColumn(name="ID_ESTADOS_REC_CON_JUS")
	private EstadosRecConJus estadosRecConJus;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="ID_ESTUDIANTE")
	private Estudiante estudiante;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;

	//bi-directional many-to-one association to TiposConstancia
	@ManyToOne
	@JoinColumn(name="ID_TIPO_CONSTANCIA")
	private TiposConstancia tiposConstancia;

	public Constancia() {
	}

	public long getIdConstancia() {
		return this.idConstancia;
	}

	public void setIdConstancia(long idConstancia) {
		this.idConstancia = idConstancia;
	}

	public Timestamp getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Timestamp fechahora) {
		this.fechahora = fechahora;
	}

	public String getInfoAdjunta() {
		return this.infoAdjunta;
	}

	public void setInfoAdjunta(String infoAdjunta) {
		this.infoAdjunta = infoAdjunta;
	}

	public List<AccionConstancia> getAccionConstancias() {
		return this.accionConstancias;
	}

	public void setAccionConstancias(List<AccionConstancia> accionConstancias) {
		this.accionConstancias = accionConstancias;
	}

	public AccionConstancia addAccionConstancia(AccionConstancia accionConstancia) {
		getAccionConstancias().add(accionConstancia);
		accionConstancia.setConstancia(this);

		return accionConstancia;
	}

	public AccionConstancia removeAccionConstancia(AccionConstancia accionConstancia) {
		getAccionConstancias().remove(accionConstancia);
		accionConstancia.setConstancia(null);

		return accionConstancia;
	}

	public EstadosRecConJus getEstadosRecConJus() {
		return this.estadosRecConJus;
	}

	public void setEstadosRecConJus(EstadosRecConJus estadosRecConJus) {
		this.estadosRecConJus = estadosRecConJus;
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

	public TiposConstancia getTiposConstancia() {
		return this.tiposConstancia;
	}

	public void setTiposConstancia(TiposConstancia tiposConstancia) {
		this.tiposConstancia = tiposConstancia;
	}

}