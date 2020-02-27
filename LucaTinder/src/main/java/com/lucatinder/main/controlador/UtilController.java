package com.lucatinder.main.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lucatinder.main.utilidades.CargarDatos;


@Controller("/util")
public class UtilController {
	
	@Autowired
	CargarDatos cargar;
	
	
	@RequestMapping(value = "/cargardatos", method = RequestMethod.GET)
	public String cargarDatos() {
		
		cargar.cargarDatos();
		
		return "index";		
	}
	
}
