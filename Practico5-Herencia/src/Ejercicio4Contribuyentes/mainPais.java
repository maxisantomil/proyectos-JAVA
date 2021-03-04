package Ejercicio4Contribuyentes;

import java.util.ArrayList;

public class mainPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Territorio>argentina= new ArrayList<>();
		Territorio buenosaires= new Territorio("Buenos Aires");
		Territorio lapampa= new Territorio ("La Pampa");
		
		Ciudad tandil= new Ciudad("Tandil",120000,5000);
		Ciudad mardelplata= new Ciudad("Mar del Plata",250000,500000);
		Ciudad olavarria= new Ciudad("Olavarria",80000,350000);
		Ciudad balcarce= new Ciudad("Balcarce",20000,50000);
		
		Contribuyente c1= new Contribuyente("santillan", 1, 12000);
		Contribuyente c2= new Contribuyente("perez", 2, 15000);
		Contribuyente c3= new ContribuyentePorcentaje("gomez", 3, 12000, 30000,0.3,0.5); 
		Contribuyente c4= new ContribuyentePorcentaje("santomil",4, 15000,50000,0.02,0.2);
		System.out.println(c1.getMonto());
		System.out.println(c2.getMonto());
		System.out.println(c3.getMonto());
		System.out.println(c4.getMonto());
		
		tandil.agregarContribuyente(c1);
		tandil.agregarContribuyente(c2);
		tandil.agregarContribuyente(c3);
		tandil.agregarContribuyente(c4);
		System.out.println("monto recaudado: "+tandil.montoRecaudado());
		System.out.println(tandil.estaEnDeficit());
		System.out.println(tandil.informeCiudad());
		
		buenosaires.agregarCiudad(tandil);
		buenosaires.agregarCiudad(mardelplata);
		buenosaires.agregarCiudad(olavarria);
		buenosaires.agregarCiudad(balcarce);
		System.out.println(buenosaires.ciudadesEnDeficit());
		System.out.println(buenosaires.provDeficit());
		
		argentina.add(buenosaires);
		argentina.add(lapampa);
		for (Territorio t :argentina) {
			System.out.println(t.nombre+"  tiene las siguientes ciudades en deficit : ");
			System.out.println(t.ciudadesEnDeficit());
		}
	}

}
