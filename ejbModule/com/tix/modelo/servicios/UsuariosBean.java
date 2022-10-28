package com.tix.modelo.servicios;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.UsuarioDAO;
import com.tix.modelo.entidades.Usuario;

/**
 * Session Bean implementation class UsuariosBean
 */
@Stateless
public class UsuariosBean implements UsuariosBeanRemote {

	@EJB
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	/**
	 * Default constructor.
	 */
	public UsuariosBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Usuario obtenerPorNombreUsuario(String nombreUsuario) {
		return usuarioDAO.obtenerPorNombreUsuario(nombreUsuario);
	}

}
