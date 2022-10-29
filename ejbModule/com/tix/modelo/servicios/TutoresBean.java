package com.tix.modelo.servicios;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.TutorDAO;
import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Tutor;

/**
 * Session Bean implementation class TutoresBean
 */
@Stateless
public class TutoresBean implements TutoresBeanRemote {

	@EJB
	TutorDAO tutorDAO = new TutorDAO();

	/**
	 * Default constructor.
	 */
	public TutoresBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Tutor tutor) {
		tutorDAO.crear(tutor);
	}

	@Override
	public Tutor obtenerTutorPorNombreUsuario(String nombreUsuario) {
		return tutorDAO.obtenerTutorPorNombreUsuario(nombreUsuario);
	}
}
