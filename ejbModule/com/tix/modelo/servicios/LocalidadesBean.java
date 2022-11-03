package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.LocalidadDAO;
import com.tix.modelo.entidades.Localidad;

/**
 * Session Bean implementation class LocalidadBean
 */
@Stateless
public class LocalidadesBean implements LocalidadesBeanRemote {

	@EJB
	LocalidadDAO localidadDAO = new LocalidadDAO();

	/**
	 * Default constructor.
	 */
	public LocalidadesBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Localidad localidad) {
		localidadDAO.crear(localidad);
	}

	@Override
	public Localidad obtenerLocalidadPorId(Long idLocalidad) {
		return localidadDAO.obtenerLocalidadPorId(idLocalidad);
	}

	@Override
	public List<Localidad> obtenerTodos() {
		return localidadDAO.obtenerTodos();
	}

	@Override
	public List<Localidad> obtenerTodos(String filtro) {
		return localidadDAO.obtenerTodos(filtro);
	}

}
