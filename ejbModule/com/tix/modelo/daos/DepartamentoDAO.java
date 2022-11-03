package com.tix.modelo.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.tix.modelo.entidades.Departamento;
import com.tix.modelo.entidades.Itr;
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
	
	public List<Departamento> obtenerTodos() {
		TypedQuery<Departamento> query = em.createQuery("SELECT d FROM Departamento d", Departamento.class);
		return query.getResultList();
	}

	public List<Departamento> obtenerTodos(String filtro) {
		TypedQuery<Departamento> query = em.createQuery("SELECT d FROM Departamento d WHERE d.nombre LIKE :nombre", Departamento.class)
				.setParameter("nombre", filtro);
		return query.getResultList();
	}

}
