package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Tutor;

/**
 * Session Bean implementation class TutorDAO
 */
@Stateless
public class TutorDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public TutorDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Tutor tutor) throws Exception {
		em.persist(tutor);
		em.flush();
	}

	public void actualizar(Tutor tutor) throws Exception {
		em.merge(tutor);
		em.flush();
	}

	public void borrar(Long id) throws Exception {
		Tutor tutor = em.find(Tutor.class, id);
		em.remove(tutor);
		em.flush();
	}

	public List<Tutor> obtenerTutorPorNombreUsuario(String nombreUsuario) {
		TypedQuery<Tutor> query = em
				.createQuery("SELECT t FROM Tutor t WHERE t.nombreUsuario LIKE :nombreUsuario", Tutor.class)
				.setParameter("nombreUsuario", nombreUsuario);
		return query.getResultList();
	}

	public List<Tutor> obtenerTodos() {
		TypedQuery<Tutor> query = em.createQuery("SELECT t FROM Tutor t", Tutor.class);
		return query.getResultList();
	}

	public List<Tutor> obtenerTodos(String filtro) {
		TypedQuery<Tutor> query = em.createQuery("SELECT t FROM Tutor t WHERE t.nombre LIKE :nombre", Tutor.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
