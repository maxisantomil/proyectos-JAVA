package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Pr�ctico iteraciones - Programaci�n 1 - TUDAI
//8. En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, realizar un
//programa que pida los sueldos que cobra cada empleado e informe cu�ntos empleados cobran
//entre 100y300 y cu�ntos cobran m�s de $300. Adem�s el programa deber� informar el importe
//que invierte la empresa en sueldos al personal.
public class claseej1{
	public static void main (String [] args) {
		final int min = 100, max = 500;
		boolean valido = false;
		int sumasueldo = 0;
		int  i=0,j=0,sueldo = 0;;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		while (!valido) {
			try {
				System.out.println("ingrese un sueldo");
					sueldo = new Integer (entrada.readLine());
					if ((sueldo >= min)&&(sueldo <= max)) {
						if ((sueldo>=100) &&(sueldo<= 300)){
						sumasueldo += sueldo;
						System.out.println("Registrado");
						i++;
						}
						else {
							if (sueldo>300) {
								j++;
								sumasueldo+=sueldo;
						}
						}
					}
					if (sueldo<min){
						valido = true;
					}
				
			}
			catch (Exception exc) {
				valido = false;
			}
		}
		System.out.println("Empleados que cobran entre $100 y $300: "+ i);
		System.out.println("Empleados que cobran m�s de $300: "+ j);
		System.out.println("Importe total de sueldos al personal: "+sumasueldo);
	}
}