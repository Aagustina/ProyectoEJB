package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Analista;
import com.tix.modelo.entidades.Estudiante;

@Remote
public interface EstudiantesBeanRemote {
	void registro(Estudiante estudiante) throws Exception;
	
	void editar(Estudiante estudiante) throws Exception;

	List<Estudiante> obtenerEstudiantePorNombreUsuario(String nombreUsuario);

	List<Estudiante> obtenerTodos();

	List<Estudiante> obtenerTodos(String filtro);

	Estudiante obtenerEstudiantePorId(long id);
}
