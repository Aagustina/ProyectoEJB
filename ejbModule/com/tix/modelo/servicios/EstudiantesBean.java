package com.tix.modelo.servicios;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.EstudianteDAO;
import com.tix.modelo.entidades.Estudiante;

/**
 * Session Bean implementation class EstudiantesBean
 */
@Stateless
public class EstudiantesBean implements EstudiantesBeanRemote {

	@EJB
	EstudianteDAO estudianteDAO = new EstudianteDAO();

	/**
	 * Default constructor.
	 */
	public EstudiantesBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Estudiante estudiante) {
		estudianteDAO.crear(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantePorNombreUsuario(String nombreUsuario) {
		return estudianteDAO.obtenerPorNombreUsuario(nombreUsuario);
	}

}
