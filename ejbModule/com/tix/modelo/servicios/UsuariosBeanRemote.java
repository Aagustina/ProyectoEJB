package com.tix.modelo.servicios;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Usuario;

@Remote
public interface UsuariosBeanRemote {
	Usuario obtenerPorNombreUsuario(String nombreUsuario);
}
