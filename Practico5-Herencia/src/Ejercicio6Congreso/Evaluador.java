package Ejercicio6Congreso;

import java.util.ArrayList;

public class Evaluador {
	private String nombre;
	private ArrayList<String>palabrasclaves;
	private int canttrabajosAsignados;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<String> getPalabrasclaves() {
		return (ArrayList<String>) palabrasclaves.clone();
	}



	public int getCanttrabajosAsignados() {
		return canttrabajosAsignados;
	}



	public void setCanttrabajosAsignados(int canttrabajosAsignados) {
		this.canttrabajosAsignados = canttrabajosAsignados;
	}



}
