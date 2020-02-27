package com.lucatinder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lucatic.main.utilidades.CargarDatos;


public class LucaTinderTestPerfilesFalsos {
	
	@Autowired
	private CargarDatos cargar;

	@Test
	public void contexLoads() throws Exception {
		
	    assertThat(controller).isNotNull();

	}

}


