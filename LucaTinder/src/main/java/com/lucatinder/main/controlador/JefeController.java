package com.lucatinder.main.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucatinder.main.modelo.User;




@Controller
public class JefeController {

	@RequestMapping("/")
	public ModelAndView index() throws Exception {
		User user = new User();
		ModelAndView model = new ModelAndView("index");
		model.addObject("user", user);
	
		return model;
	}	
	 /* public String processSubmit( ModelMap model) {
		 	 User user = new User();
		 	 user.setUserName("HOLA");
		 	 user.setPassword("123456");
		 	 model.addAttribute("user",user);
		 return "index";
	 }*/
	@RequestMapping("/logOut")
	public ModelAndView logOut(HttpSession session) {
		session.removeAttribute("current_perfil");
		User user = new User();
		ModelAndView model = new ModelAndView("index");
		session.invalidate();
		
		model.addObject("user", user);
		return model;
	}	
}

