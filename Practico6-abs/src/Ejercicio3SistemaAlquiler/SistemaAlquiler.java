package Ejercicio3SistemaAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaAlquiler {
	String nombre;
	ArrayList<Item>items;
	ArrayList<Cliente>clientes;
	
	public SistemaAlquiler (String nombre) {
		this.nombre=nombre;
		items= new ArrayList<>();
		clientes= new ArrayList<>();
	}
	
	public void agregarItem(Item i) {
		for(Item t:items) {
			if (!t.equals(i)) {
				items.add(i);
			}
		}
	}
	
	public void alquilarItem (Item n,Cliente x,LocalDate fecha ) {
				if (n.estaDisponible()) {
					n.itemAlquilado();
					Alquiler nuevo= new Alquiler(x, n,fecha);
					x.agregarAlquiler(nuevo);
					
				}
			else {
				mensajeAlquilado();
				}
			}
	
	public void agregarCliente(Cliente x) {
		clientes.add(x);
	}

	private String mensajeAlquilado() {
		return "esa pelicula o auto que desea alquiler no esta disponible";
	}



	public ArrayList<Cliente> clientesdeudores(){
		ArrayList<Cliente>copia=new ArrayList<>();
		for (Cliente c:clientes) {
			if (c.alquileresVencidos()){
				copia.add(c);
			}
		}
		return copia;
	}
}
