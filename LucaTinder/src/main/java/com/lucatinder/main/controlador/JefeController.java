package com.lucatinder.main.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



import org.springframework.web.bind.annotation.ModelAttribute;



@Controller
public class JefeController {

	
	@RequestMapping("/index")
    public String saludo(ModelMap m) {
		m.addAttribute("userName", "");
		m.addAttribute("password", "");
        return "index";
    }
	
	
	
}
