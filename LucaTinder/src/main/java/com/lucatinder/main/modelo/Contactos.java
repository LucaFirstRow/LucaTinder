package com.lucatinder.main.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "contactos")
public class Contactos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContactos;
	private int idPerfil;
    private int idPerfilLike;
    
	public int getIdContactos() {
		return idContactos;
	}
	public void setIdContactos(int idContactos) {
		this.idContactos = idContactos;
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public int getIdPerfilLike() {
		return idPerfilLike;
	}
	public void setIdPerfilLike(int idPerfilLike) {
		this.idPerfilLike = idPerfilLike;
	}
	
    
}
