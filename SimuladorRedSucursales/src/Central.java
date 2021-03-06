
public class Central {
	final static int MAXTIPOPROD = 5;
	final static int MAXINFOPROD = 3;
	final static int MAXSUC = 10;
	final static int CANTPROD=0;
	final static int MINPROD=1;
	final static int MAXPROD=2;
	private Sucursal [] redSucursales = new Sucursal[MAXSUC];
	private int cantSucursales = 0;
	private int [][] productos = new int [MAXINFOPROD][MAXTIPOPROD];
	
	public void inicializar() {
		for (int i = 0; i < MAXINFOPROD; i++) {
			for (int j = 0; j < MAXTIPOPROD; j++) {
				productos[i][j] = 0;
			}
		}
	}
	
	public void setearStockProductosC(int idProd, int cant, int min, int max) {
		productos[CANTPROD][idProd] = cant;
		productos[MINPROD][idProd] = min;
		productos[MAXPROD][idProd] = max;
	}
	
	public void agregarSucursal(Sucursal S) {
		if (cantSucursales < MAXSUC-1) {
			redSucursales[cantSucursales] = S;
			cantSucursales++;
		}
	}
	
	public Sucursal obtenerSucursal(int pos) {
		return redSucursales[pos];
	}
	
	public void imprimirEstadoRed () {
		imprimirEstadoCentral();
		imprimirEstadoSucursales();
	}
	
	private void imprimirEstadoCentral () {
		System.out.println("Central :");
		for (int j = 0; j < MAXTIPOPROD; j++) {
				System.out.println("idProducto: "+ j+
				" cantidad: " + productos[CANTPROD][j]+
				" Min: "+productos[MINPROD][j]+
				" Max: "+productos[MAXPROD][j]);
				System.out.println("");
			}
		}
	
	private void imprimirEstadoSucursales() {
		
		for (int i = 0; i < cantSucursales; i ++) {
			System.out.println("Sucursal: " + i);
			System.out.println("");
			for (int j = 0; j < MAXTIPOPROD; j++) {
				System.out.println( 
					" Producto: "+ j +" Cantidad: "+ obtenerSucursal(i).obtenerCantProducto(j) +
					" M�n: " + obtenerSucursal(i).obtenerMinProducto(j) +
					" M�x: " + obtenerSucursal(i).obtenerMaxProducto(j));
				System.out.println("");
			}
		}
	}
	public void ConsultaCantidadesNecesarias(Sucursal S) {
		int cantfaltante=0;
		for (int Idproducto = 0; Idproducto < MAXTIPOPROD; Idproducto++) {
			int cantdelmomento=S.obtenerCantProducto(Idproducto);
			if (cantdelmomento!=-1) {
				cantfaltante= (S.obtenerPromStock(Idproducto)-cantdelmomento);
				if ((cantfaltante !=0)&& (cantfaltante!=cantdelmomento)&& cantdelmomento<S.obtenerPromStock(Idproducto)) {
					System.out.println("cantidad necesaria a completar :"+ cantfaltante + "  del Producto  "+ Idproducto); 
				}
			}		
	}
}
	public void autoAbastecerSucursal(Sucursal S, int idProd) {
		int cantNecesaria = S.obtenerCantProducto(idProd);
		while (cantNecesaria < S.obtenerPromStock(idProd)) {
			cantNecesaria++;
		}
		int cantDistribuida = (cantNecesaria - (S.obtenerCantProducto(idProd)));
		if (productos[CANTPROD][idProd] >= cantDistribuida) {
			productos[CANTPROD][idProd] = productos[CANTPROD][idProd]-(cantDistribuida);
			S.setearStockProductoS(idProd, cantNecesaria, S.obtenerMinProducto(idProd), S.obtenerMaxProducto(idProd));
		}
		//else 
			//System.out.println("no dispone la cantidad necesaria para abastecer el producto"+ idProd);
	}
	
	public int CantidadesNecesarias_a_comprar(int idProd) {
		int cantfaltante=0;
		int cant_central=0;
		for (int i = 0; i < cantSucursales; i ++) {
			if ((obtenerSucursal(i).obtenerCantProducto(idProd))!=-1) {
				cantfaltante= cantfaltante +  ((obtenerSucursal(i).obtenerMaxProducto(idProd))-(obtenerSucursal(i).obtenerCantProducto(idProd)));
				}
			}
		cant_central=(productos[MAXPROD][idProd]-productos[CANTPROD][idProd]);
		cantfaltante=cantfaltante + cant_central;
		if (cantfaltante>0 ){
		return cantfaltante;
	}
		else 
			return -1;
}
	
	public void comprar_producto(int idProd) {
		int Cantnecesariade_la_red= CantidadesNecesarias_a_comprar(idProd);
		if (Cantnecesariade_la_red!=-1) {
			System.out.println("la cantidad que puede adquirir del producto: "+ idProd +" es de:"+ Cantnecesariade_la_red );
			//productos[CANTPROD][idProd]= productos[CANTPROD][idProd]+Cantnecesariade_la_red;
		}
	}
}