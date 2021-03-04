package Ejercicio3Navidad;

import java.util.ArrayList;

public class Buzon extends ElementNavidad {
	private ArrayList<Carta>cartas;
	private ArrayList<Integer>niniosBuenos;
	
	public Buzon () {
		cartas= new ArrayList<>();
		niniosBuenos= new ArrayList<>();
	}
	
	public void agregarAlistaNiniosbuenos(int dni) {
		niniosBuenos.add(dni);
	}
	
	
	public boolean seencuentraNinio(int dni) {
		return niniosBuenos.contains(dni);
	}
	
	
	public void agregarcarta(Carta carta) {
		if (!cartas.contains(carta)) {
			if (seencuentraNinio(carta.getRemitente())) {
				cartas.add(carta);
			}
			else {
				carta.castigoCarbon();
				cartas.add(carta);
			}
		}
		return;
	}
	
	
	public int cantCartasTotalesRecibidas() {
		return cartas.size();
	}

	@Override
	public int cantCartasRegalo(String regalo) {
		int cant=0;
		for (Carta c :cartas) {
			if (c.contieneRegalo(regalo)) { 
				cant++;
			}
		
		}
		return cant;
	}

	@Override
	public int cantNiniosMalos() {
		int cant=0;
		for (Carta c:cartas) {
			if (!niniosBuenos.contains(c.getRemitente())) {
				cant++;
			}
		}
		return cant;
	}
}
