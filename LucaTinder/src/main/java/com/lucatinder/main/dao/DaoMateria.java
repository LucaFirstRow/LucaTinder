package com.lucatinder.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.lucatinder.main.modelo.Materia;

/**
 * 
 * @author Equipo1 
 *La clase interface DaoMateriaRepository hereda de JpaRepository y
 *permite facilitar los algoritmos para la comunicacion de la BBDD.
 */
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface DaoMateria extends JpaRepository<Materia,Integer>, DaoMateriaCustom{

}
