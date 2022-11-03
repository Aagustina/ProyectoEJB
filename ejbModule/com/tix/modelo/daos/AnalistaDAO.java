package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.Usuario;

/**
 * Session Bean implementation class AnalistaDAO
 */
@Stateless
public class AnalistaDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AnalistaDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Analista analista) throws Exception {
		em.persist(analista);
		em.flush();
	}

	public void actualizar(Analista analista) throws Exception {
		em.merge(analista);
		em.flush();
	}

	public void borrar(Long id) throws Exception {
		Analista analista = em.find(Analista.class, id);
		em.remove(analista);
		em.flush();
	}

	public List<Analista> obtenerPorNombreUsuario(String nombreUsuario) {
		TypedQuery<Analista> query = em
				.createQuery("SELECT a FROM Analista a WHERE a.nombreUsuario LIKE :nombreUsuario", Analista.class)
				.setParameter("nombreUsuario", nombreUsuario);
		return query.getResultList();
	}

	public List<Analista> obtenerTodos() {
		TypedQuery<Analista> query = em.createQuery("SELECT a FROM Analista a", Analista.class);
		return query.getResultList();
	}

	public List<Analista> obtenerTodos(String filtro) {
		TypedQuery<Analista> query = em
				.createQuery("SELECT a FROM Analista a WHERE a.nombre LIKE :nombre", Analista.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
