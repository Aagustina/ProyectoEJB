package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.AsistEstEvtoDAO;
import com.tix.modelo.daos.EstadoRecConJusDAO;
import com.tix.modelo.daos.EventoDAO;
import com.tix.modelo.daos.ItrDAO;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.EstadoRecConJus;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class ItrsBean
 */
@Stateless
public class EstadosRecConJusBean implements EstadosRecConJusBeanRemote {

	@EJB
	EstadoRecConJusDAO estadoRecConJusDAO = new EstadoRecConJusDAO();

	/**
	 * Default constructor.
	 */
	public EstadosRecConJusBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(EstadoRecConJus estadoRecConJus) {
		estadoRecConJusDAO.crear(estadoRecConJus);
	}

	@Override
	public void editar(EstadoRecConJus estadoRecConJus) {
		estadoRecConJusDAO.actualizar(estadoRecConJus);
	}

	@Override
	public EstadoRecConJus obtenerEstadoRecConJusPorId(Long idEstadoRecConJus) {
		return estadoRecConJusDAO.obtenerEstadoRecConJusPorId(idEstadoRecConJus);
	}

	@Override
	public List<EstadoRecConJus> obtenerTodos() {
		return estadoRecConJusDAO.obtenerTodos();
	}
	


}
