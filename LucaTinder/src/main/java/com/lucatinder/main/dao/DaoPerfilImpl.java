package com.lucatinder.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.lucatinder.main.modelo.Contactos;
import com.lucatinder.main.modelo.Descartes;
import com.lucatinder.main.modelo.Match;
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
				+ "FROM perfil WHERE perfil.genero<>?",Perfil.class);
		query.setParameter(1,genero);
		return (List<Perfil>)query.getResultList();
	}
	/**
	 * Metodo addContacto inserta un nuevo contactos
	 * en la tabla contactos
	 * 
	 * @Param contacto  nuevo contacto
	 */
	public int addContacto(Contactos contacto) {
		Query query=entityManager.createNativeQuery("INSERT INTO contactos"
				+ "(idContactos,idPerfil,idPerfilLike) VALUES (?,?,?)",Contactos.class);
		query.setParameter(2, contacto.getPerfil().getIdPerfil());
		query.setParameter(1,contacto.getIdContacto());
		query.setParameter(3,contacto.getPerfil2().getIdPerfil());
		return query.executeUpdate();
	}
	/**
	 * Metodo listaContactos muestra los contactos
	 * que tiene un usuario
	 * 
	 * @param id identificador de usuario
	 * @return Devulve una lista de contactos
	 * 
	 */
	public List<Perfil> listaContactos(int id){
		Query query=entityManager.createNativeQuery("SELECT perfil.*"
				+ "FROM (perfil JOIN contactos ON perfil.idPerfil=contactos.idPerfil)"
				+ "WHERE contactos.idPerfil=?");
		query.setParameter(1,id);
		return (List<Perfil>) query.getResultList();
	}
	 /**
	 * Metodo addDescartes inserta un nuevo usuario dislike
	 * en la tabla descartes
	 * 
	 * @Param descartes  nuevo descartes
	 */
	public int addDescartes(Descartes descartes) {
		Query query=entityManager.createNativeQuery("INSERT INTO descartes"
				+ "(idDescartes,idPerfil,idPerfilDisLike) VALUES (?,?,?)",Descartes.class);
		query.setParameter(2, descartes.getPerfil().getIdPerfil());
		query.setParameter(1,descartes.getIdDescartes());
		query.setParameter(3,descartes.getPerfil2().getIdPerfil());
		return query.executeUpdate();
	}
	
	
	/**
	 * Metodo listaDescartes muestra los contactos
	 * que tiene un usuario
	 * 
	 * @param id identificador de usuario
	 * @return Devulve una lista de contactos
	 * 
	 */
	public List<Perfil> listaDescartes(int id){
		Query query=entityManager.createNativeQuery("SELECT perfil.*"
				+ "FROM (perfil JOIN descartes ON perfil.idPerfil=descartes.idPerfil)"
				+ "WHERE descartes.idPerfil=?");
		query.setParameter(1,id);
		return (List<Perfil>) query.getResultList();
	}
	/**
	 * 
	 */
	public List<Contactos> usuariosMatch(int idPerfil, int idPerfilLike) {
	   Query query=entityManager.createNativeQuery("SELECT contactos.*"
	   		+ "FROM contactos WHERE (idPerfil=? AND idPerfilLike=?)"
	   		+ "OR (idPerfil=? AND idPerfilLike=?");
	   query.setParameter(0, idPerfil);
	   query.setParameter(1, idPerfilLike);
	   query.setParameter(2, idPerfilLike);
	   query.setParameter(3, idPerfil);
	   return (List<Contactos>)query.getResultList();
	}
	/**
	 * 
	 * 
	 */
	public int addMatch (Match match) {
		Query query=entityManager.createNativeQuery("INSERT INTO match"
				+ "(idMatch,idPerfilMatch1,idPerfilMatch2) VALUES (?,?,?)",Match.class);
		query.setParameter(2, match.getPerfil().getIdPerfil());
		query.setParameter(1,match.getIdMatch());
		query.setParameter(3,match.getPerfil2().getIdPerfil());
		return query.executeUpdate();
	}
	
}
