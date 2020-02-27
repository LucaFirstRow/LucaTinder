package com.lucatinder.main.dao;

import java.util.List;
import com.lucatinder.main.modelo.Perfil;
/**
 * 
 * @author Equipo1
 *La clase DaoPerfil es la interfaz de los datos
 */
public interface DaoPerfilCustom {
	
	public List<Perfil> mostrarSeleccion(int genero);
}
