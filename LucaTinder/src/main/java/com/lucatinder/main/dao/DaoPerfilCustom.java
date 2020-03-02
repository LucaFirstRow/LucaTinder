package com.lucatinder.main.dao;

import java.util.List;
import com.lucatinder.main.modelo.Perfil;
import com.lucatinder.main.modelo.Contactos;
/**
 * 
 * @author Equipo1
 *La clase DaoPerfil es la interfaz de los datos
 */
public interface DaoPerfilCustom {
	
	public List<Perfil> mostrarSeleccion(int genero);
	public int addContacto(Contactos contacto);
	public List<Perfil> listaContactos(int id);
	//public int addDescartes(Descartes descartes);
	//public List<Perfil> listaDescartes(int id);
}
