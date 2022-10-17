package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GEST_ANALISTA_EVTOS database table.
 * 
 */
@Entity
@Table(name="GEST_ANALISTA_EVTOS")
@NamedQuery(name="GestAnalistaEvto.findAll", query="SELECT g FROM GestAnalistaEvto g")
public class GestAnalistaEvto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GEST_ANALISTA_EVTOS_IDGESTANALISTAEVTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GEST_ANALISTA_EVTOS_IDGESTANALISTAEVTO_GENERATOR")
	@Column(name="ID_GEST_ANALISTA_EVTO")
	private long idGestAnalistaEvto;

	//bi-directional many-to-one association to Analista
	@ManyToOne
	@JoinColumn(name="ID_ANALISTA")
	private Analista analista;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;

	public GestAnalistaEvto() {
	}

	public long getIdGestAnalistaEvto() {
		return this.idGestAnalistaEvto;
	}

	public void setIdGestAnalistaEvto(long idGestAnalistaEvto) {
		this.idGestAnalistaEvto = idGestAnalistaEvto;
	}

	public Analista getAnalista() {
		return this.analista;
	}

	public void setAnalista(Analista analista) {
		this.analista = analista;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}