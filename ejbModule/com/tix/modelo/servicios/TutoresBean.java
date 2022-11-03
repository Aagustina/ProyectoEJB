package com.tix.modelo.servicios;

import java.util.List;

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
	public void registro(Tutor tutor) throws Exception {
		tutorDAO.crear(tutor);
	}

	@Override
	public List<Tutor> obtenerTutorPorNombreUsuario(String nombreUsuario) {
		return tutorDAO.obtenerTutorPorNombreUsuario(nombreUsuario);
	}
}
