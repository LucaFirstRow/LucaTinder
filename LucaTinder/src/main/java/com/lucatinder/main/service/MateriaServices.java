package com.lucatinder.main.service;

import java.util.List;
import java.util.Optional;

import com.lucatinder.main.modelo.Materia;
import com.lucatinder.main.modelo.Perfil;

/**
 * 
 * @author Equipo 1 
 * Interfaz MateriaServices se incluye en esta clase los servicios
 * ofrecidos al usuario por la clase Materia
 *
 */
public interface MateriaServices {
	public List<Materia> getMateria(int id);
	public List<Materia> getMateriaNoSelect(int id);
	public Optional<Materia> findOne(int id);
}
