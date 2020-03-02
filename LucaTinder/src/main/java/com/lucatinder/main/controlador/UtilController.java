package com.lucatinder.main.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ModelAttribute;


import com.lucatinder.main.utilidades.CargarDatos;


@Controller
public class UtilController {
	
	@Autowired
	CargarDatos cargar;
	
	
	@RequestMapping(value = "/cargardatos", method = RequestMethod.GET)
	public String cargarDatos() {
		cargar.generarPerfiles();
		return "index";		
	}
	
	
	@ModelAttribute("multiCheckboxAllValues")
	public String[] getMultiCheckboxAllValues() {
	    return new String[] {
	        "Hombre", "Mujer"
	    };
	}

}
