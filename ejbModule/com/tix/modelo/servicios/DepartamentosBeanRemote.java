package com.tix.modelo.servicios;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Departamento;

@Remote
public interface DepartamentosBeanRemote {
	void registro(Departamento departamento);

	Departamento obtenerDepartamentoPorId(Long idDepartamento);
}
