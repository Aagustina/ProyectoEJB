package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Tutor;

@Remote
public interface TutoresRemote {
	void crear(Tutor tutor);

	void actualizar(Tutor tutor);

	void borrar(Long id);

	List<Tutor> obtenerTodos();

	List<Tutor> obtenerTodos(String filtro);
}
