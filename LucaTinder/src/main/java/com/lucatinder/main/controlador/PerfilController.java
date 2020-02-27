package com.lucatinder.main.controlador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

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
	@PostMapping("/add")
	public ModelAndView addPerfil(@ModelAttribute Perfil perfil) {

		logger.info(" Estoy en addPerfil");
		return new ModelAndView("redirect:/index.html");
	}
}
