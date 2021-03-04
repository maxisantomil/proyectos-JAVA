
public class Main {

	public static void main(String[] args) {
		Pelicula pelicula1= new Pelicula("the lord of the ring", "blabla", "Peter Jackson", 2003, 230, 16);
		pelicula1.agregarActor("sam");
		pelicula1.agregarActor("frodo");
		pelicula1.agregarActor("gorum");
		pelicula1.agregarGenero("aventura");
		pelicula1.agregarGenero("drama");
		pelicula1.agregarGenero("guerra");
		
		Pelicula pelicula2= new Pelicula("star wars", "en una galaxia..", "lucasfilm", 1997, 210, 16);
		pelicula2.agregarActor("vader");
		pelicula2.agregarActor("chewaca");
		pelicula2.agregarActor("skywalker");
		pelicula2.agregarGenero("cs ficcion");
		pelicula2.agregarGenero("drama");
		pelicula2.agregarGenero("guerra");
				
		Pelicula pelicula3= new Pelicula("Scarface", "jksahdlaj", "Martin Scorsese", 1994, 190, 18);
		pelicula3.agregarActor("Will Smith");
		pelicula3.agregarActor("Will Smith");
		
		pelicula3.agregarActor("Adam Sandler");
		pelicula3.agregarActor("Stamanth");
		pelicula3.agregarGenero("accion");
		pelicula3.agregarGenero("drama");
				
		
		PlataformaStreaming netflix= new PlataformaStreaming("netflix");
		netflix.agregarPelicula(pelicula1);
		netflix.agregarPelicula(pelicula2);
		netflix.agregarPelicula(pelicula3);
		
		Criterio cri1= new CriterioDirector("peter");
		Criterio cri2= new CriterioTituloContiene("war");
		Criterio cri4= new CriterioActor("skywAlker");
		Criterio cr5= new CriterioGenero("dramA");
		Criterio cr3And= new CriterioAnd(cri1, cri2);
		Criterio NotDirector= new CriterioNot(cri1);
		Criterio And2= new CriterioAnd(NotDirector, cri4);
		
		
		System.out.println(netflix.buscadorPeliculas(cr5));
		System.out.println("la pelicula es rentable ? : "+netflix.esrentable(pelicula1,cr5));
		System.out.println("las peliculas disponibles son: "+netflix.mostrarCatalogo());
	}

}
