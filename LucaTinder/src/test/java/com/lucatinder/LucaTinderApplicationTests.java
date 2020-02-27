package com.lucatinder;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatinder.main.utilidades.CargarDatos;

@SpringBootTest
class LucaTinderApplicationTests {
	
	@Autowired
	CargarDatos datos;

	@Test
	void contextLoads() {

		System.out.println(datos.cargarDatos());
		
	}

}
