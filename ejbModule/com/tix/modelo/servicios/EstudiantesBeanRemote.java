package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;
import com.tix.modelo.entidades.Estudiante;

@Remote
public interface EstudiantesBeanRemote {
	void crear(Estudiante estudiante);

	void actualizar(Estudiante estudiante);

	void borrar(Long id);

	List<Estudiante> obtenerTodos();

	List<Estudiante> obtenerTodos(String filtro);
}
