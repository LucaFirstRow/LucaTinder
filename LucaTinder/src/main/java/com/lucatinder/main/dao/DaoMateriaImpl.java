package com.lucatinder.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	
	public List<Materia> listaMateria(int id){
		Query query=entityManager.createNativeQuery("select materia.id_materia, materia.descripcion_materia "
				+ "FROM  intereses join materia  on intereses.id_materia= materia.id_materia where  intereses.id_perfil=?;",Materia.class);
		query.setParameter(1, id);
		return (List<Materia>) query.getResultList();
	}
	public List<Materia> listaMateriaNoSelect(int id){
		Query query=entityManager.createNativeQuery("select materia.* from materia  where materia.id_materia NOT IN (select intereses.id_materia from intereses where intereses.id_perfil=?)",Materia.class);
		query.setParameter(1, id);
		return (List<Materia>) query.getResultList();
	}
}
