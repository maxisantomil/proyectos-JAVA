package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//*se tiene una matriz Mtablero de NxM y una matriz Mpatron de PxQ ambas de caracteres .
//en estas matrices , cada posicion tiene un espacio en blanco si esta vacia o una [x] si esta
//ocupada, En la matriz Mpatron hay un patron dibujado. Se pide que copie el patron dibujado 
//en la segunda en algun lugar libre de la primera.
public class final2010 {
	
			final static int N=4;
			final static int M=5;
			final static int P=4;
			final static int Q=5;
			

		public static void main(String[] args) {
			char Mtablero[][]= {{'X','X',' ',' ',' '},
								{' ','X','X',' ',' '},
								{' ','X',' ',' ',' '},
								{' ','X',' ',' ',' '}};
			char Mpatron[][] = {{'X','X',' ',' ',' '},
								{' ','X',' ',' ',' '},
								{' ',' ',' ',' ',' '},
								{' ',' ',' ',' ',' '}};
													
	
			int long_Mpatron=0;
			int ancho_Mpatron=0;
			imprimir_matriz(Mtablero);
			System.out.println("////////////////////////");
			imprimir_matrizP(Mpatron);
			System.out.println("///////////////////////");
			long_Mpatron=busca_long_Mpatron(Mpatron);
			ancho_Mpatron=busca_ancho_Mpatron(Mpatron);
			System.out.println("longitud del patron: "+ long_Mpatron);
			System.out.println("ancho del patron: "+ ancho_Mpatron);
			Buscar_lugar_Mtablero(Mtablero,Mpatron,long_Mpatron,ancho_Mpatron);
			imprimir_matriz(Mtablero);
		}
			
		public static void cargar_matriz(char[][] mat) {
		for (int i = 0 ; i < N; i++) {
			for (int j = 0 ; j < M; j++) {
					System.out.println ("Ingrese un caracter: "+j);
					mat[i][j]=obtener_caract_valido();
					}
			}
		}
			public static char obtener_caract_valido(){
			char caracter= ' ';
			boolean valido = false;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			do {
				try {
					caracter = (char) (entrada.readLine().charAt(0));
					valido = true;
					}
				catch (Exception exc ) {
						valido = false;
					}
				} 
				while (!valido);
					return caracter;
			}


			public static void imprimir_matrizP(char[][] Mpatron) {
				for (int i = 0 ; i <P; i++) {
					for (int j = 0 ; j < Q; j++)
						System.out.print(" "+ Mpatron[i][j]+" ");
					System.out.println(" ");
					}
			}
		public static void imprimir_matriz(char[][] mat) {
		for (int i = 0 ; i <N; i++) {
			for (int j = 0 ; j < M; j++)
				System.out.print(" "+ mat[i][j]+" ");
			System.out.println(" ");
			}

		}
		public static int busca_long_Mpatron(char Mpatron[][]) {
			int long_mas_larga=0,longitud=0;
			for (int i=0; i<P;i++) {
				for (int j=0;j<Q;j++) {
					if (Mpatron[i][j]=='X'){
						longitud++;
					}
				}
				if (longitud >long_mas_larga){
					long_mas_larga=longitud;
				}
			longitud=0;	
			}
			
			return  long_mas_larga;
			
		}
		public static int busca_ancho_Mpatron(char Mpatron[][]) {
			int ancho=0;
			int j=0;
 			for (int i=0; i<P;i++) {
					if ((j<Q)&&(Mpatron[i][j]==' ')){
						j++;
						System.out.println(Mpatron[i][j]);
					}
				if ((j<Q)&&(Mpatron[i][j]!=' ')){
					ancho++;
				}
			}
 			if (ancho>0){
			return  ancho;
 			}
 			else 
 				return -1;
		}
		
		public static boolean existe_lugar(char [][]Mtablero,int lng,int A,int i,int j) {
			int f=0;
			int c=0;
			int cant_espacios=0;
			boolean esvalido=false;
			if (Mtablero[i][j]==' ') {
				while (f<A) {
					while (c<lng) {
						if (Mtablero[i+f][j+c]==' ') {
							cant_espacios++;
						}
						c++;
					}
					c=0;
					f++;
				}
			}
			System.out.println("CUANTOS ESPACIOS HAY"+ cant_espacios);
			if (cant_espacios==(lng*A)) {
				esvalido=true;
			}
			else 
				esvalido=false;
			return esvalido;	
		}
		
		public static void insertar_Patron(char Mtablero[][],char Mpatron[][],int i,int j,int lng,int A) {
			int fil=0;
			int col=0;
			int ling=0;
			int anch=0;
			while (fil<P){
				while ((col<Q)&&(Mpatron[fil][col]==' ')) {
						col++;
					}
				if (col==Q){
					fil++;
					col=0;
				}
				else {
					
				while (anch<A){
					while ((ling<lng)) {
							Mtablero[i+anch][j+ling]=Mpatron[fil][col];	
						col++;
						ling++;
						}
					ling=0;
					anch++;
					fil++;
				}	
						
			}
					
			fil=P;	
		}
	}
		public static void Buscar_lugar_Mtablero(char Mtablero[][],char Mpatron[][],int long_Mpatron,int ancho_Mpatron) {
			int lng=long_Mpatron;
			int i=0,j=0;
			int posfil=0;
			int poscol=0;
			int pos=0;
			int A=ancho_Mpatron;
			boolean esvalido=false;
			while ((i<N)&&(!esvalido)) {
				while ((j<M)&&(!esvalido)) {
					if (existe_lugar(Mtablero,lng,A,i,j)) {
						System.out.println("hay lugar , se puede ingresar el patron");
						System.out.println("posicion de la fila"+i +"posicion de la columna"+ j);
						insertar_Patron(Mtablero,Mpatron,i,j,lng,A);
						esvalido=true;
					}
					j++;
				}
				j=0;
				i++;
			}
		}
}