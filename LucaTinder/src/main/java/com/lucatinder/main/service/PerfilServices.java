package com.lucatinder.main.service;

import java.util.Optional;
import com.lucatinder.main.modelo.Perfil;
/**
 * 
 * @author Equipo 1 
 * Interfaz PerfilServices se incluye en esta clase los servicios
 * ofrecidos al usuario
 *
 */
public interface PerfilServices {

	public void addPerfil(Perfil perfil);
	public Optional<Perfil> findOne(int id);
}
