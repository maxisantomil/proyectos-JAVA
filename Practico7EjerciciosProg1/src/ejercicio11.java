import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio11 {
		final static int max=9;
	public static void main(String args[]) {
		int arr[]=new int [max];
		int posicion_inicial;
		int posicion_final;
		int posicion_actual=0;
		int N=3;
		cargar_arreglo(arr);
		while (posicion_actual < max){
			posicion_inicial=posicion_de_inicio(arr,posicion_actual);
			if (posicion_inicial%2==0) {
			System.out.println("posicion inicial: "+ posicion_inicial);
			}
			if (posicion_inicial<max){
			posicion_final=posicion_de_finalsec(arr,posicion_inicial);
			System.out.println("posicion final: "+ posicion_final);
			System.out.println("cant de la secuencia: "+ ((posicion_final - posicion_inicial )+1 ));
			if (N==((posicion_final - posicion_inicial )+1 )){
				corrimiento(arr,posicion_inicial,N);
				posicion_actual=posicion_inicial;
				completar_con_ceros(arr,N);
			}
			else {
				posicion_actual=posicion_final+1;
				}
			}
			else 
				posicion_actual=max;
		}
		for (int pos=0;pos<max;pos++) {
			System.out.println(arr[pos]);
		}
		
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
				
		
	public static int posicion_de_inicio(int arr[],int posicion_actual) {
		int i=posicion_actual;
		while ((i<max)&&(arr[i]==0)){
			i++;
		}
			return i;
	}
		
		
	public static int posicion_de_finalsec(int arr[],int posin) {
	int i=posin;
	while ((i<max)&&(arr[i]!=0)) {
		i++;
	}
		return i-1;
	}	
	public static void corrimiento(int arr[],int posin, int N) {
	
	for (int i=0;i<N;i++) {
		for (int j=posin;(j<max-1);j++) {
			arr[j]=arr[j+1];
			}
		}
	}
	public static void completar_con_ceros(int arr[],int N) {
		int j=max-1;
		for(int i=0;i<N;i++) {
			arr[j]=0;
			j--;
		}
	}
}