package com.tix.modelo.servicios;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Localidad;

@Remote
public interface LocalidadesBeanRemote {

	void registro(Localidad localidad);

	Localidad obtenerLocalidadPorId(Long idLocalidad);

}
