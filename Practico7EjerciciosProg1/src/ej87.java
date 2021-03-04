import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ej87 {
final static int max=9;

public static void main(String args[]) {
int arr[]= new int[max];
int posicion_inicial,posicion_final;
cargar_arreglo(arr);
posicion_inicial=posicion_de_inicio(arr);
posicion_final=posicion_de_finalsec(arr,posicion_inicial);
imprimir(posicion_inicial,posicion_final);
}



public static void cargar_arreglo(int arr[]) {
	for (int pos=0;pos<max;pos++) {
		System.out.println ("Ingrese integer: "+pos);
		arr[pos]=obtenerEntero();
		}
		for (int pos=0;pos<max;pos++)
		System.out.println(arr[pos]);
		}
		public static int obtenerEntero(){
		int valor = 0;
		boolean enterovalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
					valor = new Integer(entrada.readLine());
					enterovalido = true;
				}
			catch (Exception exc ) {
				enterovalido = false;
				}
		} 
		while (!enterovalido);
		return valor;
		}
		
public static int posicion_de_inicio(int arr[]) {
	int pos=-1;
	int i=0;
	while ((arr[i]==0)&&(i<max)){
		i++;
	}
	if (arr[i]!=0){
		pos=i;
		return pos;
	}
	else {
		System.out.println("no existe ninguna secuencia");
		pos=-1;
		return pos;
	}
	
}

public static int posicion_de_finalsec(int arr[],int posin) {
int posf=0;
int i=posin;
while ((i<max)&&(arr[i]!=0)) {
	i++;
}
	posf=i-1;
	return posf;
}

public static void imprimir(int posicion_ini, int posicion_fin) {
	System.out.println("la posicion inicial de la secuencia es : "+ posicion_ini+" y"
			+ "la posicion final de la primer secuencia distinta de 0 es:"+posicion_fin);
}
		
		
		
		
}

