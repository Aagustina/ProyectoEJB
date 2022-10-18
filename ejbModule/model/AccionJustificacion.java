package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ACCION_JUSTIFICACIONES database table.
 * 
 */
@Entity
@Table(name="ACCION_JUSTIFICACIONES")
@NamedQuery(name="AccionJustificacion.findAll", query="SELECT a FROM AccionJustificacion a")
public class AccionJustificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCION_JUSTIFICACIONES_IDACCJUSTIFICACION_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCION_JUSTIFICACIONES_IDACCJUSTIFICACION_GENERATOR")
	@Column(name="ID_ACC_JUSTIFICACION")
	private long idAccJustificacion;

	private String detalle;

	private Timestamp fechahora;

	//bi-directional many-to-one association to Analista
	@ManyToOne
	@JoinColumn(name="ID_ANALISTA")
	private Analista analista;

	//bi-directional many-to-one association to Justificacione
	@ManyToOne
	@JoinColumn(name="ID_JUSTIFICACION")
	private Justificacion justificacione;

	public AccionJustificacion() {
	}

	public long getIdAccJustificacion() {
		return this.idAccJustificacion;
	}

	public void setIdAccJustificacion(long idAccJustificacion) {
		this.idAccJustificacion = idAccJustificacion;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Timestamp getFechahora() {
		return this.fechahora;
	}

	public void setFechahora(Timestamp fechahora) {
		this.fechahora = fechahora;
	}

	public Analista getAnalista() {
		return this.analista;
	}

	public void setAnalista(Analista analista) {
		this.analista = analista;
	}

	public Justificacion getJustificacione() {
		return this.justificacione;
	}

	public void setJustificacione(Justificacion justificacione) {
		this.justificacione = justificacione;
	}

}