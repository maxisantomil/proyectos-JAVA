
public class Sucursal {
	final static int MAXTIPOPROD = 5;
	final static int MAXINFOPROD = 3;
	private int [][] productos = new int [MAXINFOPROD][MAXTIPOPROD];
	final static int CANTPROD=0;
	final static int MINPROD=1;
	final static int MAXPROD=2;
	
	public void inicializar() {
		for (int i = 0; i < MAXINFOPROD; i++) {
			for (int j = 0; j < MAXTIPOPROD; j++) {
				productos[i][j] = -1;
			}
		}
	}
	
	public void setearStockProductoS(int idProd, int cant, int min, int max) {
		productos[CANTPROD][idProd] = cant;
		productos[MINPROD][idProd] = min;
		productos[MAXPROD][idProd] = max;
	}
	
	public int obtenerCantProducto(int idProd) {
		return productos[CANTPROD][idProd];
	}
	public int obtenerMinProducto(int idProd) {
		return productos[MINPROD][idProd];
	}
	public int obtenerMaxProducto(int idProd) {
		return productos[MAXPROD][idProd];
	}
	
	public int obtenerPromStock(int idProd) {
		return (obtenerMaxProducto(idProd)+obtenerMinProducto(idProd))/2;
		
	}
	
	public void vendeProducto(int idProd, int venta) {
		if (venta <= productos[CANTPROD][idProd]) {
			productos[CANTPROD][idProd] = productos[CANTPROD][idProd]-venta;
		} else {
			System.out.println("Sobrepasa límite de stock."
					+ "No puede realizar la venta. Stock disponible al momento : " +productos[0][idProd]);
		}
	}
	
}
