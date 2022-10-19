package com.tix.modelo.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPOS_EVENTOS database table.
 * 
 */
@Entity
@Table(name="TIPOS_EVENTOS")
@NamedQuery(name="TiposEvento.findAll", query="SELECT t FROM TiposEvento t")
public class TiposEvento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPOS_EVENTOS_IDTIPOEVENTO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPOS_EVENTOS_IDTIPOEVENTO_GENERATOR")
	@Column(name="ID_TIPO_EVENTO")
	private long idTipoEvento;

	private String nombre;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="tiposEvento")
	private List<Evento> eventos;

	public TiposEvento() {
	}

	public long getIdTipoEvento() {
		return this.idTipoEvento;
	}

	public void setIdTipoEvento(long idTipoEvento) {
		this.idTipoEvento = idTipoEvento;
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
		evento.setTiposEvento(this);

		return evento;
	}

	public Evento removeEvento(Evento evento) {
		getEventos().remove(evento);
		evento.setTiposEvento(null);

		return evento;
	}

}