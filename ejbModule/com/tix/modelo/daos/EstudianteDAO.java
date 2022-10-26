package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Estudiante;

/**
 * Session Bean implementation class EstudianteDAO
 */
@Stateless
public class EstudianteDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public EstudianteDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Estudiante estudiante) {
		em.persist(estudiante);
		em.flush();
	}

	public void actualizar(Estudiante estudiante) {
		em.merge(estudiante);
		em.flush();
	}

	public void borrar(Long id) {
		Estudiante estudiante = em.find(Estudiante.class, id);
		em.remove(estudiante);
		em.flush();
	}

	public List<Estudiante> obtenerTodos() {
		TypedQuery<Estudiante> query = em.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return query.getResultList();
	}

	public List<Estudiante> obtenerTodos(String filtro) {
		TypedQuery<Estudiante> query = em
				.createQuery("SELECT e FROM Estudiante e WHERE e.nombre LIKE :nombre", Estudiante.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
