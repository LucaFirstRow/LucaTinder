package com.lucatinder.main.utilidades;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.github.javafaker.Faker;
import com.lucatinder.main.modelo.Perfil;

@Repository
public class CargarDatos {
	
	 @PersistenceContext
	  private EntityManager entityManager;
	
	/*@Autowired
	private Perfil perfil;

	private Faker faker;
	
	public String cargarDatos() {
		
		return "prueba";
	}
	
	public ArrayList<Object> generarPerfiles(){
		
		ArrayList<Object> perfiles = new ArrayList<Object>();
		
		int genero = (int)(Math.random()*1)+1;
		int edad = (int) (Math.floor(Math.random() * (70 - 18 + 1)) + 18);
		
		for(int i = 0;i<20;i++) {
		
		perfiles.add(faker.artist().name());
		perfiles.add(faker.name().firstName());
		perfiles.add(genero);
		perfiles.add(edad);
		perfiles.add(faker.address().city());
		
		}
		
		
		return perfiles;*/
	
	/*@Transactional
	public void insertWithQuery() {
	    entityManager.createNativeQuery("INSERT INTO perfil (nombre) VALUES (?)")
	      .setParameter(1, "prueba").executeUpdate();
	}*/
	
	
	
}

