package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Departamento;
import com.tix.modelo.entidades.Itr;
import com.tix.modelo.entidades.Localidad;

/**
 * Session Bean implementation class Localidad
 */
@Stateless
public class LocalidadDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public LocalidadDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Localidad localidad) {
		em.persist(localidad);
		em.flush();
	}

	public Localidad obtenerLocalidadPorId(Long idLocalidad) {
		return em.find(Localidad.class, idLocalidad);
	}

	public List<Localidad> obtenerTodos() {
		TypedQuery<Localidad> query = em.createQuery("SELECT l FROM Localidad l", Localidad.class);
		return query.getResultList();
	}

	public List<Localidad> obtenerTodos(String filtro) {
		TypedQuery<Localidad> query = em
				.createQuery("SELECT l FROM Localidad l WHERE l.nombre LIKE :nombre", Localidad.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
