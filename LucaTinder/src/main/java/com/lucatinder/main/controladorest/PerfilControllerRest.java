package com.lucatinder.main.controladorest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lucatinder.main.modelo.Contactos;
import com.lucatinder.main.modelo.Perfil;
import com.lucatinder.main.modelo.User;
import com.lucatinder.main.service.PerfilServices;


/**
 * 
 * @author Equipo 1
 * La clase PerfilController es el controlador,
 * se encarga de controlar el flujo de datos de perfil
 * y la vista.
 */
@RestController
@RequestMapping(path = "/perfilrest")
public class PerfilControllerRest {
	
	private static final Logger logger=LoggerFactory.getLogger(PerfilControllerRest.class);
	
	@Autowired
	private PerfilServices service;
  

	/**
	 * 
	 * @author Equipo 1
	 * el metodo añadirUsuario añade un usuario a la BBDD
	 * 
	 */
	@PostMapping("/add")
	ResponseEntity<String> añadirUsuario(@RequestBody Perfil perfil) {
		//service.addPerfil(perfil);
		return ResponseEntity.ok().header("Header", "realizado con existo")
		        .body("la operacion se realizo correctamente");
	}

	/**
	 * 
	 * @author Equipo 1
	 * devuelve una lista con la seleccion de perfiles 
	 * 
	 */
	@GetMapping("/list")
	public Collection<Perfil> login(@RequestBody User user) {
		List<Perfil> seleccion=service.mostrarSeleccion(Integer.parseInt(user.getUserName()));
		return seleccion;
	}
	
	
	/**
	 * 
	 * @author Equipo 1
	 * Modifica un perfil pasandole el id perfil
	 * 
	 */
	@GetMapping("/edit")
	public Optional<Perfil> editarPerfil(@RequestParam("idPerfil") int id) {
		logger.info("Estoy en la etapa de EDIT");
		Optional<Perfil> perfil= service.findOne(id);
		return perfil;
	}
	
	
	/**
	 * @author Equipo 1
	 * Añade un contato pasandole el id perfil y el perfil like
	 * 
	 */
	@PostMapping("/addContacto")
	public ResponseEntity<String> addContactos(@RequestParam("idPerfil") int idPerfil,@RequestParam("idPerfilLike") int idPerfilLike) {
		Contactos nuevoLigue= new Contactos();
		//nuevoLigue.setIdPerfil(idPerfil);
		//nuevoLigue.setIdPerfilLike(idPerfilLike);
		service.addContacto(nuevoLigue);
		return ResponseEntity.ok().header("Header", "Contacto añadido con exito")
		        .body("la operacion se realizo correctamente");
	}	

}
