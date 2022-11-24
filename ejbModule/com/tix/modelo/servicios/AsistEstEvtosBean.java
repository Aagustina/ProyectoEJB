package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.AsistEstEvtoDAO;
import com.tix.modelo.daos.EventoDAO;
import com.tix.modelo.daos.ItrDAO;
import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class ItrsBean
 */
@Stateless
public class AsistEstEvtosBean implements AsistEstEvtosBeanRemote {

	@EJB
	AsistEstEvtoDAO asistEstEvtoDAO = new AsistEstEvtoDAO();

	/**
	 * Default constructor.
	 */
	public AsistEstEvtosBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(AsistEstEvto asistEstEvto) {
		asistEstEvtoDAO.crear(asistEstEvto);
	}

	@Override
	public void editar(AsistEstEvto asistEstEvto) {
		asistEstEvtoDAO.actualizar(asistEstEvto);
	}

	@Override
	public AsistEstEvto obtenerAsistEstEvtoPorId(Long idAsistEstEvto) {
		return asistEstEvtoDAO.obtenerAsistEstEvtoPorId(idAsistEstEvto);
	}

	@Override
	public List<AsistEstEvto> obtenerTodos() {
		return asistEstEvtoDAO.obtenerTodos();
	}
	
	@Override
	public List<AsistEstEvto> obtenerPorAsistencia(String estadoAsistencia) {
		return asistEstEvtoDAO.obtenerPorAsistencia(estadoAsistencia);
	}
	
	public List<AsistEstEvto> obtenerPorEstyEvto(Estudiante estudiante) {
		return asistEstEvtoDAO.obtenerPorEstyEvto(estudiante);
	}


}
