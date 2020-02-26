package com.lucatinder.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.lucatinder.main.modelo.Perfil;

/**
 * 
 * @author Equipo1 
 *La clase interface DaoPerfilRepository herede de JpaRepository
 *permite facilitar los algoritmos entre la comunicacion de BBDD
 *y los metodos.
 */
@Repository
public interface DaoPerfilRepository extends JpaRepository<Perfil,Integer>, DaoPerfil {

}
