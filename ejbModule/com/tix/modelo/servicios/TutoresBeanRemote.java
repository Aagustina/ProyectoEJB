package com.tix.modelo.servicios;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Tutor;

@Remote
public interface TutoresBeanRemote {
	void registro(Tutor tutor);
	
	Tutor obtenerTutorPorNombreUsuario(String nombreUsuario);
}
