package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Tutor;

@Remote
public interface TutoresBeanRemote {
	void registro(Tutor tutor) throws Exception;

	List<Tutor> obtenerTutorPorNombreUsuario(String nombreUsuario);

	List<Tutor> obtenerTodos();

	List<Tutor> obtenerTodos(String filtro);
}
