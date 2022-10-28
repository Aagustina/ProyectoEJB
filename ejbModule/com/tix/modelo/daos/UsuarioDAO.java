package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Usuario;

/**
 * Session Bean implementation class UsuarioDAO
 */
@Stateless
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public UsuarioDAO() {
		// TODO Auto-generated constructor stub
	}

	public Usuario obtenerPorNombreUsuario(String nombreUsuario) {
		TypedQuery<Usuario> query = em
				.createQuery("SELECT u FROM Usuario u WHERE u.nombreUsuario LIKE :nombreUsuario", Usuario.class)
				.setParameter("nombreUsuario", nombreUsuario);
		return query.getResultList().get(0);
	}

	public List<Usuario> obtenerTodos() {
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
		return query.getResultList();
	}

	public List<Usuario> obtenerTodos(String filtro) {
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre LIKE :nombre", Usuario.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
