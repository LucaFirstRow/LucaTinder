package com.lucatinder.main.service;

import com.lucatinder.main.modelo.Perfil;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucatinder.main.dao.DaoPerfilRepository;
@Service
@Transactional
public class PerfilServicesImp implements PerfilServices {

	@Autowired
	private DaoPerfilRepository Usuario;
	@Override
	/**
	 * Metodo addPerfil con entrada un objecto
	 * Perfil para añadir un nuevo usuario.
	 */
	public void addPerfil(Perfil perfil) {
		Usuario.save(perfil);
	}

}
