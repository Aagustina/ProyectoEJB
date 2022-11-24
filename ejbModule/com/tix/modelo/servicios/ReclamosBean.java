package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.AccionJustificacionDAO;
import com.tix.modelo.daos.AsistEstEvtoDAO;
import com.tix.modelo.daos.EventoDAO;
import com.tix.modelo.daos.ItrDAO;
import com.tix.modelo.daos.ReclamoDAO;
import com.tix.modelo.entidades.AccionJustificacion;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;
import com.tix.modelo.entidades.Reclamo;

/**
 * Session Bean implementation class ItrsBean
 */
@Stateless
public class ReclamosBean implements ReclamosBeanRemote {

	@EJB
	ReclamoDAO reclamoDAO = new ReclamoDAO();

	/**
	 * Default constructor.
	 */
	public ReclamosBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Reclamo obtenerReclamoPorId(Long idReclamo) {
		return reclamoDAO.obtenerReclamoPorId(idReclamo);
	}

	@Override
	public List<Reclamo> obtenerTodos() {
		return reclamoDAO.obtenerTodos();
	}


}
