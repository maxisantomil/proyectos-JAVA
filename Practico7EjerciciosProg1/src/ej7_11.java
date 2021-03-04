import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ej7_11 {
final static int max=10;
	
	public static void main(String args[]) {
		int arr[]=new int [max];
		int posicion_inicial;
		int posicion_final;
		int posicion_actual=0;
		int N=3;
		cargar_arreglo(arr);
		while (posicion_actual < max-1){
			posicion_inicial=posicion_de_inicio(arr,posicion_actual);
			System.out.println("posicion inicial:"+posicion_inicial);
			posicion_final=posicion_de_finalsec(arr,posicion_inicial);
			System.out.println("posicion final:"+posicion_final);
			
			if ((posicion_final+1-posicion_inicial) == N){
				if ((posicion_final +1)!= max){
					for(int k=0;k<N;k++) {
						corrimiento(arr,posicion_inicial);
						}
					}
				}
			posicion_actual=posicion_final+1;
		}
		System.out.println("");
		for (int pos=0;pos<max;pos++)
			System.out.println(arr[pos]);
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
		int pos=0;
		int i=posicion_actual;
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
		

	
	public static void corrimiento(int arr[],int pos_ini) {
		for (int i=pos_ini;i <max-1;i++) {
			arr[i]=arr[i+1];
		}
	}
}
