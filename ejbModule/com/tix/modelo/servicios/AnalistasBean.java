package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;

/**
 * Session Bean implementation class AnalistaBean
 */
@Stateless
public class AnalistasBean implements AnalistasBeanRemote {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AnalistasBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(Analista analista) {
		em.persist(analista);
		em.flush();
	}

	@Override
	public void actualizar(Analista analista) {
		em.merge(analista);
		em.flush();
	}

	@Override
	public void borrar(Long id) {
		Analista analista = em.find(Analista.class, id);
		em.remove(analista);
		em.flush();
	}

	@Override
	public List<Analista> obtenerTodos() {
		TypedQuery<Analista> query = em.createQuery("SELECT a FROM Analista a", Analista.class);
		return query.getResultList();
	}

	@Override
	public List<Analista> obtenerTodos(String filtro) {
		TypedQuery<Analista> query = em
				.createQuery("SELECT a FROM Analista a WHERE a.nombre LIKE :nombre", Analista.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}
}
