package com.tix.modelo.servicios;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Estudiante;

@Remote
public interface EstudiantesBeanRemote {
	void registro(Estudiante estudiante);
}
