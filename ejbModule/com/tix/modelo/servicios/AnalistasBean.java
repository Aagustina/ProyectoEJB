package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remove;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tix.modelo.daos.AnalistaDAO;
import com.tix.modelo.entidades.Analista;

/**
 * Session Bean implementation class AnalistaBean
 */
@Stateless
public class AnalistasBean implements AnalistasBeanRemote {

	@EJB
	AnalistaDAO analistaDAO = new AnalistaDAO();

	/**
	 * Default constructor.
	 */
	public AnalistasBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Remove
	public void registro(Analista analista) {
		analistaDAO.crear(analista);
	}

	@Override
	public List<Analista> obtenerTodos() {
		return analistaDAO.obtenerTodos();
	}

}
