package com.lucatinder;

<<<<<<< HEAD
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatinder.main.utilidades.CargarDatos;
=======
import static org.assertj.core.api.Assertions.assertThat;
>>>>>>> refs/heads/Development

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class LucaTinderApplicationTests {
	
	@Autowired
	CargarDatos datos;

	@Test
    public void contextLoads() throws Exception {
    	//Deberia fallar aposta
    	assertThat(false).isTrue();
    }

}
