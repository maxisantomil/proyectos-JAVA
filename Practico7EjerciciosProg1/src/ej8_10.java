import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ej8_10 {
	final static int max=12;
	
	public static void main(String args[]) {
		int arr[]=new int [max];
		int posicion_inicial;
		int posicion_final;
		cargar_arreglo(arr);

		posicion_final= busca_posfinal_anteultima(arr);
		if (posicion_final!=-1){
		System.out.println("posicion final de la anteultima secuencia es: "+ posicion_final);
		posicion_inicial=busca_posini_anteultima_secuencia(arr,posicion_final);
		System.out.println("posicion inicial de la anteultima secuencia es: "+ posicion_inicial);
		}
		else { 
			System.out.println("no existe una anteultima secuencia ");
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
	
	

	public static int busca_posfinal_anteultima(int arr[]) {
		int i=max-1;
		int pos=0;
		while ((i>0) &&(arr[i] ==0) ){
			i--;
		}
		while ((i>0)&& arr[i]!=0 ) {
			i--;
		}
		if (i==0) {
			i=-1;
			return i;
		}
		pos=i-1;
		while ((pos >=0) && (arr[pos]==0)) {
			pos--;
		}

			return pos;
	}
	
	
public static int busca_posini_anteultima_secuencia(int arr[],int posicion_final) {
	int i=posicion_final;
	int pos_ini=0;
	while ((i>=0) &&(arr[i]!=0)) {
		i--;
	}
	 pos_ini= i+1;
	return pos_ini;
}
	
	
	
}




































