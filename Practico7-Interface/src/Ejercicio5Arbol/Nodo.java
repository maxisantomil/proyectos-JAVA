package Ejercicio5Arbol;

public class Nodo {

	private Comparable valor;
	private Nodo padre;
	private Nodo izquierda;
	private Nodo derecha;

	public Nodo(Comparable i) {
		this.valor=i;
		
		izquierda= null;
		derecha=null;
	}
	
	
	
	public Comparable getValor() {
		return valor;
	}



	public void setValor(Comparable valor) {
		this.valor = valor;
	}



	public Nodo getIzquierda() {
		return izquierda;
	}



	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}



	public Nodo getDerecha() {
		return derecha;
	}



	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}



	public void insertar(Comparable aux) {
		if  (valor.compareTo(aux)<0){
			if (derecha ==null) {
				derecha= new Nodo(aux);
			}
			else 
				derecha.insertar(aux);
		}
		else {
			if (this.valor.compareTo(aux)>0) {
				if (izquierda ==null) {
					izquierda= new Nodo(aux);
				}
				else izquierda.insertar(aux);
			}		
		}
	}



	@Override
	public String toString() {
		return "Nodo [valor=" + valor+  ""+ ", izquierda=" + izquierda + ", derecha=" + derecha + "]";
	}
	
	
	
}