
public class Main {

	public static void main(String[] args) {
		
		
		Actor a1= new Actor("ridley","Scott" ,1971);
		Actor a2= new Actor("berter","Petrier" ,1887);
		Actor a3= new Actor("curtus","Segel" ,1993);
		Actor a4= new Actor("tom","Bombadil" ,2000);
		Actor a5= new Actor("bumblebe","Trans" ,1999);
		Actor a6= new Actor("patrik","Rya" ,1952);
		
		Pelicula alien1= new Pelicula("Alien 1 ", 9.2, 1996,3);
		alien1.agregarActor(a1);
		alien1.agregarActor(a2);
		alien1.agregarActor(a6);
		Pelicula alien2= new Pelicula("Alien 2 ", 8, 1997,1);
		alien2.agregarActor(a3);
		alien2.agregarActor(a4);
		Pelicula alien3= new Pelicula("Alien 3 ", 7.2, 1999,2);
		alien3.agregarActor(a5);
		Pelicula alien4= new Pelicula("Alien 4 ", 8.9, 2004,0);
		alien4.agregarActor(a6);
		Grupo SagaAliens= new Grupo("Saga Aliens");
		SagaAliens.agregarElementoIMDB(alien1);
		SagaAliens.agregarElementoIMDB(alien2);
		SagaAliens.agregarElementoIMDB(alien3);
		SagaAliens.agregarElementoIMDB(alien4);
		
		Criterio Criterioactor= new CriterioActor(a6);
		
		
		
		System.out.println(SagaAliens.cantPeliculas());
		System.out.println(SagaAliens.cantOscars());
		System.out.println(SagaAliens.promedioPuntaje());
		System.out.println(SagaAliens.listaPeliculasCriterio(Criterioactor));

	}

}
