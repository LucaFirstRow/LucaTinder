package com.lucatinder.main.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import java.util.List;
import java.util.Set;


import com.lucatinder.main.modelo.Materia;

/**
 * @author Gsancho
 * 
 * Modelo perteneciente a la entidad Perfil , con clave foranea enlazada a la tabla Materia y sus correspondientes
 * join a la tabla intereses, resultado de su relacion N:M
 *
 */
@Entity
@Table(name = "perfil")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPerfil;
	private String nombre;
	private int genero;
	private int edad;
	private String descripcion;
	private String descripcionCorta;
	private String poblacion;
	private String foto;

	@JoinTable(name = "intereses", joinColumns = {
			@JoinColumn(name = "idPerfil", referencedColumnName = "idPerfil") }, inverseJoinColumns = {
					@JoinColumn(name = "idMateria", referencedColumnName = "idMateria") })

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	private List<Materia> arrayMateria;

	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPerfil")
    private Set<Contactos> contactos;
	
	
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

	public List<Materia> getArrayMaterias() {
		return arrayMateria;
	}

	public void setArrayMaterias(List<Materia> arrayMaterias) {
		this.arrayMateria = arrayMaterias;
	}

}
