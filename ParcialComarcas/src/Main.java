
public class Main {

	public static void main(String[] args) {
	Comarca c1= new Comarca("rivendel",66000,15000, 390000);
	Comarca c2= new Comarca("hobbiton",25000,9000, 30000);
	Comarca c3= new Comarca("elfos",55000,3000, 84000);
	Comarca c4= new Comarca("sauron",70000,50000,6666);
	
	Territorio edadmedia= new Territorio("edad media");
	edadmedia.agregarTerritorio(c1);
	edadmedia.agregarTerritorio(c2);
	edadmedia.agregarTerritorio(c3);
	edadmedia.agregarTerritorio(c4);
	
	Criterio criterioHabitantes= new CriterioCantHabitantesMayorA(1000);
	
	System.out.println(edadmedia.cantHabitantes());
	System.out.println(edadmedia.superficieTotal());
	System.out.println(edadmedia.ingresosTotales());
	System.out.println(edadmedia.ingresosPerCapita());
	System.out.println(edadmedia.densidadPoblacion());
	System.out.println(edadmedia.listarComarcasporCriterio(criterioHabitantes));
	}

}
