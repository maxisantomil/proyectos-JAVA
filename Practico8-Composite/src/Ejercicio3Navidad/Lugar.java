package Ejercicio3Navidad;

import java.util.ArrayList;

public class Lugar extends ElementNavidad{
	
	private ArrayList<ElementNavidad>lugares;
	
	
	public Lugar(String n) {
		super.nombreLugar(n);
		lugares= new ArrayList<>();
		
	}

	public void agregarLugar(ElementNavidad x) {
		lugares.add(x);
	}
	
	
	@Override
	public int cantCartasTotalesRecibidas() {
		int suma=0;
		for (ElementNavidad l:lugares) {
			suma+= l.cantCartasTotalesRecibidas();
		}
		return suma;
	}


	@Override
	public int cantCartasRegalo(String regalo) {
		int suma=0;
		for (ElementNavidad l:lugares) {
			suma+= l.cantCartasRegalo(regalo);
		}
		return suma;
	}

	@Override
	public int cantNiniosMalos() {
		int suma= 0;
		for (ElementNavidad l :lugares) {
			suma+= l.cantNiniosMalos();
		}
		return suma;
	}
	
	
	


}
