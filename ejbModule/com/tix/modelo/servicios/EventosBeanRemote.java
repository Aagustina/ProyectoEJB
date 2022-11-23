package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

@Remote
public interface EventosBeanRemote {

	void registro(Evento evento);

	void editar(Evento evento);

	Evento obtenerEventoPorId(Long idEvento);

	List<Evento> obtenerTodos();

	List<Evento> obtenerTodos(String filtro);

}
