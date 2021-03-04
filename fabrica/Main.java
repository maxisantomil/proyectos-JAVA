package tp2.fabrica;

public class Main {

	public static void main(String[] args) {
		Fabrica f1 = new Fabrica("F1");
		
		Mueble sillaWindsor = new Mueble("Windor", 5, 1000, "roble", "marron", 1.35);
		sillaWindsor.fabricar(10);
		
		Mueble sillaThonet = new Mueble("Thonet", 4, 500, "pino", "blanca", 1.10);
		sillaThonet.fabricar(5);

		f1.addMueble(sillaWindsor);
		f1.addMueble(sillaThonet);
		
		System.out.println("COSTO STOCK: " + f1.calcularCostoStock());
		System.out.println("PRECIO STOCK: " + f1.calcularPrecioVentaStock());
	
	}

}
