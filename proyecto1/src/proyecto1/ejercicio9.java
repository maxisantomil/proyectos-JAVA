package proyecto1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio9 {
public static void main (String [] args) {
		
		int lista1=0,lista2=0;
		int valor1=0,valor2=0;
		int max= 15;
		boolean valido= false;
		
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		
		
	while (!valido) {
		try {
			for (int i=1; i <= max; i++) {
					System.out.println("ingrese un valor a la lista1");
					valor1= new Integer(entrada.readLine());
					System.out.println("ingrese un valor a la lista2");
					valor2= new Integer(entrada.readLine());
					lista1+=valor1;
					lista2+=valor2;
			}
		
			valido=true;
		}
			catch (Exception exc) {
				System.out.println(exc);
			}
		}
		
		if (lista1>lista2) {
			System.out.println("lista 1 mayor");
		}
		else {
			if (lista1<lista2){
				System.out.println("lista 2 mayor");
			}
			else {
				System.out.println("listas iguales");
				}
			}
	}
		
}	
		
		

