package com.lucatinder.main.service;

import java.util.List;


import com.lucatinder.main.modelo.Materia;

/**
 * 
 * @author Equipo 1 
 * Interfaz MateriaServices se incluye en esta clase los servicios
 * ofrecidos al usuario por la clase Materia
 *
 */
public interface MateriaServices {
	public List<Materia> getMateria(int id);
}
