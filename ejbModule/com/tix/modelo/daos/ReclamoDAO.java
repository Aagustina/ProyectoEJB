package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Justificacion;
import com.tix.modelo.entidades.Reclamo;
import com.tix.modelo.entidades.Tutor;

/**
 * Session Bean implementation class DepartamentoDAO
 */
@Stateless
public class ReclamoDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ReclamoDAO() {
		// TODO Auto-generated constructor stub
	}

	public Reclamo obtenerReclamoPorId(Long idReclamo) {
		return em.find(Reclamo.class, idReclamo);
	}
		
	public List<Reclamo> obtenerTodos() {
		TypedQuery<Reclamo> query = em.createQuery("SELECT r FROM Reclamo r", Reclamo.class);
		return query.getResultList();
	}
	

}
