package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;

/**
 * Session Bean implementation class AnalistaDAO
 */
@Stateless
public class AnalistaDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AnalistaDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Analista analista) {
		em.persist(analista);
		em.flush();
	}

	public void actualizar(Analista analista) {
		em.merge(analista);
		em.flush();
	}

	public void borrar(Long id) {
		Analista analista = em.find(Analista.class, id);
		em.remove(analista);
		em.flush();
	}

	public List<Analista> obtenerTodos() {
		TypedQuery<Analista> query = em.createQuery("SELECT a FROM Analista a", Analista.class);
		return query.getResultList();
	}

	public List<Analista> obtenerTodos(String filtro) {
		TypedQuery<Analista> query = em
				.createQuery("SELECT a FROM Analista a WHERE a.nombre LIKE :nombre", Analista.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
