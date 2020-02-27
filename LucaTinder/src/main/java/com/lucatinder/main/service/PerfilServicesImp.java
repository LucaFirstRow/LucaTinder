package com.lucatinder.main.service;

import com.lucatinder.main.modelo.Perfil;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucatinder.main.dao.DaoPerfilRepository;

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
	private DaoPerfilRepository Usuario;
	@Override
	/**
	 * Metodo addPerfil como parametro de entrada un objecto
	 * Perfil. La funcionalidad es añadir un nuevo usuario.
	 * @param perfil 
	 */
	public void addPerfil(Perfil perfil) {
		Usuario.save(perfil);
	}

}
