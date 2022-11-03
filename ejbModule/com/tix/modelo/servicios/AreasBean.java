package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.AreaDAO;
import com.tix.modelo.entidades.Area;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class AreasBean
 */
@Stateless
public class AreasBean implements AreasBeanRemote {

	@EJB
	AreaDAO areaDAO = new AreaDAO();

	/**
	 * Default constructor.
	 */
	public AreasBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Area area) {
		areaDAO.crear(area);

	}

	@Override
	public Itr obtenerAreaPorId(Long idArea) {
		return areaDAO.obtenerAreaPorId(idArea);
	}

	@Override
	public List<Area> obtenerTodos() {
		return areaDAO.obtenerTodos();
	}

	@Override
	public List<Area> obtenerTodos(String filtro) {
		return areaDAO.obtenerTodos(filtro);
	}

}
