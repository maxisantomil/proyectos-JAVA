package Ejercicio2Vocabulario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Vocabulario {
	private ArrayList<Palabra>palabras;
	
	public Vocabulario() {
		palabras= new ArrayList<>();
	}
	
	
	public void seccionarTexto(String texto) {
		 StringTokenizer st = new StringTokenizer (texto);
	     while (st.hasMoreTokens ()) { 
	       Palabra p1= new Palabra(st.nextToken());
	       this.agregarPalabra(p1);
	     }
	}
	
	public void agregarPalabra(Palabra p) {
		if (!palabras.contains(p)) {
			palabras.add(p);
		}
		else sumaCantidadaPalabra(p);
	}
	
	
	public int cantidadPalabrasExistentes() {
		return palabras.size();
	}
	
	public ArrayList<Palabra> Filtro_Repetidos(Criterio c){
		ArrayList<Palabra>aux= new ArrayList<>();
		
		for (Palabra p:palabras) {
			if (c.cumple(p)){
				aux.add(p);
			}
		}
		return aux;
	}
	
	public void sumaCantidadaPalabra(Palabra p) {
		int aux=palabras.indexOf(p);
		palabras.get(aux).sumarCantidad();
	}
	

	@Override
	public String toString() {
		return "Vocabulario [palabras=" + palabras + "]";
	}
	
	public int frecuenciadeXPalabra(Palabra p) {
		for (Palabra aux:palabras) {
			if (aux.equals(p)){
				return aux.getCantidad();
			}
		}return 0;
	}
	
	
	//public ArrayList<Palabra> NmasFrecuentes(int i){
		
	//}
	
	public ArrayList<Palabra> ordenarListaporFrecuencia(){
		ArrayList<Palabra>aux= new ArrayList<>(palabras);
		Collections.sort(aux,new ComparatorFrecuencia ());
		return aux;
	}
	
	public ArrayList<Palabra>ordenarAlfabeticamente(){
		ArrayList<Palabra>aux= new ArrayList<>(palabras);
		Collections.sort(aux);
		return aux;
	}
	
	
}