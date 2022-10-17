package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ITRS database table.
 * 
 */
@Entity
@Table(name="ITRS")
@NamedQuery(name="Itr.findAll", query="SELECT i FROM Itr i")
public class Itr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITRS_IDITR_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITRS_IDITR_GENERATOR")
	@Column(name="ID_ITR")
	private long idItr;

	private BigDecimal estado;

	private String nombre;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="itr")
	private List<Evento> eventos;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="DEPARTAMENTO")
	private Departamento departamentoBean;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="itr")
	private List<Usuario> usuarios;

	public Itr() {
	}

	public long getIdItr() {
		return this.idItr;
	}

	public void setIdItr(long idItr) {
		this.idItr = idItr;
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
		evento.setItr(this);

		return evento;
	}

	public Evento removeEvento(Evento evento) {
		getEventos().remove(evento);
		evento.setItr(null);

		return evento;
	}

	public Departamento getDepartamentoBean() {
		return this.departamentoBean;
	}

	public void setDepartamentoBean(Departamento departamentoBean) {
		this.departamentoBean = departamentoBean;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setItr(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setItr(null);

		return usuario;
	}

}