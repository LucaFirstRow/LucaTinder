package com.lucatinder.main.utilidades;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.github.javafaker.Faker;
import com.lucatinder.main.modelo.Perfil;
import com.lucatinder.main.service.PerfilServicesImp;


/**
 * @author Equipo1
 * 
 * Esta clase realiza la insercion de perfiles aleactorios cuando carga se carga la pagina inicial
 *
 */

@Repository
public class CargarDatos {
	
	 @PersistenceContext
	 private EntityManager entityManager;
	 
	 @Autowired
	 PerfilServicesImp prueba;
	

	 /**
	  * @author Equipo1
	  * 
	  * Esta clase realiza la insercion de perfiles aleactorios cuando carga la pagina inicial
	  *
	  */	
	public void generarPerfiles(){
		
		Perfil perfiles = new Perfil();
		Faker faker = new Faker();
		
		int genero = 0;
		int edad = 0;
		
		for(int i = 0;i<20;i++) {
			
			genero = (int)(Math.random()*1)+1;
			edad = (int) (Math.floor(Math.random() * (70 - 18 + 1)) + 18);
		
			perfiles.setGenero(genero);
			perfiles.setEdad(edad);
			perfiles.setDescripcion("xxxxxxxxxxx");
			perfiles.setFoto("url");
			perfiles.setNombre(faker.artist().name());
			perfiles.setDescripcionCorta("yyyyyyyyyyyyyyyy");
			perfiles.setPoblacion(faker.address().city());
			
			prueba.addPerfil(perfiles);
		}
		


	    System.out.println("Perfil insertado");
		
}

	
	
	
}



