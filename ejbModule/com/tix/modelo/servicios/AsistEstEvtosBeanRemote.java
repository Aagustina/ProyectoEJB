package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.AsistEstEvto;
import com.tix.modelo.entidades.Estudiante;
import com.tix.modelo.entidades.Evento;
import com.tix.modelo.entidades.Itr;

@Remote
public interface AsistEstEvtosBeanRemote {

	void registro(AsistEstEvto asistEstEvto);

	void editar(AsistEstEvto asistEstEvto);

	AsistEstEvto obtenerAsistEstEvtoPorId(Long idAsistEstEvto);

	List<AsistEstEvto> obtenerTodos();
	
	List<AsistEstEvto> obtenerPorAsistencia(String estadoAsistencia);

	public List<AsistEstEvto> obtenerPorEstyEvto(Estudiante estudiante);
}
