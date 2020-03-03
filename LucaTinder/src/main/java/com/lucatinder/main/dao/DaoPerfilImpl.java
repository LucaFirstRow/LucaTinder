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
	public List<Perfil> mostrarSeleccion(Perfil perfil){
		Query query=entityManager.createNativeQuery("SELECT * FROM perfil "
				+ "WHERE perfil.genero<>? AND "
				+ "((id_perfil NOT IN (Select id_perfil_like from contactos where id_perfil=?)) "
				+ "AND (id_perfil NOT IN (Select id_perfil_dislike from descartes where id_perfil=?)));",Perfil.class);
		query.setParameter(1,perfil.getGenero());
		query.setParameter(2,perfil.getIdPerfil());
		query.setParameter(3,perfil.getIdPerfil());
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
				+ "(id_perfil,id_perfil_like,id_contacto) VALUES (?,?,?)",Contactos.class);
		query.setParameter(1, contacto.getPerfil().getIdPerfil());
		query.setParameter(3,contacto.getIdContacto());
		query.setParameter(2,contacto.getPerfil2().getIdPerfil());
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
		System.out.println("----  Lista Contactos (al inicio)");
		Query query=entityManager.createNativeQuery("SELECT perfil.*"
				+ "FROM (perfil JOIN contactos ON perfil.id_perfil=contactos.id_perfil)"
				+ "WHERE contactos.id_perfil=?",Perfil.class);
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
				+ "(id_descartes,id_perfil,id_perfil_dislike) VALUES (?,?,?)",Descartes.class);
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
				+ "FROM (perfil JOIN descartes ON perfil.id_perfil=descartes.id_perfil)"
				+ "WHERE descartes.id_perfil=?",Perfil.class);
		query.setParameter(1,id);
		return (List<Perfil>) query.getResultList();
	}
	/**
	 * Metodo usuarioMatch permite indentificar los usuarios
	 * que ha dado like mutuamente
	 * 
	 * @Param idPerfil identificador del Usuario
	 * @Para idPerfilLike identificador del Usuario que le gusta
	 * @return List<Contactos> Devuelve una lista de contactos   
	 */
	public List<Contactos> usuariosMatch(int idPerfil, int idPerfilLike) {
	   Query query=entityManager.createNativeQuery("SELECT contactos.*"
	   		+ "FROM contactos WHERE (id_perfil=? AND id_perfil_like=?)"
	   		+ "OR (id_perfil=? AND id_perfil_like=?",Contactos.class);
	   query.setParameter(1, idPerfil);
	   query.setParameter(2, idPerfilLike);
	   query.setParameter(3, idPerfilLike);
	   query.setParameter(4, idPerfil);
	   return (List<Contactos>)query.getResultList();
	}
	/**
	 * Metodo addMatch añade los id de los usuarios
	 * Like 
	 * @Param match objecto tipo Match
	 */
	public int addMatch (Match match) {
		Query query=entityManager.createNativeQuery("INSERT INTO match"
				+ "(id_match,id_perfil_match1,id_perfil_match2) VALUES (?,?,?)",Match.class);
		query.setParameter(2, match.getPerfil().getIdPerfil());
		query.setParameter(1,match.getIdMatch());
		query.setParameter(3,match.getPerfil2().getIdPerfil());
		return query.executeUpdate();
	}
	/**
	 * Metodo de mostrar perfiles match con el usuario
	 * @Param id identiificador de usuario
	 * @return Lista de perfiles entrelazados
	 */
	public List<Perfil> listaMatch(int id){
		Query query=entityManager.createNativeQuery("SELECT perfil.*"
				+ "FROM (perfil JOIN match ON perfil.id_perfil=match.id_perfil_match_1)"
				+ "WHERE match.id_perfil_match_1=?",Perfil.class);
		query.setParameter(1,id);
		List<Perfil> perfiles =(List<Perfil>) query.getResultList();
		System.out.println("---- "+perfiles);
		System.out.println("---- Lista Contactos (fin)");	
		return perfiles;
	}
}
