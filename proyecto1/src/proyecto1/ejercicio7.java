package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio7 {
	public static void main (String [] args) {
		
		float altura =0,suma=0;
		int contador=0;
		boolean valido= false;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		while(!valido) {
			try {
				System.out.println("ingrese altura");
				altura = new Float (entrada.readLine());
				
				if (altura >0) {
					suma+=altura;
					contador++;
				}
				else {
					if ((contador>0) && (altura==0)){
						valido= true;
					}
				}
				
			}
		
			catch (Exception exc) {
				System.out.println(exc);
			}
		}
		
		System.out.println("altura promedio"+ suma/contador);
		
		
		
		
	}
}
