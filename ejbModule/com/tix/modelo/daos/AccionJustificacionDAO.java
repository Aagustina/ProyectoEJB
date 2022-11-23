package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.AccionJustificacion;
import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Justificacion;

/**
 * Session Bean implementation class ItrDAO
 */
@Stateless
public class AccionJustificacionDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AccionJustificacionDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(AccionJustificacion accionJustificacion) {
		em.persist(accionJustificacion);
		em.flush();
	}

	public void actualizar(AccionJustificacion accionJustificacion) {
		em.merge(accionJustificacion);
		em.flush();
	}

	public AccionJustificacion obtenerAccionJustificacionPorId(long id) {
		return em.find(AccionJustificacion.class, id);
	}

	public List<AccionJustificacion> obtenerTodos() {
		TypedQuery<AccionJustificacion> query = em.createQuery("SELECT a FROM AccionJustificacion a", AccionJustificacion.class);
		return query.getResultList();
	}
	
}
