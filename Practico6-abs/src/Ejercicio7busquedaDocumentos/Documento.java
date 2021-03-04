package Ejercicio7busquedaDocumentos;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private ArrayList<String>autores;
	private String contenidotex;
	private ArrayList<String>palabrasClaves;
	
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<String> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}
	public String getContenidotex() {
		return contenidotex;
	}
	public void setContenidotex(String contenidotex) {
		this.contenidotex = contenidotex;
	}
	public ArrayList<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}
	
	
	
	
	
}
