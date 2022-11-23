package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.AccionJustificacion;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

@Remote
public interface AccionJustificacionesBeanRemote {

	void registro(AccionJustificacion accionJustificacion);

	void editar(AccionJustificacion accionJustificacion);

	AccionJustificacion obtenerAccionJustificacionPorId(Long idAccionJustificacion);

	List<AccionJustificacion> obtenerTodos();

}
