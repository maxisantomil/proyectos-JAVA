package Ejercicio3Navidad;

public class MainNavidad {

	public static void main(String[] args) {

		Carta c1= new Carta(1);
		Carta c2= new Carta(2);
		Carta c3= new Carta(3);
		Carta c4= new Carta(4);
		Carta c5= new Carta(5);
		Carta c6= new Carta(6);
		Carta c7= new Carta(7);
		Carta c8= new Carta(8);
		Carta c9= new Carta(9);
		Carta c10= new Carta(1);
		
		c1.agregarRegaloDeseado("auto");
		c2.agregarRegaloDeseado("avion");
		c3.agregarRegaloDeseado("auto");
		c4.agregarRegaloDeseado("compu");
		c5.agregarRegaloDeseado("auto");
		c6.agregarRegaloDeseado("auto");
		c7.agregarRegaloDeseado("auto");
		c8.agregarRegaloDeseado("auto");
		c9.agregarRegaloDeseado("auto");
		c2.agregarRegaloDeseado("play5");
		c10.agregarRegaloDeseado("casa");
		
		Buzon villaitalia= new Buzon();
		Buzon tunitas= new Buzon();
		Buzon zonaparque= new Buzon();
		Lugar tandil= new Lugar("tandil");
		Lugar Argentina= new Lugar("Buenos Aires");

		villaitalia.agregarAlistaNiniosbuenos(1);
		villaitalia.agregarAlistaNiniosbuenos(2);
		villaitalia.agregarcarta(c1);
		villaitalia.agregarcarta(c2);
		villaitalia.agregarcarta(c10);
		
	
		tunitas.agregarAlistaNiniosbuenos(7);
		tunitas.agregarAlistaNiniosbuenos(8);
		tunitas.agregarAlistaNiniosbuenos(9);
		tunitas.agregarcarta(c3);
		tunitas.agregarcarta(c4);
		tunitas.agregarcarta(c7);
		tunitas.agregarcarta(c8);
		tunitas.agregarcarta(c9);
		

		zonaparque.agregarcarta(c5);
		zonaparque.agregarcarta(c6);
		
		tandil.agregarLugar(villaitalia);
		tandil.agregarLugar(tunitas);
		tandil.agregarLugar(zonaparque);
		Argentina.agregarLugar(tandil);
		
		System.out.println("cantidad cartas recibidas : "+Argentina.cantCartasTotalesRecibidas());
		System.out.println("cantidad cartas de x regalo: "+ Argentina.cantCartasRegalo("casa"));
		System.out.println(Argentina.porcentajeCartasRegalo("auto"));
		System.out.println(tunitas.porcentajeCartasRegalo("auto"));
		System.out.println(Argentina.cantNiniosMalos());
	}

}
