package com.lucatinder.main.service;

import java.util.Optional;

import com.lucatinder.main.modelo.Contactos;
import com.lucatinder.main.modelo.Perfil;
import java.util.List;
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
	public List<Perfil> mostrarSeleccion(int id);
	public void addContacto(Contactos contacto);
	public void editarPerfil(Perfil perfil);
	public List<Perfil> listaContacto(int id);
	//public void addDescartes(Descartes des);
	//public List<Perfil> listaDescartes(int id);
	public void addMatch(int idPerfil,int idPerfilLike);
	
}
