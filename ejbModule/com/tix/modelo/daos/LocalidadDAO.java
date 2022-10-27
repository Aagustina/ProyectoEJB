package com.tix.modelo.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tix.modelo.entidades.Departamento;
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

}
