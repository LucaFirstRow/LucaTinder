package com.lucatinder.main.service;

import com.lucatinder.main.modelo.Contactos;
import com.lucatinder.main.modelo.Descartes;
import com.lucatinder.main.modelo.Match;
import com.lucatinder.main.modelo.Perfil;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucatinder.main.dao.DaoPerfil;
import java.util.Optional;
import java.util.List;
/**
 * 
 * @author Equipo 1
 * Clase PerfilServices Imp
 *Implementacion de los metodos de PerfilServices
 */
@Service
@Transactional
public class PerfilServicesImp implements PerfilServices {

	/**
	 * {@value #Usuario} DaoPerfiRepository se declara esta variable
	 * para la obtencion de los datos de la BBDD.
	 */
	@Autowired
	private DaoPerfil Usuario;
	@Override
	/**
	 * Metodo addPerfil como parametro de entrada un objecto
	 * Perfil. La funcionalidad es añadir un nuevo usuario.
	 * @param perfil 
	 */
	public void addPerfil(Perfil perfil) {
		Usuario.save(perfil);
	}
	/**
	 * Metodo findOne busca al usuario por el id
	 * y devuelve su informacion
	 * @param int id identificador del usuario
	 * @return Perfil
	 */
	public Optional<Perfil> findOne(int id){
		return Usuario.findById(id);
	}
	/**
	 * Metodo mostrarSeleccion muestra una lista de usuarios
	 * del genero opuesto al id
	 * 
	 * @param int id identificador del usuario
	 * @return List<Perfil> Devuelve una Lista de perfiles
	 */
	public List<Perfil> mostrarSeleccion(int id){
		
		Optional<Perfil> usuario=findOne(id);
		return Usuario.mostrarSeleccion(usuario.get().getGenero());
	}
	/**
	 * Metodo editarPerfil permite modifiar un perfil,
	 * pasandole como parametro el objecto perfil
	 * @param perfil 
	 */
	public void editarPerfil(Perfil perfil){
		Usuario.save(perfil);
	}
	
	/**
	 * Metodo addContacto añade un nuevo contacto en la 
	 * tabla contactos
	 * @Param contacto Indica un nuevo contacto
	 */
	public void addContacto(int idPerfil,int idPerfilLike){
		Optional<Perfil> perfil=findOne(idPerfil);
		Optional<Perfil> perfil2=findOne(idPerfilLike);
		Contactos contacto=new Contactos();
		contacto.setPerfil(perfil.get());
		contacto.setPerfil2(perfil2.get());
		Usuario.addContacto(contacto);
	}
	/**
	 * listaContacto muestra una lista de contactos 
	 * de un usuario
	 * @Param id identificador usuario
	 * @return Devulve una lista Contactos
	 */
	public List<Perfil> listaContacto(int id){
	   
		return Usuario.listaContactos(id);
	}
	/**
	 * Metodo addDescartes añade un nuevo contacto en la 
	 * tabla contactos
	 * @Param contacto Indica un nuevo contacto
	 */
	public void addDescartes(int idPerfil,int idPerfilDisLike){
		Optional<Perfil> perfil=findOne(idPerfil);
		Optional<Perfil> perfil2=findOne(idPerfilDisLike);
		Descartes descartes=new Descartes();
		descartes.setPerfil(perfil.get());
		descartes.setPerfil2(perfil2.get());
		Usuario.addDescartes(descartes);
	}
	/**
	 * listaDescartes muestra la lista de descartes 
	 * de un usuario
	 * @Param id identificador usuario
	 * @return Devulve una listade descartes
	 */
	public List<Perfil> listaDescartes(int id){
	   
		return Usuario.listaDescartes(id);
	}
    
	public void addMatch(int idPerfil,int idPerfilLike) {
		List<Contactos> p=Usuario.usuariosMatch(idPerfil,idPerfilLike);
		if(p.size()==2) {
			for(int i=0;i<p.size();i++) {
				Match match=new Match();
				match.setPerfil(p.get(i).getPerfil());
				match.setPerfil2(p.get(i).getPerfil2());
				Usuario.addMatch(match);
			}
		}
	}
}
