package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.EventoDAO;
import com.tix.modelo.daos.ItrDAO;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class ItrsBean
 */
@Stateless
public class EventosBean implements EventosBeanRemote {

	@EJB
	EventoDAO eventoDAO = new EventoDAO();

	/**
	 * Default constructor.
	 */
	public EventosBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Evento evento) {
		eventoDAO.crear(evento);
	}

	@Override
	public void editar(Evento evento) {
		eventoDAO.actualizar(evento);
	}

	@Override
	public Evento obtenerEventoPorId(Long idEvento) {
		return eventoDAO.obtenerEventoPorId(idEvento);
	}

	@Override
	public List<Evento> obtenerTodos() {
		return eventoDAO.obtenerTodos();
	}

	@Override
	public List<Evento> obtenerTodos(String filtro) {
		return eventoDAO.obtenerTodos(filtro);
	}

}
