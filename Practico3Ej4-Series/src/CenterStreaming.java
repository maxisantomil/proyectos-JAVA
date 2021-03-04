
public class CenterStreaming {

	public static void main(String[] args) {
	Serie s1= new Serie("Outlander","serie de epoca ","Tomas Gold","aventura/romance/drama");
	Serie s2= new Serie("Dark","serie de misterio","Hins","misterio/suspenso");
	Temporada s1t1= new Temporada(1);
	Temporada s1t2= new Temporada(2);
	Temporada s1t3= new Temporada(3);
	
	Temporada s2t2= new Temporada(1);
	
	Episodio s1e1t1= new Episodio("episodio 1","sinopsis");
	Episodio s2e1t1= new Episodio("episodio 1 ","lalal");
	Episodio s1e2t1= new Episodio("episodio 2","kakak");
	Episodio s1e3t1= new Episodio ("episodio 3", "lelel");
	Episodio s1e1t2= new Episodio ("episodio 1 ","temporada 2 ");
	Episodio s1e2t2= new Episodio ("episodio 2 ","temporada 2 ");
	Episodio s1e3t2= new Episodio ("episodio 3","temporada 2");
	Episodio s1e4t2= new Episodio ("episodio 4 ","temporada 2");
	
	
	s1t1.agregarepisodios(s1e1t1);
	s1t1.agregarepisodios(s1e2t1);
	s1t1.agregarepisodios(s1e3t1);
	s1t2.agregarepisodios(s1e1t2);
	s1t2.agregarepisodios(s1e2t2);
	s1t2.agregarepisodios(s1e3t2);
	s1t2.agregarepisodios(s1e4t2);
	s1.addtemporada(s1t1);
	s1.addtemporada(s1t2);
	//s1e1t2.agregarCalificacion(3);
	s1e2t2.agregarCalificacion(5);
	s1e3t2.agregarCalificacion(1);
	s1e4t2.agregarCalificacion(2);
	s1e1t1.agregarCalificacion(5);
	s1e2t1.agregarCalificacion(3);
	s1e3t1.agregarCalificacion(4);
	System.out.println("promedio de la temporada 2 : " + s1t2.promediotemporada());
	System.out.println("promedio de la temporada 1: " + s1t1.promediotemporada());
	System.out.println("total de episodios vistos : "+ s1t1.totalepisodiosvistos() + "de la temporada :"+ s1t1.getNtemporada() );
	System.out.println("total de episodios vistos : "+ s1t1.totalepisodiosvistos() + "de la temporada :"+ s1t2.getNtemporada() );
	System.out.println("cantidad de episodios vistos :  " + s1.cantEpisodiosVistos());
	System.out.println("cantidad de temporadas : " + s1.canttemporadas());
	System.out.println("promedio de la serie:  "+ s1.promedioSerie());
	System.out.println("se vieron todas las temporadas: " + s1.seriecompleta() );
	System.out.println("temporadas: "+ s1.getTemporadas());
	}

}
