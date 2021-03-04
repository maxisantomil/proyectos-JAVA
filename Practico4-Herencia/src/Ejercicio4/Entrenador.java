package Ejercicio4;

import java.util.Date;

public class Entrenador extends Persona {
	int id;
	
	
	
	public Entrenador(String n,String a,int pasa,Date l,String pa,int id) {
		super(n,a,pasa,l,pa);
		this.id=id;
	}
}
