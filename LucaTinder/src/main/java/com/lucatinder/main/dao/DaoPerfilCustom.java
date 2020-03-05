package com.lucatinder.main.dao;

import java.util.List;
import com.lucatinder.main.modelo.Perfil;
import com.lucatinder.main.modelo.Contactos;
import com.lucatinder.main.modelo.Descartes;
import com.lucatinder.main.modelo.Match;
/**
 * 
 * @author Equipo1
 *La clase DaoPerfil es la interfaz de los datos
 */
public interface DaoPerfilCustom {
	
	public List<Perfil> mostrarSeleccion(Perfil perfil);
	public int addContacto(Contactos contacto);
	public List<Perfil> listaContactos(int id);
	public int addDescartes(Descartes descartes);
	public List<Perfil> listaDescartes(int id);
	public List<Contactos> usuariosMatch(int idPerfil, int idPerfilLike);
	public int addMatch(Match match);
	public List<Perfil> listaMatch(int id);

}
