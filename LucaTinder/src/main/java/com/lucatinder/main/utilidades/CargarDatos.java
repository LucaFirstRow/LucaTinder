package com.lucatinder.main.utilidades;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;
import com.lucatinder.main.modelo.Perfil;

@Repository
public class CargarDatos {
	
	@Autowired
	private ArrayList<Object> perfiles;
	
	private Perfil perfil;
	
	@Autowired
	private Faker faker;
	
	public void cargarDatos() {
		
		
	}
	
	public ArrayList<Object> generarPerfiles(){
		
		int genero = (int)(Math.random()*1)+1;
		int edad = (int) (Math.floor(Math.random() * (70 - 18 + 1)) + 18);
		
		for(int i = 0;i<20;i++) {
		
		perfiles.add(faker.artist().name());
		perfiles.add(faker.name().firstName());
		perfiles.add(genero);
		perfiles.add(edad);
		perfiles.add(faker.address().city());
		
		}
		
		
		return null;
	}

}
