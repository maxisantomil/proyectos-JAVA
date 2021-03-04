package Ejercicio5Arbol;

import java.util.ArrayList;
import java.util.Collections;

public class Arbol {
	Nodo raiz;
	ArrayList<Comparable> arbolordenado;
	
	
	
	public void insertar(Comparable aux) {
		if (raiz!=null){
			raiz.insertar(aux);
		}
		else 
			raiz= new Nodo(aux);
	}


	
	public ArrayList<Comparable> listaOrdenada(){
		while (raiz.getIzquierda()!=null) {
			raiz= raiz.getIzquierda();
			
		}
		
	}
	
	

	@Override
	public String toString() {
		return "Arbol [raiz=" + raiz + "]";
	}
	
	
}
