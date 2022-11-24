package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Departamento;
import com.tix.modelo.entidades.Justificacion;

@Remote
public interface JustificacionesBeanRemote {
	void registro(Justificacion justificacion);

	Justificacion obtenerJustificacionPorId(Long idJustificacion);

	List<Justificacion> obtenerTodos();

	void editar(Justificacion justificacion);
	
	void borrar(Long id) throws Exception;

}
