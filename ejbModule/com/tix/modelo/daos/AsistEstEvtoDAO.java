package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Evento;

/**
 * Session Bean implementation class ItrDAO
 */
@Stateless
public class AsistEstEvtoDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AsistEstEvtoDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(AsistEstEvto asistEstEvto) {
		em.persist(asistEstEvto);
		em.flush();
	}

	public void actualizar(AsistEstEvto asistEstEvto) {
		em.merge(asistEstEvto);
		em.flush();
	}

	public AsistEstEvto obtenerAsistEstEvtoPorId(long id) {
		return em.find(AsistEstEvto.class, id);
	}

	public List<AsistEstEvto> obtenerTodos() {
		TypedQuery<AsistEstEvto> query = em.createQuery("SELECT a FROM AsistEstEvto a", AsistEstEvto.class);
		return query.getResultList();
	}

	public List<AsistEstEvto> obtenerPorAsistencia(String estadoAsistencia) {
		TypedQuery<AsistEstEvto> query = em
				.createQuery("SELECT a FROM AsistEstEvto a WHERE a.asistencia LIKE :estadoAsistencia", AsistEstEvto.class)
				.setParameter("estadoAsistencia", estadoAsistencia);
		return query.getResultList();
	}
}
