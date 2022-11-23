package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.EstadoRecConJus;
import com.tix.modelo.entidades.Evento;

/**
 * Session Bean implementation class ItrDAO
 */
@Stateless
public class EstadoRecConJusDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public EstadoRecConJusDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(EstadoRecConJus estadoRecConJus) {
		em.persist(estadoRecConJus);
		em.flush();
	}

	public void actualizar(EstadoRecConJus estadoRecConJus) {
		em.merge(estadoRecConJus);
		em.flush();
	}

	public EstadoRecConJus obtenerEstadoRecConJusPorId(long idEstadoRecConJus) {
		return em.find(EstadoRecConJus.class, idEstadoRecConJus);
	}

	public List<EstadoRecConJus> obtenerTodos() {
		TypedQuery<EstadoRecConJus> query = em.createQuery("SELECT e FROM EstadoRecConJus e", EstadoRecConJus.class);
		return query.getResultList();
	}

}
