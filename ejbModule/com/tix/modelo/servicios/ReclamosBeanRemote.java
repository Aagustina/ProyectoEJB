package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.AccionJustificacion;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;
import com.tix.modelo.entidades.Reclamo;

@Remote
public interface ReclamosBeanRemote {

	Reclamo obtenerReclamoPorId(Long idReclamo);

	List<Reclamo> obtenerTodos();

}
