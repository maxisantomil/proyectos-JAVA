import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio16 {
		final static int max=18;
		public static void main(String args[]) {
			int arrA[]=new int [max];
			int arrP[]=new int [max];
			int posicion_inicial;
			int posicion_final;
			int posicion_actual=0;
			int N=0;
			cargar_arreglo(arrA);
			while (posicion_actual < max){
				posicion_inicial=posicion_de_inicio(arrA,posicion_actual);
				System.out.println("posicion inicial: "+ posicion_inicial);
				if (posicion_inicial<max){
				posicion_final=posicion_de_finalsec(arrA,posicion_inicial);
				System.out.println("posicion final: "+ posicion_final);
				System.out.println("cant de la secuencia: "+ ((posicion_final - posicion_inicial )+1 ));
				if ((((posicion_final - posicion_inicial )+1)%2)==0){
					if (N<max){
						copiar_en_arregloP(arrA,arrP,posicion_inicial,posicion_final,N);
						N= N + ((posicion_final-posicion_inicial)+1);
					}
				}
				posicion_actual=posicion_final+1;
				}
				else 
					posicion_actual=max;
			}
			for (int pos=0;pos<max;pos++) {
				System.out.println(arrP[pos]);
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
		public static void copiar_en_arregloP(int arrA[],int arrP[],int posicion_inicial,int posicion_final,int N) {
			N=N+1;
			while ((arrP[N-1])!=0){
				N++;
			}
			for(int j=posicion_inicial;j<=posicion_final;j++) {
				arrP[N]=arrA[j];
				N++;
			}
		}
	}

