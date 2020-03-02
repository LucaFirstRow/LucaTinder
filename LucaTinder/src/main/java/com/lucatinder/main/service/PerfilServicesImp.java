package com.lucatinder.main.service;

import com.lucatinder.main.modelo.Contactos;
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
	public void addContacto(Contactos contacto){
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

}
