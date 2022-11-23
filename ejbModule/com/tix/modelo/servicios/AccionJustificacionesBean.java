package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.AccionJustificacionDAO;
import com.tix.modelo.daos.AsistEstEvtoDAO;
import com.tix.modelo.daos.EventoDAO;
import com.tix.modelo.daos.ItrDAO;
import com.tix.modelo.entidades.AccionJustificacion;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class ItrsBean
 */
@Stateless
public class AccionJustificacionesBean implements AccionJustificacionesBeanRemote {

	@EJB
	AccionJustificacionDAO accionJustificacionDAO = new AccionJustificacionDAO();

	/**
	 * Default constructor.
	 */
	public AccionJustificacionesBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(AccionJustificacion accionJustificacion) {
		accionJustificacionDAO.crear(accionJustificacion);
	}

	@Override
	public void editar(AccionJustificacion accionJustificacion) {
		accionJustificacionDAO.actualizar(accionJustificacion);
	}

	@Override
	public AccionJustificacion obtenerAccionJustificacionPorId(Long idAccionJustificacion) {
		return accionJustificacionDAO.obtenerAccionJustificacionPorId(idAccionJustificacion);
	}

	@Override
	public List<AccionJustificacion> obtenerTodos() {
		return accionJustificacionDAO.obtenerTodos();
	}


}
