package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.Itr;
import com.tix.modelo.entidades.Localidad;
import com.tix.modelo.entidades.Tutor;

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

	public void actualizar(Itr itr) {
		em.merge(itr);
		em.flush();
	}

	public Itr obtenerItrPorId(long id) {
		return em.find(Itr.class, id);
	}

	public List<Itr> obtenerTodos() {
		TypedQuery<Itr> query = em.createQuery("SELECT i FROM Itr i", Itr.class);
		return query.getResultList();
	}

	public List<Itr> obtenerTodos(String filtro) {
		TypedQuery<Itr> query = em.createQuery("SELECT i FROM Itr i WHERE i.nombre LIKE :nombre", Itr.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
