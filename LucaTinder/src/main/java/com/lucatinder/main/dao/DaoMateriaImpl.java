package com.lucatinder.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lucatinder.main.modelo.Materia;

/**
 * 
 * @author Equipo1
 *La clase DaoMaterialImp implementa los
 *metodos de modificacion de datos
 *
 */
@Repository
public class DaoMateriaImpl implements DaoMateriaCustom {
	@PersistenceContext 
	EntityManager entityManager;
}
