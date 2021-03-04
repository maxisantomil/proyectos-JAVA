package proyecto1;

public class matrices_tp8e5 {
	final static int maxfil=3;
	final static int maxcol=3;
	final static int maxnum=10;
	
	

public static void main(String[] args) {
	int mat[][]= new int[maxfil][maxcol];
	//int arr[]= new int[maxcol];
	cargar_matriz(mat);
	imprimir_matriz(mat);
	ordenar_fila(mat);
	System.out.println("        ");
	System.out.println("matriz ordenada por suma de filas: ");
	imprimir_matriz(mat);
	//cargar_arreglo(arr);
	//imprimir_arreglo(arr);
}


public static void cargar_matriz(int[][] mat) {
for (int i = 0 ; i < maxfil; i++)
	for (int j = 0 ; j < maxcol; j++)
		mat[i][j] = (int)(Math.random()*maxnum+1);

}

public static void cargar_arreglo(int arr[]) {
for (int i = 0 ; i < maxcol; i++)
		arr[i] = (int)(Math.random()*maxnum+1);

}



public static void imprimir_matriz(int[][] mat) {
for (int i = 0 ; i < maxfil; i++) {
	for (int j = 0 ; j < maxcol; j++)
		System.out.print(" "+ mat[i][j]+" ");
	System.out.println(" ");
	}

}

public static void imprimir_arreglo(int arr[]) {
for (int i = 0 ; i < maxcol; i++) {
		System.out.print(" "+ arr[i]+" ");
	System.out.println(" ");
	}

}

public static int sumar_fila(int i,int mat[][]) {
	int sumaf=0;
	for (int j=0;j<maxcol;j++) {
		sumaf+=   mat[i][j];
	}
	return sumaf;
	
}



public static void intercambiar(int mat[][],int i,int p) {
	int temp=0;
	for(int j=0; j<maxcol;j++) {
		temp= mat[i][j];
		mat[i][j]=mat[p][j];
		mat[p][j]= temp;
	}
}

public static void ordenar_fila(int mat [][]){
	int sumaf=0,sumacompa=0;
	for (int k=0; k<maxfil;k++) {
		for (int i= 0 ; i<maxfil-1;i++) {
			sumaf=sumar_fila(i,mat);
			sumacompa=sumar_fila(i+1,mat);
				if (sumaf > sumacompa){
				 intercambiar(mat,i,i+1);
				}
			
		}
	

	
	}

}

}


























