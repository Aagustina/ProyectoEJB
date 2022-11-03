package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.DepartamentoDAO;
import com.tix.modelo.entidades.Departamento;

/**
 * Session Bean implementation class DepartamentosBean
 */
@Stateless
public class DepartamentosBean implements DepartamentosBeanRemote {

	@EJB
	DepartamentoDAO departamentoDAO = new DepartamentoDAO();

	/**
	 * Default constructor.
	 */
	public DepartamentosBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Departamento departamento) {
		departamentoDAO.crear(departamento);
	}

	@Override
	public Departamento obtenerDepartamentoPorId(Long idDepartamento) {
		return departamentoDAO.obtenerDepartamentoPorId(idDepartamento);
	}

	@Override
	public List<Departamento> obtenerTodos() {
		return departamentoDAO.obtenerTodos();
	}

	@Override
	public List<Departamento> obtenerTodos(String filtro) {
		return departamentoDAO.obtenerTodos(filtro);
	}

}
