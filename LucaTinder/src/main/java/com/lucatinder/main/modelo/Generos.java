package com.lucatinder.main.modelo;

public enum Generos {
	 H("Hombre", 1),
	 M("Mujer",2);
	 
	private final String sexo;
	private final int valor;
	
	Generos(String s, int v){
		this.sexo=s;
		this.valor=v;
	}

	public String getSexo() {
		return sexo;
	}

	public int getValor() {
		return valor;
	}
	
}
