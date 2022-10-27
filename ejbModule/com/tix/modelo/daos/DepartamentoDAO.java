package com.tix.modelo.daos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tix.modelo.entidades.Departamento;
import com.tix.modelo.entidades.Localidad;

/**
 * Session Bean implementation class DepartamentoDAO
 */
@Stateless
public class DepartamentoDAO {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public DepartamentoDAO() {
		// TODO Auto-generated constructor stub
	}

	public void crear(Departamento departamento) {
		em.persist(departamento);
		em.flush();
	}

	public Departamento obtenerDepartamentoPorId(Long idDepartamento) {
		return em.find(Departamento.class, idDepartamento);
	}

}
