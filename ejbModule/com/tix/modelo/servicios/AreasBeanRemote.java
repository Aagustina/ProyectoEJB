package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Area;
import com.tix.modelo.entidades.Itr;

@Remote
public interface AreasBeanRemote {
	void registro(Area area);

	Itr obtenerAreaPorId(Long idArea);

	List<Area> obtenerTodos();

	List<Area> obtenerTodos(String filtro);

	
}
