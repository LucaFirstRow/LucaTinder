package com.lucatinder.main.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.main.dao.DaoIntereses;
import com.lucatinder.main.dao.DaoMateria;
import com.lucatinder.main.dao.DaoPerfil;
import com.lucatinder.main.modelo.Intereses;
/**
 * 
 * @author Equipo 1
 * Clase InteresesServices
 *Implementacion de los metodos de InteresesService
 */
@Service
public class InteresesServicesImp implements InteresesServices {
	
	@Autowired
	DaoIntereses dIntereses;
	@Autowired
	DaoMateria dMateria;
	@Autowired
	DaoPerfil dPerfil;
    /**
     * 
     */
	public void addInteres(int id_perfil, int IdMateria) {
		Intereses newInt=new Intereses();
		newInt.setPerfil(dPerfil.findById(id_perfil).get());
		newInt.setMateria(dMateria.findById(IdMateria).get());
		dIntereses.save(newInt);
	}
	/**
	 * 
	 */
	public void deleteIntereses(int id) {
		dIntereses.deleteIntereses(id);
	}
	/**
	 * 
	 */
	public void  addNuevosIntereses(int idPerfil, int id_Materia[]) {
		deleteIntereses(idPerfil);
		for(int i=0;i< id_Materia.length;i++) {
			addInteres(idPerfil,id_Materia[i]);
		}
	}
}
