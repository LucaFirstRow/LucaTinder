package com.lucatic.main.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller("/util")
public class UtilController {
	
	@Autowired
	com.lucatinder.main.utilidades.CargarDatos cargar;
	
	
	@RequestMapping(value = "/cargardatos", method = RequestMethod.GET)
	public String cargarDatos() {
		

		
		return "index";		
	}
	
}
