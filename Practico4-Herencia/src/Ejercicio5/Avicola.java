package Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Avicola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ProductoComun> Productos= new ArrayList<ProductoComun>();
		ProductoComun pollo = new ProductoComun(LocalDate.of(2020,10,17),3,LocalDate.of(2020,10,05),"Granja hermanos");
		ProductoComun patitas = new ProductoEspecial(LocalDate.of(2020,10,17),4,LocalDate.of(2020,8,3),"Arcoiris",66,3);
		ProductoComun arvejas= new CongeladoporAire(LocalDate.of(2021,9,1),5,LocalDate.of(2020,7,15),"lamejor",23,1); 
			
		Productos.add(pollo);
		Productos.add(patitas);
		Productos.add(arvejas);
		
		for (ProductoComun p: Productos) {
			System.out.println(p.getInformacion());
		}
		}
	
	}
