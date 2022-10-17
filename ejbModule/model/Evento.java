package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the EVENTOS database table.
 * 
 */
@Entity
@Table(name="EVENTOS")
@NamedQuery(name="Evento.findAll", query="SELECT e FROM Evento e")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EVENTOS_IDEVENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EVENTOS_IDEVENTO_GENERATOR")
	@Column(name="ID_EVENTO")
	private long idEvento;

	@Column(name="FECHAHORA_FIN")
	private Timestamp fechahoraFin;

	@Column(name="FECHAHORA_INICIO")
	private Timestamp fechahoraInicio;

	private String localizacion;

	private String titulo;

	//bi-directional many-to-one association to AsistEstEvto
	@OneToMany(mappedBy="evento")
	private List<AsistEstEvto> asistEstEvtos;

	//bi-directional many-to-one association to Constancia
	@OneToMany(mappedBy="evento")
	private List<Constancia> constancias;

	//bi-directional many-to-one association to EstadosEvento
	@ManyToOne
	@JoinColumn(name="ID_ESTADO")
	private EstadosEvento estadosEvento;

	//bi-directional many-to-one association to Itr
	@ManyToOne
	@JoinColumn(name="ID_ITR")
	private Itr itr;

	//bi-directional many-to-one association to Modalidade
	@ManyToOne
	@JoinColumn(name="ID_MODALIDAD")
	private Modalidad modalidade;

	//bi-directional many-to-one association to TiposEvento
	@ManyToOne
	@JoinColumn(name="ID_TIPO_EVENTO")
	private TiposEvento tiposEvento;

	//bi-directional many-to-one association to GestAnalistaEvto
	@OneToMany(mappedBy="evento")
	private List<GestAnalistaEvto> gestAnalistaEvtos;

	//bi-directional many-to-one association to Justificacione
	@OneToMany(mappedBy="evento")
	private List<Justificacion> justificaciones;

	//bi-directional many-to-one association to RespTutorEvto
	@OneToMany(mappedBy="evento")
	private List<RespTutorEvto> respTutorEvtos;

	public Evento() {
	}

	public long getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public Timestamp getFechahoraFin() {
		return this.fechahoraFin;
	}

	public void setFechahoraFin(Timestamp fechahoraFin) {
		this.fechahoraFin = fechahoraFin;
	}

	public Timestamp getFechahoraInicio() {
		return this.fechahoraInicio;
	}

	public void setFechahoraInicio(Timestamp fechahoraInicio) {
		this.fechahoraInicio = fechahoraInicio;
	}

	public String getLocalizacion() {
		return this.localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<AsistEstEvto> getAsistEstEvtos() {
		return this.asistEstEvtos;
	}

	public void setAsistEstEvtos(List<AsistEstEvto> asistEstEvtos) {
		this.asistEstEvtos = asistEstEvtos;
	}

	public AsistEstEvto addAsistEstEvto(AsistEstEvto asistEstEvto) {
		getAsistEstEvtos().add(asistEstEvto);
		asistEstEvto.setEvento(this);

		return asistEstEvto;
	}

	public AsistEstEvto removeAsistEstEvto(AsistEstEvto asistEstEvto) {
		getAsistEstEvtos().remove(asistEstEvto);
		asistEstEvto.setEvento(null);

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
		constancia.setEvento(this);

		return constancia;
	}

	public Constancia removeConstancia(Constancia constancia) {
		getConstancias().remove(constancia);
		constancia.setEvento(null);

		return constancia;
	}

	public EstadosEvento getEstadosEvento() {
		return this.estadosEvento;
	}

	public void setEstadosEvento(EstadosEvento estadosEvento) {
		this.estadosEvento = estadosEvento;
	}

	public Itr getItr() {
		return this.itr;
	}

	public void setItr(Itr itr) {
		this.itr = itr;
	}

	public Modalidad getModalidade() {
		return this.modalidade;
	}

	public void setModalidade(Modalidad modalidade) {
		this.modalidade = modalidade;
	}

	public TiposEvento getTiposEvento() {
		return this.tiposEvento;
	}

	public void setTiposEvento(TiposEvento tiposEvento) {
		this.tiposEvento = tiposEvento;
	}

	public List<GestAnalistaEvto> getGestAnalistaEvtos() {
		return this.gestAnalistaEvtos;
	}

	public void setGestAnalistaEvtos(List<GestAnalistaEvto> gestAnalistaEvtos) {
		this.gestAnalistaEvtos = gestAnalistaEvtos;
	}

	public GestAnalistaEvto addGestAnalistaEvto(GestAnalistaEvto gestAnalistaEvto) {
		getGestAnalistaEvtos().add(gestAnalistaEvto);
		gestAnalistaEvto.setEvento(this);

		return gestAnalistaEvto;
	}

	public GestAnalistaEvto removeGestAnalistaEvto(GestAnalistaEvto gestAnalistaEvto) {
		getGestAnalistaEvtos().remove(gestAnalistaEvto);
		gestAnalistaEvto.setEvento(null);

		return gestAnalistaEvto;
	}

	public List<Justificacion> getJustificaciones() {
		return this.justificaciones;
	}

	public void setJustificaciones(List<Justificacion> justificaciones) {
		this.justificaciones = justificaciones;
	}

	public Justificacion addJustificacione(Justificacion justificacione) {
		getJustificaciones().add(justificacione);
		justificacione.setEvento(this);

		return justificacione;
	}

	public Justificacion removeJustificacione(Justificacion justificacione) {
		getJustificaciones().remove(justificacione);
		justificacione.setEvento(null);

		return justificacione;
	}

	public List<RespTutorEvto> getRespTutorEvtos() {
		return this.respTutorEvtos;
	}

	public void setRespTutorEvtos(List<RespTutorEvto> respTutorEvtos) {
		this.respTutorEvtos = respTutorEvtos;
	}

	public RespTutorEvto addRespTutorEvto(RespTutorEvto respTutorEvto) {
		getRespTutorEvtos().add(respTutorEvto);
		respTutorEvto.setEvento(this);

		return respTutorEvto;
	}

	public RespTutorEvto removeRespTutorEvto(RespTutorEvto respTutorEvto) {
		getRespTutorEvtos().remove(respTutorEvto);
		respTutorEvto.setEvento(null);

		return respTutorEvto;
	}

}