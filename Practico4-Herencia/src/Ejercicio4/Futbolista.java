package Ejercicio4;

import java.util.Date;

public class Futbolista extends Persona{
	int posicion;
	String pie_habil;
	int cant_goles;
	
	
	public Futbolista(String n,String a,int pasa,Date l,String pa,int posi,String pie,int goles) {
		super(n,a,pasa,l,pa);
		posicion=posi;
		pie_habil=pie;
		cant_goles=goles;
	}
		
}
