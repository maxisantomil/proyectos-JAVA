package Ejercicio3Navidad;

import java.util.ArrayList;

public class Carta {
	private int remitente;
	private ArrayList<String>regalosSolicitados;
	private static final String CARBON="trozo de carbon";
	
	
	
	public Carta(int dni) {
		this.remitente=dni;
		regalosSolicitados= new ArrayList<>();
	}
	
	public void agregarRegaloDeseado(String reg) {
		regalosSolicitados.add(reg);
	}

	public ArrayList<String> getRegalosSolicitados() {
		return regalosSolicitados;
	}

	public void setRegalosSolicitados(ArrayList<String> regalosSolicitados) {
		this.regalosSolicitados = regalosSolicitados;
	}

	public int getRemitente() {
		return remitente;
	}
	
	
	public void castigoCarbon() {
		regalosSolicitados.clear();
		regalosSolicitados.add(CARBON);
	}
	
	public boolean contieneRegalo(String regalo) {
		return regalosSolicitados.contains(regalo);
	}
	
	public boolean equals(Object c) {
		try {
		Carta carta= (Carta)c;
		return this.getRemitente()==(carta.getRemitente());
		}catch (Exception exc) {
			return false;
		}
		
	}
	
}
