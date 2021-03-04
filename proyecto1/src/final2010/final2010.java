package final2010;
/*Se tiene el arreglo ArrPalabras de CantCar caracteres que contiene palabras
(secuencias de caracteres que están separadas por uno o más blancos.
Se pide que realice el diagrama de estructura y el módulo (procedimiento / función)
GenerarMatPal que genere la matriz MatPalabras de M filas y N columnas según lo
siguiente: esta matriz debe contener las palabras del arreglo ArrPalabras ordenadas
alfabéticamente en forma ascendente sin que queden palabras cortadas (puede haber
mas de una palabra por fila). Se asegura que cada palabra tiene una longitud menor que
la cantidad de columnas de la matriz.
Indicar el método de ordenamiento utilizado.
Se pide además, que realice todas las declaraciones de constantes y tipos necesarios.
No puede trabajar con estructuras auxiliares.*/
public class final2010 {

	final static int maxfil=4;
	final static int maxcol=9;
	final static int maxarr=32;
			public static void main(String[] args) {
				char Mletras[][]= {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
									{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
				
				char PAT[] = {' ','p','a','p','e','l',' ','b','u','e','n','o',' ','e','s',' ','p','r','o','g','r','a','m','a',' ','c','a','s','a',' ','f','a'};
														
				int inicio_menor=0;
				int fin_menor=0;
				
				imprimir_arr(PAT);
				System.out.println("////////////////////////");
				System.out.println("////////////////////////");
				imprimir_matriz(Mletras);
				for (int i=0; i<maxarr;i++) {
					inicio_menor=busca_ini_patron(PAT,i);
					System.out.println("posicion del inicio del patron menor: "+ inicio_menor);
					if (inicio_menor!=-1) {
						fin_menor=busca_final_patron(PAT,inicio_menor);
						System.out.println("posicion fin del patron menor: "+ fin_menor);
						if (fin_menor!=maxfil-1) {
							pasar_a_Matriz(Mletras,PAT,inicio_menor,fin_menor);
							llenar_blancos(PAT,inicio_menor,fin_menor);
							
						}
						System.out.println("///////////////////////");
						
					}
				}
				imprimir_matriz(Mletras);
			}
			public static void imprimir_matriz(char[][]Mletras) {
				for (int i = 0 ; i <maxfil; i++) {
					for (int j = 0 ; j < maxcol; j++)
						System.out.print(" "+ Mletras[i][j]+" ");
					System.out.println(" ");
					}
			}
			public static void imprimir_arr(char[]PAT) {
				for (int i = 0 ; i <maxarr; i++) {
						System.out.print(" "+ PAT[i]+" ");
					System.out.println(" ");
					}
			}
			
			public static int busca_ini_patron(char []PAT,int col) {
				int pos_ini=0;
				char aux=' ';
				char menor=' ';
				for (int i=0;i<maxarr-1;i++){
					if ((PAT[i]==' ')&&(PAT[i+1]!=' ')) {
						aux=PAT[i+1];
						if (aux<menor) {
							menor =aux;
							pos_ini=i+1;
						}
						if (menor==' ') {
							menor=aux;
							pos_ini=i+1;
						}
				}
					
			}
				return pos_ini;
		}
			public static int busca_final_patron(char []PAT,int ini) {
				while ((ini<maxarr)&&(PAT[ini]!=' ')) {
					ini++;
				}
				return ini-1;
			}
			
			public static void copiarpalabra(char [][]Mletras,char[]PAT,int inicio_patron,int aux,int i) {
				aux=aux+1;
				while ((inicio_patron<maxarr)&&(PAT[inicio_patron]!=' ')) {
					Mletras[i][aux]=PAT[inicio_patron];
					inicio_patron++;
					aux++;
				}
			}
			public static void pasar_a_Matriz(char [][]Mletras,char []PAT,int inicio_patron,int fin_patron) {
				int aux;
				int i=0;
				int j=0;
				int lk=0;
				boolean esvalido=false;
				lk= (fin_patron-inicio_patron) +1;
				System.out.println("dimension de la palabra: "+ lk);
				while ((i<maxfil)&&(!esvalido)) {
					while ((j<maxcol)&&(!esvalido)) {
						if (Mletras[i][j]==' ') {
							aux=j;
							while ((j<maxcol)&&(Mletras[i][j]==' ')&&(lk>0)) {
								lk--;
								j++;
							}
							if (lk==0){
								esvalido=true;
								copiarpalabra(Mletras,PAT,inicio_patron,aux,i);
							}
							else
								lk=(fin_patron-inicio_patron) +1;
						}
						j++;
				}
					if (!esvalido) {
						i++;
						j=0;
						lk=(fin_patron-inicio_patron) +1;
					}
			}
		
		}
			public static void llenar_blancos(char []PAT,int inicio_menor,int fin_menor) {
				for(int j=inicio_menor;j<=fin_menor;j++) {
					PAT[j]=' ';
				}
			}
			
	}