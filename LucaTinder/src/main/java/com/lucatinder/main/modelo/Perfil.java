package com.lucatinder.main.modelo;


/**
 * @author Equipo 1
 * Esta es nuestra clase entidad. En esta clase se aporta 
 * datos del usuario:nombre,genero,id,edad...
 * 
 */
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "persona")

public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPerfil;
	private String nombre;
	private int genero;
	private int edad;
	private String descripcion;
	private String descripcionCorta;
	private String poblacion;
	private String foto;
	
	@JoinTable
	(name = "intereses", 
	 joinColumns = { 
			 @JoinColumn(
					name = "idPerfil", 
					referencedColumnName = "idPerfil") }, 
	 inverseJoinColumns = { 
			 @JoinColumn(
			 		name = "idMateria",
			 		referencedColumnName = "idMateria") })

@ManyToMany(
		fetch = FetchType.LAZY, 
		cascade = CascadeType.ALL)
	
	
	private ArrayList<Materia> arrayMateria;
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public ArrayList<Materia> getArrayMaterias() {
		return arrayMaterias;
	}
	public void setArrayMaterias(ArrayList<Materia> arrayMaterias) {
		this.arrayMaterias = arrayMaterias;
	}
	
	
	
}
