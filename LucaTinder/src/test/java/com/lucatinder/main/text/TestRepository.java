package com.lucatinder.main.text;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatinder.main.dao.DaoPerfil;
import com.lucatinder.main.modelo.Contactos;
import com.lucatinder.main.modelo.Descartes;
import com.lucatinder.main.modelo.Match;
import com.lucatinder.main.modelo.Perfil;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepository {

	@Autowired
	private DaoPerfil perfil;
	
	@Test
	public void verificarSujeto() {
		Perfil pepe=new Perfil();
		pepe.setEdad(22);
		pepe.setGenero(2);
		pepe.setNombre("pepe");
		pepe.setPoblacion("Madrid");
		pepe.setFoto("Sin foto");
		pepe.setDescripcion("Soy una metometo");
		pepe.setDescripcionCorta("no tengo nada");
		perfil.save(pepe);
		
		List<Perfil> perfiles=perfil.findAll();
		assertEquals("pepe",perfiles.get(17).getNombre());
		assertEquals(22,perfiles.get(17).getEdad());
		assertEquals(2,perfiles.get(17).getGenero());
		assertEquals("Madrid",perfiles.get(17).getPoblacion());
		
	}
	
	@Test
	public void evaluarListaPerfiles() {
		
		Optional<Perfil> German=perfil.findById(3);
		List<Perfil> perfiles=perfil.mostrarSeleccion(German.get());
		
		assertEquals(6,perfiles.size());
	}
	
	@Test
	public void evaluarListaDescartes() {
		List<Perfil> perfiles=perfil.listaDescartes(2);
		assertEquals(2,perfiles.size());
	}
	@Test 
	public void evaluarListaContactos() {
		List<Perfil> perfiles=perfil.listaContactos(2);
		assertEquals(2,perfiles.size());
	}
	@Test
	public void añadirContactos() {
		Optional<Perfil> German=perfil.findById(3);
		Optional<Perfil> Beatriz=perfil.findById(10);
		Contactos contac=new Contactos();
		contac.setPerfil(German.get());
		contac.setPerfil2(Beatriz.get());
		assertEquals(1,perfil.addContacto(contac));
	}
	@Test
	public void añadirDescartes() {
		Optional<Perfil> German=perfil.findById(3);
		Optional<Perfil> Beatriz=perfil.findById(10);
		Descartes des=new Descartes();
		des.setPerfil(German.get());
		des.setPerfil2(Beatriz.get());
		assertEquals(1,perfil.addDescartes(des));
	}
	@Test 
	public void añadirMatch() {
		Optional<Perfil> German=perfil.findById(3);
		Optional<Perfil> Beatriz=perfil.findById(10);
		Match des=new Match();
		des.setPerfil(German.get());
		des.setPerfil2(Beatriz.get());
		assertEquals(1,perfil.addMatch(des));
	}
	@Test 
	public void listaMatch() {
		List<Perfil> perfiles=perfil.listaMatch(2);
		assertEquals(2,perfiles.size());
	}
}
