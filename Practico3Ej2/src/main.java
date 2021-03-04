
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Electrodomestico n1= new Electrodomestico("heladera pilco");
		Electrodomestico n2= new Electrodomestico("lavarropas drean",33000);
		Electrodomestico n3= new Electrodomestico("lavavajillas","verde");
		Electrodomestico n4= new Electrodomestico("microondas",2,"plateado",80,7.5);
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		System.out.println(n4.toString());
		System.out.println(n4.es_alta_gama());
		System.out.println(n4.esbajo_consumo());
		System.out.println(n4.calcular_balance());
	}

}
