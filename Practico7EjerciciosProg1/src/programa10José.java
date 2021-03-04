
public class programa10José {
	final static int MAXARR=20, INDNULL=-1, MAXNUM=10;
	public static void main(String[]args) {
		int arr[]= new int [MAXARR];
		int pos_ini=0, pos_fin=0;
		int anteultimo=2;
		int i=MAXARR-1;
		inicializar(arr);
		imprimir(arr);
		
		while ((i>=0 )&&(anteultimo>0)) {
			 pos_fin=finalSecInversa(arr,i);
			if ((arr[pos_fin]!=0)){ 
				pos_ini= inicioSecInversa(arr,pos_fin);
				anteultimo--;
				i=pos_ini-1;
			}
			else 
				i=pos_fin-1;
		}
		if (anteultimo==0){
			System.out.println("pos inicial de la anteultima sec: "+ pos_ini+ "posicion final: "+pos_fin);
		}
		else
			System.out.println("no existe una anteultima secuencia");
	}
	public static void imprimir(int [] arr) {
		for(int i=0;i<MAXARR; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void inicializar(int [] arr) {
		for(int i=0; i<MAXARR; i++) {
			arr[i]=(int)(MAXNUM*Math.random());
		}
	}
	
public static int finalSecInversa(int []arr, int i) {
	while((i>0)&&(arr[i]==0)) {
				i--;
	}
	return i;
}

public static int inicioSecInversa(int []arr, int i) {
	
	while((i>0)&&(arr[i]!=0)) {
				i--;
	}
	return i+1;
}

}

