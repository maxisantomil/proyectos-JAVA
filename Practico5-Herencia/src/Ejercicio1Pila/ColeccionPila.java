package Ejercicio1Pila;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class ColeccionPila {
	Stack<Object> pila;
	ArrayList<Object>Sim;
	
	public ColeccionPila() {
		pila=new Stack<>();
		Sim= new ArrayList<>();
	};
	
	
	public void addObjeto(Object o) {
		pila.push(o);
	}
	
	
	public int cantElementos() {
		return pila.size();
	}
	
	public Stack<Object> copiarPila() {
		Stack<Object> copia= new Stack<>();
		for (int i=0; i< cantElementos();i++)
			copia.push(pila.elementAt(i));
		 System.out.println(pila);
		 return copia;
	}
	
	public Stack<Object> InversadePila() {
		Stack<Object> copia= new Stack<>();
		Stack<Object> nueva= new Stack<>();
		copia=copiarPila();
		int cant=cantElementos(); 
		for (int i=0; i< cant ;i++)
			nueva.push(copia.pop());
		 System.out.println(pila);
		 return nueva;
	}
}