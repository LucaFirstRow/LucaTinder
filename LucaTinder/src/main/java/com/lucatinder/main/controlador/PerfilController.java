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

@Controller
@RequestMapping("/Perfil")
public class PerfilController {

	@Autowired
	private PerfilServices service;
	
	private static final Logger logger=LoggerFactory.getLogger(PerfilController.class);
	
	@PostMapping("/add")
	public ModelAndView addPerfil() {
		logger.info(" Estoy en addPerfil");
		return new ModelAndView("redirect:/index.html");
	}
}
