package com.lucatinder.main.text;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatinder.main.controlador.PerfilController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class prueba1 {
	
	@Autowired
	private PerfilController perfil;
	
	@Test
	public void contextLoads() throws Exception{
		
		assertThat(perfil).isNotNull();
		
	}

}
