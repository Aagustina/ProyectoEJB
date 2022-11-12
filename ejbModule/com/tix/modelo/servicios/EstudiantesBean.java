package com.tix.modelo.servicios;

import java.util.List;

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
	public void registro(Estudiante estudiante) throws Exception {
		estudianteDAO.crear(estudiante);
	}

	@Override
	public List<Estudiante> obtenerEstudiantePorNombreUsuario(String nombreUsuario) {
		return estudianteDAO.obtenerPorNombreUsuario(nombreUsuario);
	}

	@Override
	public List<Estudiante> obtenerTodos() {
		return estudianteDAO.obtenerTodos();
	}

	@Override
	public List<Estudiante> obtenerTodos(String filtro) {
		return estudianteDAO.obtenerTodos(filtro);
	}

	@Override
	public Estudiante obtenerEstudiantePorId(long id) {
		return estudianteDAO.obtenerPorId(id);
	}

}
