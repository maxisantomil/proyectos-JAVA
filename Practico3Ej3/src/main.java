
public class main {

	public static void main(String[] args) {
	
		PuntoGeometrico punto1= new PuntoGeometrico(1,1);
		PuntoGeometrico punto2= new PuntoGeometrico(4,8);
		
		Rectangulo rectangulo1 = new Rectangulo (punto1,4,2);
		Rectangulo rec2= new Rectangulo (punto2,9,1);
		Rectangulo rec3= new Rectangulo (punto2,9,1);
		System.out.println("ancho del rectangulo: " + rectangulo1.ancho);
		System.out.println("largo del rectangulo: " +rectangulo1.largo);
		rectangulo1.estructurarRectangulo();
		System.out.println("area del rectangulo: " + rectangulo1.calcular_area());
		System.out.println("es cuadrado?: "+ rectangulo1.es_cuadrado());
		System.out.println("utilizando la formula el largo superior es de: "+ rectangulo1.largo_superior());
		System.out.println("en que posicion se encuentra el rectangulo?: "+ rectangulo1.posicion()); 
		System.out.println("las coordenadas son las siguientes : " + "(" +rectangulo1.vertice1.getCoordenadax()+ "," + rectangulo1.vertice1.getCoordenaday() + ")" + "(" +rectangulo1.vertice2.getCoordenadax() + ","+ rectangulo1.vertice2.getCoordenaday()+ ")"+ "(" +rectangulo1.vertice3.getCoordenadax() + ","+ rectangulo1.vertice3.getCoordenaday()+ ")" + "(" +rectangulo1.vertice4.getCoordenadax() +","+ rectangulo1.vertice4.getCoordenaday()+ ")");
		System.out.println("el rectangulo es mayo si = 1/ es igual si =0 / es menor = -1 :   "+ rec2.esmayor(rec3));
		System.out.println("ancho del rectangulo: " + rec2.ancho);
		System.out.println("largo del rectangulo: " +rec2.largo);
		rec2.estructurarRectangulo();
		System.out.println("area del rectangulo: " + rec2.calcular_area());
		System.out.println("es cuadrado?: "+ rec2.es_cuadrado());
		System.out.println("utilizando la formula el largo superior es de: "+ rec2.largo_superior());
		System.out.println("en que posicion se encuentra el rectangulo?: "+ rec2.posicion()); 
		System.out.println("las coordenadas son las siguientes : " + "(" +rec2.vertice1.getCoordenadax()+ "," + rec2.vertice1.getCoordenaday() + ")" + "(" +rec2.vertice2.getCoordenadax() + ","+ rec2.vertice2.getCoordenaday()+ ")"+ "(" +rec2.vertice3.getCoordenadax() + ","+ rec2.vertice3.getCoordenaday()+ ")" + "(" +rec2.vertice4.getCoordenadax() +","+ rec2.vertice4.getCoordenaday()+ ")");
	}

}
