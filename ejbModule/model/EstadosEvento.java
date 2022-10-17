package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ESTADOS_EVENTOS database table.
 * 
 */
@Entity
@Table(name="ESTADOS_EVENTOS")
@NamedQuery(name="EstadosEvento.findAll", query="SELECT e FROM EstadosEvento e")
public class EstadosEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ESTADOS_EVENTOS_IDESTADOEVENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ESTADOS_EVENTOS_IDESTADOEVENTO_GENERATOR")
	@Column(name="ID_ESTADO_EVENTO")
	private long idEstadoEvento;

	private BigDecimal estado;

	private String nombre;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="estadosEvento")
	private List<Evento> eventos;

	public EstadosEvento() {
	}

	public long getIdEstadoEvento() {
		return this.idEstadoEvento;
	}

	public void setIdEstadoEvento(long idEstadoEvento) {
		this.idEstadoEvento = idEstadoEvento;
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

	public List<Evento> getEventos() {
		return this.eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Evento addEvento(Evento evento) {
		getEventos().add(evento);
		evento.setEstadosEvento(this);

		return evento;
	}

	public Evento removeEvento(Evento evento) {
		getEventos().remove(evento);
		evento.setEstadosEvento(null);

		return evento;
	}

}