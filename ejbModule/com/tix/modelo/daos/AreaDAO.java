package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Area;
import com.tix.modelo.entidades.Departamento;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class AreaDAO
 */
@Stateless
public class AreaDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AreaDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Area area) {
		em.persist(area);
		em.flush();
	}

	public Itr obtenerAreaPorId(Long idArea) {
		return em.find(Itr.class, idArea);
	}

	public List<Area> obtenerTodos() {
		TypedQuery<Area> query = em.createQuery("SELECT a FROM Area a", Area.class);
		return query.getResultList();
	}

	public List<Area> obtenerTodos(String filtro) {
		TypedQuery<Area> query = em.createQuery("SELECT a FROM Area a WHERE a.nombre LIKE :nombre", Area.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}
	
}
