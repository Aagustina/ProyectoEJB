package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Analista;

@Remote
public interface AnalistasBeanRemote {
	void crear(Analista analista);

	void actualizar(Analista analista);

	void borrar(Long id);

	List<Analista> obtenerTodos();

	List<Analista> obtenerTodos(String filtro);
}
