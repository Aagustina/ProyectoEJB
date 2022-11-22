package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Justificacion;

/**
 * Session Bean implementation class DepartamentoDAO
 */
@Stateless
public class JustificacionDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public JustificacionDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Justificacion justificacion) {
		em.persist(justificacion);
		em.flush();
	}

	public Justificacion obtenerJustificacionPorId(Long idJustificacion) {
		return em.find(Justificacion.class, idJustificacion);
	}
	
	public List<Justificacion> obtenerTodos() {
		TypedQuery<Justificacion> query = em.createQuery("SELECT j FROM Justificacion j", Justificacion.class);
		return query.getResultList();
	}

}
