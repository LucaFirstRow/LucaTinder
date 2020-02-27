package com.lucatinder.main.modelo;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Gsancho
 * 
 * Modelo perteneciente a la entidad Materia , con clave foranea enlazada a la tabla Perfil y sus correspondientes
 * join a la tabla intereses, resultado de su relacion M:N
 *
 */

@Entity
@Table(name = "materia")
public class Materia {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMateria;
	private String descripcion;
	
	
	   @ManyToMany(
	    		mappedBy = "arrayMateria", 
	    		fetch = FetchType.LAZY, 
	    		cascade = CascadeType.ALL)
	private ArrayList<Perfil> arrayPerfil;


	public int getIdMateria() {
		return idMateria;
	}


	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public ArrayList<Perfil> getArrayPerfil() {
		return arrayPerfil;
	}


	public void setArrayPerfil(ArrayList<Perfil> arrayPerfil) {
		this.arrayPerfil = arrayPerfil;
	}


	@Override
	public String toString() {
		return "Materia [idMateria=" + idMateria + ", descripcion=" + descripcion + ", arrayPerfil=" + arrayPerfil
				+ "]";
	}
	
	
	
}
