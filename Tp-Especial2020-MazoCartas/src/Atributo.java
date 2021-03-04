
public class Atributo implements Comparable<Atributo>{
	private String nombre;
	private int valor;
	
			public Atributo(String nomb, int val) {
				nombre=nomb;
				valor=val;
			}
			
			public boolean equals(Object o) {
				try{
	   				Atributo atr=(Atributo)o;
	   				if(this.nombre.equals(atr.getNombre())) {
	   					return true;
	   				}
	   				else return false;
	   			}catch(Exception exc) {
	   				return false;
	   			}
			}
			public Atributo getCopia() {
				Atributo copia=new Atributo(this.nombre, this.valor);
				return copia;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public int getValor() {
				return valor;
			}

			public void setValor(int valor) {
				this.valor = valor;
			}

			@Override
			public String toString() {
				return  nombre + " " + valor +" ";
			}
			

			@Override
			public int compareTo(Atributo o) {
				return ((Integer)this.getValor()).compareTo(((Integer)o.getValor()));
			}

}
