package com.lucatinder.main.controladorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.lucatinder.main.utilidades.CargarDatos;


@RestController
@RequestMapping(path = "/util")
public class UtilControllerRest {
	
	@Autowired
	CargarDatos cargar;
	
	@GetMapping("/cargardatos")
	public ResponseEntity<String>  cargarDatos() {
		cargar.generarPerfiles();
		return ResponseEntity.ok().header("Header", "realizado con existo")
		        .body("la operacion se realizo correctamente");		
	}


}
