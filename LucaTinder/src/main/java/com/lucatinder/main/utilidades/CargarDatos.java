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
		
		ArrayList<Perfil> auxPerfiles = generarDatos();
		int size = auxPerfiles.size()-1;
		Faker faker = new Faker();
		int edad = 0;
		int randomPerfil = 0;
		
		for(int i = 0;i<20;i++) {
			
			Perfil perfiles = new Perfil();
			
			edad = (int) (Math.floor(Math.random() * (70 - 18 + 1)) + 18);
			randomPerfil = (int) (Math.floor(Math.random() * (size - 1 + 1) + 1));
		
			perfiles.setGenero(auxPerfiles.get(randomPerfil).getGenero());
			perfiles.setEdad(edad);
			perfiles.setDescripcion(faker.lorem().paragraph(2));
			perfiles.setFoto("/resources/images/perfil/sinfoto.png");
			perfiles.setNombre(auxPerfiles.get(randomPerfil).getNombre());
			perfiles.setDescripcionCorta(faker.lorem().paragraph(1));
			perfiles.setPoblacion(faker.address().city());
			System.out.println(perfiles.getDescripcion());
			prueba.addPerfil(perfiles);
		}
	    System.out.println("Perfil insertado");
}
	
	 /**
	  * @author Equipo1
	  * 
	  * Este metodo retorna un Arraylist con nombres y generos.
	  *
	  */	
	private ArrayList<Perfil> generarDatos() {
		
		ArrayList<Perfil> perfiles = new ArrayList<Perfil>();
		String [] nombre = {"Yusi","Fernando","Gonzalo","Javier","Maria","Sebastian","Anabel","Antonio","Daniel","German","David","Anastasia"};
		int [] genero = {0,1,1,1,0,1,0,1,1,1,1,0};

		for(int i = 0;i<nombre.length;i++) {
			Perfil persona = new Perfil();
			persona.setNombre(nombre[i]);
			persona.setGenero(genero[i]);
			perfiles.add(persona);
		}
		
		return perfiles;
		
	}

	
}



