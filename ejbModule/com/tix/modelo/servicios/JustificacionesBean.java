package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.DepartamentoDAO;
import com.tix.modelo.daos.JustificacionDAO;
import com.tix.modelo.entidades.Departamento;
import com.tix.modelo.entidades.Justificacion;

/**
 * Session Bean implementation class DepartamentosBean
 */
@Stateless
public class JustificacionesBean implements JustificacionesBeanRemote {

	@EJB
	JustificacionDAO justificacionDAO = new JustificacionDAO();

	/**
	 * Default constructor.
	 */
	public JustificacionesBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Justificacion justificacion) {
		justificacionDAO.crear(justificacion);
	}

	@Override
	public Justificacion obtenerJustificacionPorId(Long idJustificacion) {
		return justificacionDAO.obtenerJustificacionPorId(idJustificacion);
	}

	@Override
	public List<Justificacion> obtenerTodos() {
		return justificacionDAO.obtenerTodos();
	}
}
