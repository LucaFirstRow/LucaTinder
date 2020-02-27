package com.lucatinder.main.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller("util")
public class UtilController {
	
	@ModelAttribute("multiCheckboxAllValues")
	public String[] getMultiCheckboxAllValues() {
	    return new String[] {
	        "Hombre", "Mujer"
	    };
	}
}
