package Ejercicio3SistemaAlquiler;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		SistemaAlquiler blockbuster= new SistemaAlquiler("Blockbuster");
		Item pelicula1= new Pelicula("the lord of the ring","fantasia,aventura" , 5);
		Item vehiculo1= new Vehiculo("Toyota",40000, "cfg542", false);
		Item vehiculo2= new Vehiculo("Ford",89000, "hyr768", false);
		Item pelicula2= new Pelicula("terminator","cs ficcion",2);

		Cliente c1= new Cliente("maxi", 35172571);
		Cliente c2= new Cliente("jose", 33172571);
		Cliente c3= new Cliente("lus", 31172571);
		
		blockbuster.agregarItem(pelicula1);
		blockbuster.agregarItem(pelicula2);
		blockbuster.agregarItem(vehiculo1);
		blockbuster.agregarItem(vehiculo2);
		blockbuster.agregarCliente(c1);
		blockbuster.agregarCliente(c2);
		blockbuster.agregarCliente(c3);
		
		blockbuster.alquilarItem(pelicula1,c1, LocalDate.of(2020,9,2));
		blockbuster.alquilarItem(pelicula2,c1, LocalDate.of(2020,9,30));
		blockbuster.alquilarItem(pelicula1,c2, LocalDate.of(2020,8,2));
		blockbuster.alquilarItem(vehiculo1, c1, LocalDate.of(2020,10,17));

		System.out.println(c2.getAlquileres());
		System.out.println(c1.getAlquileres());
		
		System.out.println(blockbuster.clientesdeudores());
	}

}
