import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ej8_9 {
	final static int max=13;
	
		
public static void main(String args[]) {
	int arr[]=new int [max];
	int posicion_inicial;
	int posicion_final;
	int posicion_actual=0;
	int suma_mayor=0;
	int posmayor_in=0;
	int posmayor_f=0;
	int suma;
	cargar_arreglo(arr);
	while (posicion_actual < max){
		posicion_inicial=posicion_de_inicio(arr,posicion_actual);
		System.out.println("posicion inicial "+ posicion_inicial);
		posicion_final=posicion_de_finalsec(arr,posicion_inicial);
		System.out.println("posicion final "+ posicion_final);
		suma=sumar_secuencia(arr,posicion_inicial,posicion_final);
		System.out.println("suma de la secuencia :"+ suma);
		if (suma_mayor<suma){
			posmayor_in=posicion_inicial;
			posmayor_f=posicion_final;
			suma_mayor=suma;
		}
		posicion_actual=posicion_final+1;
	}
	
	imprimir(posmayor_in,posmayor_f,suma_mayor);
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
	
	
public static int sumar_secuencia(int arr[],int pos_in,int pos_f) {
	int sumasec=0;
	for (int i=pos_in;i<=pos_f;i++) {
		sumasec=sumasec+ arr[i];
	}
	return sumasec;
}
	
public static void imprimir(int posicion_ini, int posicion_fin, int suma_mayor) {
	System.out.println("la posicion inicial de la secuencia mayor es : "+ posicion_ini+" y"
			+ "la posicion final es:"+posicion_fin);
	System.out.println("la sumamayo es de : "+ suma_mayor);
}		
	
}
