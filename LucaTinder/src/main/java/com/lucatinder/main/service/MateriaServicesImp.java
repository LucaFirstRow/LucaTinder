package com.lucatinder.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinder.main.dao.DaoMateria;
import com.lucatinder.main.modelo.Materia;
/**
 * 
 * @author Equipo 1
 * Clase MateriaServices
 *Implementacion de los metodos de MateriaService
 */
@Service
@Transactional
public class MateriaServicesImp implements MateriaServices {
	@Autowired
	DaoMateria dMaterias;
	/**
	 * Metodo allMateria() muestra una lista de las materias en el sistema
	 * 
	 * 
	 * @param  Id del perfil
	 * @return List<Materia> Devuelve una Lista <Materia> con todas la materias del sistema 
	 */
	@Override
	public List<Materia> getMateria(int id) {
		return dMaterias.listaMateria(id);
	}
	
	/**
	 * Metodo allMateriaNoSelect() muestra una lista de las materias que no han sido seleccionadas por el usuario
	 * 
	 * 
	 * @param  Id del perfil al que quieres ver las materias no seleccionadas
	 * @return List<Materia> Devuelve una Lista <Materia> con todas la materias que no han sido seleccioandass 
	 */
	@Override
	public List<Materia> getMateriaNoSelect(int id) {
		return dMaterias.listaMateriaNoSelect(id);
	}
	
	
	

	
}
