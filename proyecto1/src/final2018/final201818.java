package final2018;



public class final201818 {
	final static int maxfil=4;
	final static int maxcol=5;
	final static int maxarr=3;
			public static void main(String[] args) {
				char Mletras[][]= 	{{'M','X','I','H','M'},
									{'A','Q','M','S','A'},
									{'F','R','A','E','X'},
									{'H','S','X','A','D'}};
				char PAT[] =        {'M','A','X',' '};
														
				int inicio_patron=0;
				int col=0;
				int fin_patron=0;
				boolean esvalido=false;
				
				imprimir_matriz(Mletras);
				System.out.println("////////////////////////");
				imprimir_arr(PAT);
				System.out.println("///////////////////////");
				while((col<maxcol)&&(!esvalido)) {
					inicio_patron=busca_ini_patron(Mletras,PAT,col);
					System.out.println("inicio del patron: "+ inicio_patron);
					if (inicio_patron!=-1) {
						fin_patron=busca_final_patron(Mletras,PAT,col,inicio_patron);
						System.out.println("fin del patron: "+ fin_patron);
						if (fin_patron!=maxfil-1) {
							reubica_patron(Mletras,PAT,inicio_patron,fin_patron,col);
							esvalido=true;
						}
						else 
							System.out.println("se encuentra al final , no es necesario ningun corrimiento");
							col++;
					}
					else
						col++;
				}
				System.out.println("///////////////////////");
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
			
			public static int busca_ini_patron(char [][]Mletras,char []PAT,int col) {
				int i=0;
				int fila=0;
				int pos_ini=0;
				boolean esvalido=false;
				while ((fila<maxfil)&&(!esvalido)){
					if (Mletras[fila][col]==PAT[i]) {
						pos_ini=fila;
						while ((fila<maxfil)&&Mletras[fila][col]==PAT[i]) {
							fila++;
							i++;	
						}
						if (PAT[i]==' '){
							esvalido=true;
							return pos_ini;
						}
					}
					else
						fila++;
				}
				if ((fila==maxfil)&&(!esvalido)){
					return -1;
				}
				else 
					{return pos_ini;
					
					}
			}
				
			public static int busca_final_patron(char [][]Mletras,char []PAT,int col,int ini) {
				int i=0;
				while ((PAT[i]!=' ')) {
					ini++;
					i++;
				}
				return ini-1;
			}
			
			public static void corrimiento(char [][]Mletras,int inicio_patron,int fin_patron,int col) {
				int pos_actual=fin_patron+1;
				for (int i=pos_actual;i>inicio_patron;i--) {
					Mletras[i][col]=Mletras[i-1][col];
				}
			}
			public static void reubica_patron(char [][]Mletras,char []PAT,int inicio_patron,int fin_patron,int col) {
				char aux;
				while (fin_patron<maxfil-1) {
					aux= Mletras[fin_patron+1][col];
					System.out.print("guarda en auxiliar :" + aux);
					corrimiento(Mletras,inicio_patron,fin_patron,col);
					Mletras[inicio_patron][col]=aux;
					inicio_patron++;
					fin_patron++;
				}
			}
		
			
			
}
