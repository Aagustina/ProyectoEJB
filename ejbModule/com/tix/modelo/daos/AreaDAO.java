package com.tix.modelo.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tix.modelo.entidades.Area;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class AreaDAO
 */
@Stateless
public class AreaDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AreaDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Area area) {
		em.persist(area);
		em.flush();
	}

	public Itr obtenerAreaPorId(Long idArea) {
		return em.find(Itr.class, idArea);
	}

}
