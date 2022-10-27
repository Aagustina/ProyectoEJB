package com.tix.modelo.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tix.modelo.entidades.Itr;
import com.tix.modelo.entidades.Localidad;

/**
 * Session Bean implementation class ItrDAO
 */
@Stateless
public class ItrDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ItrDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Itr itr) {
		em.persist(itr);
		em.flush();
	}

	public Itr obtenerLocalidadPorId(Long idItr) {
		return em.find(Itr.class, idItr);
	}

}
