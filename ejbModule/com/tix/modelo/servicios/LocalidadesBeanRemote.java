package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Localidad;

@Remote
public interface LocalidadesBeanRemote {

	void registro(Localidad localidad);

	Localidad obtenerLocalidadPorId(Long idLocalidad);

	List<Localidad> obtenerTodos();

	List<Localidad> obtenerTodos(String filtro);

}
