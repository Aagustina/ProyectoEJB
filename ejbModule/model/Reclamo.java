package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the RECLAMOS database table.
 * 
 */
@Entity
@Table(name="RECLAMOS")
@NamedQuery(name="Reclamo.findAll", query="SELECT r FROM Reclamo r")
public class Reclamo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RECLAMOS_IDRECLAMO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RECLAMOS_IDRECLAMO_GENERATOR")
	@Column(name="ID_RECLAMO")
	private long idReclamo;

	private String asunto;

	private BigDecimal creditos;

	private String detalle;

	private String docente;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Timestamp fechahora;

	@Column(name="NOM_ACTIVIDAD")
	private String nomActividad;

	@Column(name="NOM_EVENTO")
	private String nomEvento;

	private BigDecimal semestre;

	@Column(name="TIPO_RECL")
	private String tipoRecl;

	//bi-directional many-to-one association to AccionReclamo
	@OneToMany(mappedBy="reclamo")
	private List<AccionReclamo> accionReclamos;

	//bi-directional many-to-one association to EstadosRecConJus
	@ManyToOne
	@JoinColumn(name="ID_ESTADOS_REC_CON_JUS")
	private EstadosRecConJus estadosRecConJus;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="ID_ESTUDIANTE")
	private Estudiante estudiante;

	public Reclamo() {
	}

	public long getIdReclamo() {
		return this.idReclamo;
	}

	public void setIdReclamo(long idReclamo) {
		this.idReclamo = idReclamo;
	}

	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public BigDecimal getCreditos() {
		return this.creditos;
	}

	public void setCreditos(BigDecimal creditos) {
		this.creditos = creditos;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getDocente() {
		return this.docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Timestamp getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Timestamp fechahora) {
		this.fechahora = fechahora;
	}

	public String getNomActividad() {
		return this.nomActividad;
	}

	public void setNomActividad(String nomActividad) {
		this.nomActividad = nomActividad;
	}

	public String getNomEvento() {
		return this.nomEvento;
	}

	public void setNomEvento(String nomEvento) {
		this.nomEvento = nomEvento;
	}

	public BigDecimal getSemestre() {
		return this.semestre;
	}

	public void setSemestre(BigDecimal semestre) {
		this.semestre = semestre;
	}

	public String getTipoRecl() {
		return this.tipoRecl;
	}

	public void setTipoRecl(String tipoRecl) {
		this.tipoRecl = tipoRecl;
	}

	public List<AccionReclamo> getAccionReclamos() {
		return this.accionReclamos;
	}

	public void setAccionReclamos(List<AccionReclamo> accionReclamos) {
		this.accionReclamos = accionReclamos;
	}

	public AccionReclamo addAccionReclamo(AccionReclamo accionReclamo) {
		getAccionReclamos().add(accionReclamo);
		accionReclamo.setReclamo(this);

		return accionReclamo;
	}

	public AccionReclamo removeAccionReclamo(AccionReclamo accionReclamo) {
		getAccionReclamos().remove(accionReclamo);
		accionReclamo.setReclamo(null);

		return accionReclamo;
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

}