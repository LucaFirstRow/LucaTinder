package com.lucatinder.main.dao;

import java.util.List;

import com.lucatinder.main.modelo.Materia;

/**
 * 
 * @author Equipo1
 *La clase DaoMateria es la interfaz de los datos
 */
public interface DaoMateriaCustom {
	
	public List<Materia> listaMateria(int id );
	public List<Materia> listaMateriaNoSelect(int id);
}

