package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Evento;

/**
 * Session Bean implementation class ItrDAO
 */
@Stateless
public class EventoDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public EventoDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Evento evento) {
		em.persist(evento);
		em.flush();
	}

	public void actualizar(Evento evento) {
		em.merge(evento);
		em.flush();
	}

	public Evento obtenerEventoPorId(long id) {
		return em.find(Evento.class, id);
	}

	public List<Evento> obtenerTodos() {
		TypedQuery<Evento> query = em.createQuery("SELECT e FROM Evento e", Evento.class);
		return query.getResultList();
	}

	public List<Evento> obtenerTodos(String filtro) {
		TypedQuery<Evento> query = em.createQuery("SELECT e FROM Evento e WHERE e.nombre LIKE :nombre", Evento.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
