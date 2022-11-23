package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.EstadoRecConJus;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

@Remote
public interface EstadosRecConJusBeanRemote {

	void registro(EstadoRecConJus estadoRecConJus);

	void editar(EstadoRecConJus estadoRecConJus);

	EstadoRecConJus obtenerEstadoRecConJusPorId(Long idEstadoRecConJust);

	List<EstadoRecConJus> obtenerTodos();


}
