package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Usuario;

@Remote
public interface UsuariosBeanRemote {
	List<Usuario> obtenerTodos();

	List<Usuario> obtenerTodos(String filtro);

}
