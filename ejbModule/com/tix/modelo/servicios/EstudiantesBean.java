package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Estudiante;

/**
 * Session Bean implementation class EstudiantesBean
 */
@Stateless
public class EstudiantesBean implements EstudiantesBeanRemote {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public EstudiantesBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(Estudiante estudiante) {
		em.persist(estudiante);
		em.flush();
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		em.merge(estudiante);
		em.flush();
	}

	@Override
	public void borrar(Long id) {
		Estudiante estudiante = em.find(Estudiante.class, id);
		em.remove(estudiante);
		em.flush();
	}

	@Override
	public List<Estudiante> obtenerTodos() {
		TypedQuery<Estudiante> query = em.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
		return query.getResultList();
	}

	@Override
	public List<Estudiante> obtenerTodos(String filtro) {
		TypedQuery<Estudiante> query = em
				.createQuery("SELECT e FROM Estudiante e WHERE e.nombre LIKE :nombre", Estudiante.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
