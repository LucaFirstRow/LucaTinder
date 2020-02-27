package com.lucatic.main.utilidades;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;
import com.lucatinder.main.modelo.Perfil;

@Repository
public class CargarDatos {
	
	private ArrayList<Perfil> perfiles;
	
	private Perfil perfil;
	
	@Autowired
	private Faker faker;
	
	
	/**
	 * Este metodo carga 20 perfiles en la BBDD, se iniciara en la carga inicial de la pagina
	 */
	public void cargarDatos() {
		
		
		
	}
	
	/**
	 * Devuelve un ArrayList con una lista de perfiles falsos
	 */
	public ArrayList<Object> generarPerfiles(){
		
		int genero = (int)(Math.random()*1)+1;
		int edad = (int) (Math.floor(Math.random() * (70 - 18 + 1)) + 18);
		
		for(int i = 0;i<20;i++) {
			
		perfil.setNombre(faker.name().firstName());
		perfil.setGenero(genero);
		perfil.setEdad(edad);
		perfil.setFoto("randomUrl");
		perfil.setPoblacion(faker.address().city());	
		perfil.setDescripcion("x");
		perfil.setDescripcionCorta("y");
		
		perfiles.add(perfil);
		
		}
		
		
		return null;
	}

}
