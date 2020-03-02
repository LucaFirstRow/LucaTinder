package com.lucatinder.main.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import java.util.List;

import org.hibernate.query.criteria.internal.expression.function.CurrentTimestampFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lucatinder.main.modelo.User;

import org.springframework.web.bind.annotation.ModelAttribute;



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
}

