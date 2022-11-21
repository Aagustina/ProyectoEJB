package com.tix.modelo.servicios;

import java.util.List;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Itr;

@Remote
public interface ItrsBeanRemote {

	void registro(Itr itr);

	void editar(Itr itr);

	Itr obtenerItrPorId(Long idItr);

	List<Itr> obtenerTodos();

	List<Itr> obtenerTodos(String filtro);

}
