package com.lucatinder.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
/**
 * 
 * @author Equipo1
 *La clase DaoPerfilImp implementa los
 *metodos de modificacion de datos
 *
 */
@Repository
public class DaoPerfilImp implements DaoPerfil {

	@PersistenceContext 
	EntityManager entityManager;
	 
}
