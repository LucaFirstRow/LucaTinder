package com.lucatinder.main.controlador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
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
		
		User user = new User();
		ModelAndView model = new ModelAndView("index");
		model.addObject("user", user);
		
		return model;

	}
	/**
	 * Metodo mostrarSeleccion muestra una lista de perfiles
	 * en la pagina
	 * @param model ModelMap
	 * @param p Perfil
	 * @return la pagina 
	 */
	/*@GetMapping("/list")
	public String mostrarSeleccion(ModelMap model,Perfil p) {
		logger.info("Muestrame perfiles");
		List<Perfil> listas=new ArrayList<Perfil>();
		System.out.println("Estoy en mostrarSeleccion *************************");
		//listas=service.mostrarSeleccion(p.getIdPerfil());
		listas=service.mostrarSeleccion(20);
		model.addAttribute("listas", listas);
		for(int i=0;i<listas.size();i++) {
			System.out.println(listas.get(i));
			System.out.println(" *******************BUCLE");
		}
		return "index"; 
		
		//Pagina donde muestra los perfiles
		//no se especifica como se llama la imagen
	}*/
	@RequestMapping("/list")
	public String login(@ModelAttribute("user") User user,ModelMap model) {
		logger.info("***********Entra en el login");
		//Creacion manual de una prueva de redireccion con la lista de perfiles para un usuario
		List<Perfil> seleccion=service.mostrarSeleccion(Integer.parseInt(user.getUserName()));
		model.addAttribute("seleccion",seleccion);
		model.addAttribute("current_user", service.findOne(Integer.parseInt(user.getUserName())));
		
		return "perfil"; 
		
		//Pagina donde muestra los perfiles
		//no se especifica como se llama la imagen
	}
	/**
	 * Falta añadir esto
	 * @param model
	 * @return
	 */
	/*
	@GetMapping("/addPerfilForm")
	public String newUser(ModelMap model) {
		logger.info("\"ENTRA ************************************************\"");
		model.addAttribute("Perfil", new Perfil());
		return "addPerfil";		
	}
	*/
	/**
	 * Metodo editarPerfil permite editar el Peril 
	 * de un usuario
	 * @param model
	 * @param id indica el idPerfil del usuario
	 * @return addPerfil la pagina
	 */
	@GetMapping("/edit")
	public String editarPerfil(ModelMap model,@RequestParam("idPerfil") int id) {
		logger.info("Estoy en la etapa de EDIT");
		model.addAttribute("Perfil", service.findOne(id));
		return "addPerfil";
	}
	/**
	 * Metodo addContacto añade un nuevo contacto 
	 * 
	 * @param idPerfil
	 * @param idPerfilLike
	 * @return perfil String pagina donde devuelve
	 */
	/*@PostMapping("/addContacto")
	public String addContactos(@RequestParam("idPerfil") int idPerfil,@RequestParam int idPerfilLike) {
		Contactos nuevoLigue= new Contactos();
		nuevoLigue.setIdPerfil(idPerfil);
		nuevoLigue.setIdPerfilLike(idPerfilLike);
		service.addContacto(nuevoLigue);
		return "perfil";
	}		*/
	/**
	 * Metodo listaContacto muestra los contactos
	 * del usuario 
	 * 
	 * @param model 
	 * @param p Perfil 
	 * @return la pagina donde se envia
	 */
	@GetMapping("/listaContactos")
	public String listaContactos(ModelMap model,Perfil p) {
		logger.info("Muestrame perfiles like ");
		List<Perfil> contacto=new ArrayList<Perfil>();
		System.out.println("Estoy en listaContactos *************************");
		//listas=service.mostrarSeleccion(p.getIdPerfil());
		contacto=service.listaContacto(p.getIdPerfil());
		model.addAttribute("contacto", contacto);
		for(int i=0;i<contacto.size();i++) {
			System.out.println(contacto.get(i));
			System.out.println(" *******************BUCLE");
		}
		return "index"; 
	}

}
