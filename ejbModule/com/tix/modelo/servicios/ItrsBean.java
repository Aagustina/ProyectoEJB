package com.tix.modelo.servicios;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.tix.modelo.daos.ItrDAO;
import com.tix.modelo.entidades.Itr;

/**
 * Session Bean implementation class ItrsBean
 */
@Stateless
public class ItrsBean implements ItrsBeanRemote {

	@EJB
	ItrDAO itrDAO = new ItrDAO();

	/**
	 * Default constructor.
	 */
	public ItrsBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registro(Itr itr) {
		itrDAO.crear(itr);

	}

	@Override
	public Itr obtenerItrPorId(Long idItr) {
		return itrDAO.obtenerLocalidadPorId(idItr);
	}

}
