package com.lucatinder.main.controlador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.ArrayList;


import com.lucatinder.main.modelo.Perfil;
import com.lucatinder.main.service.PerfilServices;
/**
 * 
 * @author Equipo 1
 * La clase PerfilController es el controlador,
 * se encarga de controlar el flujo de datos de perfil
 * y la vista.
 *
 */
@Controller
@RequestMapping("/perfil")
public class PerfilController {
   
	/**
	 * {@value #service} PerfilServices se declara esta variable para
	 *  ofrecer los servicios
	 */
	@Autowired
	private PerfilServices service;
	/**
	 * {@value # logger}Logger  se encarga de mostrar informaciones en la consola.
	 * Su funcionalidad es indicar si los metodos se ha ejecutado correctamente.
	 * 
	 */
	private static final Logger logger=LoggerFactory.getLogger(PerfilController.class);
	
	/**
	 * Metodo addPerfil para añadir nuevo usuario 
	 * @param perfil
	 * @return pagina /perfil/add
	 */

	@GetMapping("/addPerfilForm")
	 public String addPerfilForm(@ModelAttribute("perfil")Perfil perfil) {
	    System.out.println("ENTRA ************************************************");
	    return "addPerfil";
	  }
	
	
	@PostMapping("/add")
	public ModelAndView addPerfil(@ModelAttribute Perfil perfil) {
		perfil.setFoto("/resources/images/perfil/sinfoto.png");// Se le asigna una foto por defecto que es sin foto
		service.addPerfil(perfil);
		return new ModelAndView("redirect:/index");

	}
	/**
	 * Metodo mostrarSeleccion muestra una lista de perfiles
	 * en la pagina
	 * @param model ModelMap
	 * @param p Perfil
	 * @return la pagina 
	 */
	@GetMapping("/list")
	public String mostrarSeleccion(ModelMap model,Perfil p) {
		logger.info("Muestrame perfiles");
		List<Perfil> listas=new ArrayList<Perfil>();
		System.out.println("Estoy en mostrarSeleccion *************************");
		//listas=service.mostrarSeleccion(p.getIdPerfil());
		listas=service.mostrarSeleccion(20);
		model.addAttribute("listas", listas);
		return "list"; 
		
		//Pagina donde muestra los perfiles
		//no se especifica como se llama la imagen
	}
			
			
}
