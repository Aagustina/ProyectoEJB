package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Analista;

@Remote
public interface AnalistasBeanRemote {

	void registro(Analista analista) throws Exception;

	void editar(Analista analista) throws Exception;

	List<Analista> obtenerTodos();

	List<Analista> obtenerAnalistaPorNombreUsuario(String nombreUsuario);

	Analista obtenerAnalistaPorId(long id);
}
