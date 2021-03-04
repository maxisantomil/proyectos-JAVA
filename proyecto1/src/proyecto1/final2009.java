package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class final2009 {
		final static int maxfil=4;
		final static int maxcol=4;
		final static int maxnum=10;
		
		

	public static void main(String[] args) {
		int mat[][]= new int[maxfil][maxcol];
		cargar_matriz(mat);
		imprimir_matriz(mat);
		ordenar_diagonal_medio(mat);
		System.out.println("/////////////////");
		imprimir_matriz(mat);
		ordenar_diagonales_mayores(mat);
		//ordenar_diagonales_menores(mat);
		System.out.println("/////////////////");
		System.out.println("ordena las diagonales arriba del medio");
		imprimir_matriz(mat);
	}


	public static void cargar_matriz(int[][] mat) {
	for (int i = 0 ; i < maxfil; i++) {
		for (int j = 0 ; j < maxcol; j++) {
				System.out.println ("Ingrese integer: "+j);
				mat[i][j]=obtenerEntero();
				}
		}
	}
		public static int obtenerEntero(){
		int valor = 0;
		boolean enterovalido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while(!enterovalido) {
			try {
				valor = new Integer(entrada.readLine());
				enterovalido = true;
				}
			catch (Exception exc ) {
					enterovalido = false;
				}
			} 
				return valor;
		}




	public static void imprimir_matriz(int[][] mat) {
	for (int i = 0 ; i < maxfil; i++) {
		for (int j = 0 ; j < maxcol; j++)
			System.out.print(" "+ mat[i][j]+" ");
		System.out.println(" ");
		}

	}

	public static void ordenar_cero(int mat[][],int j) {
		int pos=maxcol-1;
		if (mat[j][j]==0){
			for(int i=j; i<maxcol-1;i++) {
				mat[i][i]=mat[i+1][i+1];
		}
		mat[pos][pos]=0;
			
		}
	}
	
	public static void corrimiento_negativos(int mat[][],int j) {
		int g,aux;
		g=maxcol-1;
		if ((j<maxcol)&&(mat[j][j]<0)){
			aux = mat[j][j];
			System.out.println("negativo"+aux);
			if ((g>0)&&(mat[g][g]<0)) {
				g--;
			}
			System.out.println("otro"+mat[g][g]);
			mat[j][j]=mat[g][g];
			mat[g][g]=aux;
			j++;
	}
}	
	public static void ordenar_positivos(int mat[][]) {
		int temp=0;
		for(int k=0; k<maxfil;k++) {
			for(int j=0; j<maxcol-1;j++) {
				if ((mat[j][j]>0) && (mat[j+1][j+1]>0)) {
					if ((mat[j][j] )>(mat[j+1][j+1])) {
						temp= mat[j][j];
						mat[j][j]=mat[j+1][j+1];
						mat[j+1][j+1]=temp;
						}
			}
				else if ((mat[j][j]<0)) {
						corrimiento_negativos(mat,j);
				}
				else
					ordenar_cero(mat,j);
					}			
				}
		}		
	public static void ordenar_negativos(int mat[][]) {
		int temp,j=0;
		while (mat[j][j]>0) {
			j++;
		}
		for(int k=0; k<maxfil;k++) {
			for(int p=j; p<maxcol-1;p++) {
				if ((mat[p][p]<0) && (mat[p+1][p+1]<0)) {
					if ((mat[p][p] )>(mat[p+1][p+1])) {
						temp= mat[p][p];
						mat[p][p]=mat[p+1][p+1];
						mat[p+1][p+1]=temp;
						}
			}
				else
					 ordenar_cero(mat,j);
					
				}
			}
		}
	
	public static void ordenar_cero_al_medio(int mat[][]) {
		int g=maxcol-1;
		if (mat[g][g]==0){
		while (mat[g-1][g-1] <0 ) {
			mat[g][g]=mat[g-1][g-1];
			g--;
		}
		mat[g][g]=0;
		}
	}
	public static void ordenar_diagonal_medio(int mat [][]){
				ordenar_positivos(mat);
				ordenar_negativos(mat);
				ordenar_cero_al_medio(mat);
				
			}

	public static void ordenar_cero_mayores(int mat[][],int j,int k) {
		int pos=maxcol-1;
		int max=maxfil-2;
		if (mat[j][k]==0){
			for(int i=j; i<maxcol-1;i++) {
				for(int h=j; h<maxfil-1;h++) {
				mat[h][i]=mat[h+1][i+1];
				}
		}
		mat[maxfil-1][pos]=0;
			
		}
	}
	
	public static void corrimiento_negativos_mayores(int mat[][],int j,int k) {
		int g,aux;
		if ((j<maxcol)&&(mat[j][k]<0)){
			aux = mat[j][k];
			System.out.println("negativo"+aux);
			if (mat[j+1][k+1]>0) {
				mat[j][k]=mat[j+1][k+1];
				mat[j+1][k+1]=aux;
			}
	}	
	}
	public static void ordenar_positivos_mayores(int mat[][],int col) {
		int temp=0;
		for(int k=col; k<maxcol-1;k++) {
			for(int j=0; j<maxfil-2;j++) {
				if ((mat[j][k]>0) && (mat[j+1][k+1]>0)) {
					if ((mat[j][k] )>(mat[j+1][k+1])) {
						temp= mat[j][k];
						mat[j][k]=mat[j+1][k+1];
						mat[j+1][k+1]=temp;
						}
			}
				else if ((mat[j][k]<0)) {
					System.out.println("es negativo?"+mat[j][k]);
						corrimiento_negativos_mayores(mat,j,k);
				}
				//else
					//ordenar_cero_mayores(mat,j,k);
					}			
				}
		}		
	public static void ordenar_diagonales_mayores(int mat[][]) {
		for (int col=1;col<maxcol-1;col++) {
			for (int fil=0;fil<maxfil-1;fil++) {
				ordenar_positivos_mayores(mat,col);
				//ordenar_negativos(mat);
				//ordenar_cero_al_medio(mat);
				}
		}
	}
}