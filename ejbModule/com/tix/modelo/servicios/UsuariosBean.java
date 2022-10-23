package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Usuario;

/**
 * Session Bean implementation class UsuariosBean
 */
@Stateless
public class UsuariosBean implements UsuariosBeanRemote {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public UsuariosBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Usuario> obtenerTodos() {
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
		return query.getResultList();
	}

	@Override
	public List<Usuario> obtenerTodos(String filtro) {
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nombre LIKE :nombre", Usuario.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
