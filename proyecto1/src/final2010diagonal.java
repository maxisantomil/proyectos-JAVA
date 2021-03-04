
public class final2010diagonal {
	final static int maxfil=8;
	final static int maxcol=8;
			public static void main(String[] args) {
				char Mpalabras[][]= {{'O','R','S','F',' ','K',' ',' '},
									 {'I','J','A','A','H',' ','T',' '},
									 {' ','N','O','R','L','E',' ','K'},
									 {'A','B','I',' ',' ','A','H',' '},
									 {' ','V','I',' ','M','P','S','F'},
									 {'C','B','I','B','P','O','A',' '},
									 {' ','A','I','V',' ','O','M','P'},
									 {' ',' ','C',' ','A',' ','P',' '}};
				int contador_capicua_medio=0; 
				int contador_capicua_inf_medio=0;
				int contador_capicua_sup_medio=0;
				int suma_capicuas=0;
				
				imprimir_matriz(Mpalabras);
				contador_capicua_medio=busca_palabras_medio(Mpalabras);
				contador_capicua_inf_medio=busca_palabras_inf(Mpalabras);
				contador_capicua_sup_medio=busca_palabras_sup(Mpalabras);
				suma_capicuas= contador_capicua_medio+contador_capicua_inf_medio+contador_capicua_sup_medio;
				System.out.println("hay "+suma_capicuas+" palabras capicuas en la matriz");
				}
				
			
			public static void imprimir_matriz(char[][]Mpalabras) {
				for (int i = 0 ; i <maxfil; i++) {
					for (int j = 0 ; j < maxcol; j++)
						System.out.print(" "+ Mpalabras[i][j]+" ");
					System.out.println(" ");
					}
			}
			
			
			
			public static int busca_palabras_medio(char[][]Mpalabras) {
				int i=0;
				int ini_palabra=0;
				int fin_palabra=0;
				int fin=0;
				int capicua=0;
				while (i<maxcol){
					ini_palabra=busca_ini_medio(Mpalabras,i);
					System.out.println("posicion inicio de la palabra :"+ini_palabra);
					if (ini_palabra!=-1) {
						fin_palabra=busca_fin_medio(Mpalabras,ini_palabra);
						System.out.println("posicion final de la palabra :"+fin_palabra);
						fin=fin_palabra;
						while ((ini_palabra<fin)&&(Mpalabras[ini_palabra][ini_palabra]==Mpalabras[fin][fin])) {
							ini_palabra++;
							fin--;
						}
						if (fin<=ini_palabra) {
							capicua++;
						}
					}
					else
					{
						return capicua;
					}
					i=fin_palabra+1;
				}
				return capicua;
			}
			
			public static int busca_ini_medio(char [][]Mpalabras,int pos) {
				int ini=0;
				while ((pos<maxfil)&&(Mpalabras[pos][pos]==' ')) {
					pos++;
				}
				if ((pos<maxfil)&&(Mpalabras[pos][pos]!=' ')) {
					return ini=pos;
				}
				else ini=-1;
				
				return ini;
			}
			
			public static int busca_fin_medio(char [][]Mpalabras,int pos_ini) {
				while ((pos_ini<maxcol)&&(Mpalabras[pos_ini][pos_ini]!=' ')) {
					pos_ini++;
				}
				return pos_ini-1;
			}
			public static int busca_palabras_sup(char[][]Mpalabras) {
				int fil=0;
				int col=1;
				int capicua=0;
				int pos_ini_f=0;
				int pos_ini_c=0;
				int pos_fin_f=0;
				int pos_fin_c=0;
				int i=0;
			for (int f=col;f<maxcol-1;f++) {	
				col=f;
				while (col<maxcol) {
						while ((col<maxcol)&&(Mpalabras[fil][col]==' ')) {
							fil++;
							col++;
						}
						 if(col<maxcol) { 
							if(Mpalabras[fil][col]!=' ') {
								pos_ini_f=fil;
								pos_ini_c=col;
								System.out.println("posicion inicial fila"+pos_ini_f+"columna"+pos_ini_c);
							}
						 }
						while ((col<maxcol)&&(Mpalabras[fil][col]!=' ')){
							fil++;
							col++;
						}
						if ((col==maxcol)||(Mpalabras[fil][col]==' ')) {
							pos_fin_f=fil-1;
							pos_fin_c=col-1;
							System.out.println("posicion final fila"+pos_fin_f+"columna"+pos_fin_c);
							capicua= capicua+busca_capicua(Mpalabras,pos_ini_f,pos_ini_c,pos_fin_f,pos_fin_c);
							System.out.println("hasta el momento el numero de capicuas es: "+ capicua);
							if (col==maxcol) {
								fil=0;
							}
						}
					}
				}	
				return capicua;
			}
		
				
	
			
			public static int busca_capicua(char [][]Mpalabras,int pos_ini_f,int pos_ini_c,int pos_fin_f,int pos_fin_c) {
				int capicua=0;
				if ((pos_ini_c!=pos_fin_c)||(pos_fin_f!=pos_ini_f)) {
				while ((pos_ini_f<pos_fin_f)&&(pos_ini_c<pos_fin_c)&&(Mpalabras[pos_ini_f][pos_ini_c]==Mpalabras[pos_fin_f][pos_fin_c])) {
					pos_ini_f++;
					pos_ini_c++;
					pos_fin_f--;
					pos_fin_c--;
				}
				if ((pos_fin_f <=pos_ini_f)&&(pos_fin_c <=pos_ini_c)) {
					capicua++;
				}
			}
				return capicua;	
			}
			public static int busca_palabras_inf(char[][]Mpalabras) {
				int fil=1;
				int col=0;
				int capicua=0;
				int pos_ini_f=0;
				int pos_ini_c=0;
				int pos_fin_f=0;
				int pos_fin_c=0;
				int i=0;
			for (int f=fil;f<maxfil-1;f++) {	
				fil=f;
				while (fil<maxfil) {
						while ((fil<maxfil)&&(Mpalabras[fil][col]==' ')) {
							fil++;
							col++;
						}
						 if(fil<maxfil) { 
							if(Mpalabras[fil][col]!=' ') {
								pos_ini_f=fil;
								pos_ini_c=col;
								System.out.println("posicion inicial fila"+pos_ini_f+"columna"+pos_ini_c);
							}
						 }
						while ((fil<maxfil)&&(Mpalabras[fil][col]!=' ')){
							fil++;
							col++;
						}
						if ((fil==maxfil)||(Mpalabras[fil][col]==' ')) {
							pos_fin_f=fil-1;
							pos_fin_c=col-1;
							System.out.println("posicion final fila"+pos_fin_f+"columna"+pos_fin_c);
							capicua= capicua+busca_capicua(Mpalabras,pos_ini_f,pos_ini_c,pos_fin_f,pos_fin_c);
							System.out.println("hasta el momento el numero de capicuas es: "+ capicua);
							if (fil==maxfil) {
								col=0;
							}
						}
					}
				}	
				return capicua;
			}
}