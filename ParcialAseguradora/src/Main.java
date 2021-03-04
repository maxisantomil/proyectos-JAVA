import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Atributo a1= new Atributo("numero de poliza",555);
		Atributo a11= new Atributo("tipo","automotor");
		Atributo a2= new Atributo("Patente", "bpa916");
		Atributo a3= new Atributo("dni", 35172571);
		SeguroSimple seguroAutomotor= new SeguroSimple("seguro Automotor",1500);
		Atributo a7= new Atributo("numero de poliza",333);
		Atributo a8= new Atributo("tipo","automotor");
		Atributo a9= new Atributo("Patente", "hgq");
		Atributo a10= new Atributo("dni",6565656);
		SeguroSimple seguroAutomotor2= new SeguroSimple("seguro Automotor",1700);
		seguroAutomotor2.agregarAtributos(a7);
		seguroAutomotor2.agregarAtributos(a8);
		seguroAutomotor2.agregarAtributos(a9);
		seguroAutomotor2.agregarAtributos(a10);
		seguroAutomotor.agregarAtributos(a1);
		seguroAutomotor.agregarAtributos(a2);
		seguroAutomotor.agregarAtributos(a3);
		seguroAutomotor.agregarAtributos(a11);
		
		Atributo a4= new Atributo("Poliza Hogar",123);
		Atributo a5= new Atributo("direccion","maipu 1190");
		Atributo a6= new Atributo("color paredes","rojo");
		SeguroSimple seguroHogar= new SeguroSimple("seguro hogar",1600);
		seguroHogar.agregarAtributos(a4);
		seguroHogar.agregarAtributos(a5);
		seguroHogar.agregarAtributos(a6);
		
		SeguroCompuesto SeguroIntegrador= new SeguroCompuesto("seguro Integrador I",10);
		SeguroIntegrador.agregarSeguro(seguroHogar);
		SeguroIntegrador.agregarSeguro(seguroAutomotor);
		SeguroIntegrador.agregarSeguro(seguroAutomotor2);
		
		SeguroEspecial SeguroViajante= new SeguroEspecial("viajero", 20, LocalDate.of(2020, 11, 01),LocalDate.of(2020, 11, 30));
		
		SeguroViajante.agregarSeguro(seguroAutomotor);
		SeguroViajante.agregarSeguro(seguroAutomotor2);
		SeguroViajante.agregarSeguro(SeguroIntegrador);
		
		Criterio c1= new CriterioAtributo(a11);
		System.out.println(SeguroIntegrador.getPrecio());
		System.out.println(SeguroIntegrador.ListaSegurosCriterio(c1));
		System.out.println(SeguroIntegrador);
		System.out.println(SeguroViajante.getPrecio());
		System.out.println(SeguroViajante.ListaSegurosCriterio(c1));
	}

}
