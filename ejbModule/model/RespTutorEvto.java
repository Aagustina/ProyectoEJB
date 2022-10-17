package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the RESP_TUTOR_EVTOS database table.
 * 
 */
@Entity
@Table(name="RESP_TUTOR_EVTOS")
@NamedQuery(name="RespTutorEvto.findAll", query="SELECT r FROM RespTutorEvto r")
public class RespTutorEvto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RESP_TUTOR_EVTOS_IDRESPTUTOREVTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RESP_TUTOR_EVTOS_IDRESPTUTOREVTO_GENERATOR")
	@Column(name="ID_RESP_TUTOR_EVTO")
	private long idRespTutorEvto;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;

	//bi-directional many-to-one association to Tutore
	@ManyToOne
	@JoinColumn(name="ID_TUTOR")
	private Tutor tutore;

	public RespTutorEvto() {
	}

	public long getIdRespTutorEvto() {
		return this.idRespTutorEvto;
	}

	public void setIdRespTutorEvto(long idRespTutorEvto) {
		this.idRespTutorEvto = idRespTutorEvto;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Tutor getTutore() {
		return this.tutore;
	}

	public void setTutore(Tutor tutore) {
		this.tutore = tutore;
	}

}