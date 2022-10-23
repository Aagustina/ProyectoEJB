package com.tix.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Analista
 *
 */
@Entity
@Table(name = "ANALISTAS")
@NamedQuery(name = "Analista.findAll", query = "SELECT a FROM Analista a")
@PrimaryKeyJoinColumn(name = "ID_ANALISTA")

public class Analista extends Usuario {
	private static final long serialVersionUID = 1L;

}
