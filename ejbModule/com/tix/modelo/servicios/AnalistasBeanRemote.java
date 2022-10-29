package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Analista;

@Remote
public interface AnalistasBeanRemote {

	void registro(Analista analista);

	List<Analista> obtenerTodos();
	
	Analista obtenerAnalistaPorNombreUsuario(String nombreUsuario); 
}
