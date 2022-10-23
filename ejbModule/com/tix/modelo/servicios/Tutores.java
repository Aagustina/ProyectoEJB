package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.Tutor;

/**
 * Session Bean implementation class Tutores
 */
@Stateless
public class Tutores implements TutoresRemote {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public Tutores() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(Tutor tutor) {
		em.persist(tutor);
		em.flush();
	}

	@Override
	public void actualizar(Tutor tutor) {
		em.merge(tutor);
		em.flush();
	}

	@Override
	public void borrar(Long id) {
		Tutor tutor = em.find(Tutor.class, id);
		em.remove(tutor);
		em.flush();
	}

	@Override
	public List<Tutor> obtenerTodos() {
		TypedQuery<Tutor> query = em.createQuery("SELECT t FROM Tutor t", Tutor.class);
		return query.getResultList();
	}

	@Override
	public List<Tutor> obtenerTodos(String filtro) {
		TypedQuery<Tutor> query = em.createQuery("SELECT t FROM Tutor t WHERE t.nombre LIKE :nombre", Tutor.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
