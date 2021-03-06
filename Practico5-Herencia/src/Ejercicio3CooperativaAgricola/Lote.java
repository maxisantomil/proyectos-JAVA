package Ejercicio3CooperativaAgricola;

import java.util.ArrayList;

public class Lote {
	String nombre;
	int superficie;
	ArrayList<String>minerales;
	

	public Lote(String n,int sup) {
		nombre=n;
		superficie=sup;
		minerales= new ArrayList<>();
	}
	
	public void agregarMineral(String a) {
		String mineral= a.toLowerCase();
		if (!(minerales.contains(mineral))){
			minerales.add(mineral);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public ArrayList<String> getMinerales() {
		return minerales;
	}

	public void setMinerales(ArrayList<String> minerales) {
		this.minerales = minerales;
	}
	
	public boolean aptoparaSembrar(Cereal c) {
		if (c.esaptoParaLote(this)) {
			return true;
		}
		return false;
	}
	
	
}
