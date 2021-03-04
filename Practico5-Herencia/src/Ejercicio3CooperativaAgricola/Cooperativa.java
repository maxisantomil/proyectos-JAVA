package Ejercicio3CooperativaAgricola;

import java.util.ArrayList;

public class Cooperativa {
	String nombre;
	ArrayList<String>mineralesEspecial;
	ArrayList<Lote>lotes;
	
	
	public Cooperativa(String n) {
		nombre= n;
		mineralesEspecial= new ArrayList<>();
		lotes= new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<String> getMineralesEspecial() {
		return mineralesEspecial;
	}
	
	public void agregarMineralEspeciales(String a) {
		String mineral= a.toLowerCase();
		if (!(mineralesEspecial.contains(mineral))){
			mineralesEspecial.add(a);
		}
	}



	public ArrayList<Lote> getLotes() {
		ArrayList<Lote> copia= (ArrayList<Lote>)lotes.clone();
		return copia;
	}


	public void setLotes(ArrayList<Lote> lotes) {
		this.lotes = lotes;
	}


	public String TipoLote(Lote l) {
		for (String n:mineralesEspecial) {
			if (!(l.getMinerales().contains(n))) {
				return " es un lote comun, segun la clasificacion de la cooperativa";
			}
		}
		return "es un lote especial, segun la clasificacion de la cooperativa";
	}
	
	
	public void agregarLote(Lote l) {
		lotes.add(l);
	}
	
	public ArrayList<Lote> lotesparaesecereal(Cereal c){
		ArrayList<Lote> lotesaptos= new ArrayList<>();
		for (Lote l:lotes) {
			if (l.aptoparaSembrar(c)) {
				lotesaptos.add(l);
			}
		}
		return lotesaptos;
	}
	
	public boolean puedesembrarse(Cereal c , Lote l) {
		if (l.aptoparaSembrar(c)){
			return true;
		}
		return false;
	}
}
