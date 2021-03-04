package Ejercicio4;

import java.util.Date;

public class Masajista extends Persona{
	private String titulo;
	private int aniosExperiencia;
	
	
	
	public Masajista(String n,String a,int pasa,Date l,String pa,String t,int anios) {
		super(n,a,pasa,l,pa);
		titulo=t;
		aniosExperiencia=anios;
	}
	
	
}
