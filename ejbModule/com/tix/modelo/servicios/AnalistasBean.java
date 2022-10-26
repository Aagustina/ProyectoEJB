package com.tix.modelo.servicios;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class AnalistaBean
 */
@Stateless
public class AnalistasBean implements AnalistasBeanRemote {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public AnalistasBean() {
		// TODO Auto-generated constructor stub
	}

}
