
public class ejInsertarPatronOrdenado {
	final static int MAXARR = 17, MAXNUM = 10, INDINICIAL = 0, INDNULL = -1, MAXPATRON = 1;

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2, 0, 4, 5, 0, 6, 7, 0, 9, 10, 11, 0 };
		int[] pat = {5};
		int fin = INDNULL, ini = INDINICIAL, secLength = INDINICIAL;
		boolean patronInsertado = false;
		
		while (ini != INDNULL) {
			ini = obtenerInicioSec(arr, fin);
			if (ini != INDNULL) {
				fin = obtenerFinSec(arr, ini);
				secLength = calcularSecLength(ini, fin);
				if ((secLength >= MAXPATRON) && (!patronInsertado)) {
					for (int i = INDINICIAL; i < MAXPATRON + 1; i++) {
						corrimientoDerecha(arr, ini + i, MAXARR);
					}
					for (int j = INDINICIAL; j < MAXPATRON; j++) {
						arr[ini + j] = pat[j];
					}
					arr[ini + MAXPATRON] = INDINICIAL;
					patronInsertado = true;
				}
			}
		}
		imprimirArreglo(arr);
	}

	private static void corrimientoDerecha(int[] arr, int ini, int fin) {
		for (int i = fin - 1; i > ini; i--) {
			arr[i] = arr[i - 1];
		}
	}

	private static int calcularSecLength(int ini, int fin) {
		return fin + 1 - ini;
	}

	public static void inicializarArreglo(int[] arr) {
		for (int i = 0; i < MAXARR; i++) {
			arr[i] = (int) (Math.random() * MAXNUM);
		}
	}

	public static int obtenerInicioSec(int[] arr, int finAnt) {
		int i = finAnt + 1;
		while ((i < MAXARR) && (arr[i] == 0)) {
			i++;
		}
		if (i < MAXARR) {
			return i;
		} else {
			return INDNULL;
		}
	}

	public static int obtenerFinSec(int[] arr, int ini) {
		if (ini != INDNULL) {
			int i = ini;
			while ((i < MAXARR) && (arr[i] != 0)) {
				i++;
			}
			return i - 1;
		} else {
			return INDNULL;
		}
	}

	public static void imprimirArreglo(int[] arr) {
		for (int i = 0; i < MAXARR; i++) {
			System.out.println("pos " + i + ": " + arr[i]);
		}
	}
}
