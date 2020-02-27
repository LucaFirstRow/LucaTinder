package com.lucatinder.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.lucatinder.main.modelo.Perfil;
/**
 * 
 * @author Equipo1
 *La clase DaoPerfilImp implementa los
 *metodos de modificacion de datos
 *
 */
@Repository
public class DaoPerfilImpl implements DaoPerfilCustom {

	@PersistenceContext 
	EntityManager entityManager;
	/**
	 * Metodo mostrarSeleccion devuelve una lista de perfiles
	 * opuesta al genero del parametro de entrada
	 * 
	 * @param genero indica el genero de un usuario
	 * @return List<Perfil> Devuelve una lista de perfiles
	 */
	public List<Perfil> mostrarSeleccion(int genero){
		Query query=entityManager.createNativeQuery("SELECT *"
				+ "FROM mylibrary.perfil WHERE perfil.genero<>?",Perfil.class);
		query.setParameter(1,genero);
		return (List<Perfil>)query.getResultList();
	}
}
