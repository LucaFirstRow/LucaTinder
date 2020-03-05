package com.lucatinder.main.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.lucatinder.main.modelo.Intereses;

/**
 * 
 * @author Equipo1
 *La clase DaoInteresesImp implementa los
 *metodos de modificacion de datos
 *
 */
@Repository
public class DaoInteresesImpl implements DaoInteresesCustom {
	
	@PersistenceContext 
	EntityManager entityManager;
	
	public void deleteIntereses(int id) {
		System.out.println("ESTA ES LA CONSULTA Con id -------"+id);
		Query query=entityManager.createNativeQuery("DELETE FROM intereses where id_perfil=?;");
		query.setParameter(1, id);
		query.executeUpdate();
		System.out.println("EDES^PUESSS -------"+id);
	}
}
