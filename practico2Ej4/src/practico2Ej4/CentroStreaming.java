package practico2Ej4;

public class CentroStreaming {

	public static void main(String []args) {
		serie serie1=new serie("Peaky Blinders","descripcion","knight","drama");
		temporada t1= new temporada(1);
		episodio e1=new episodio("capitulo 1 ","algo del capitulo");
		episodio e2=new episodio("capitulo 2 ","algo del capitulo dos ");
		episodio e3=new episodio("capitulo 3 ","algo del capitulo tres");
		temporada t2= new temporada(2);
		serie1.addTemporada(t1);
		serie1.addTemporada(t2);
		System.out.println("cantidad de temporadas serie 1: "+ serie1.getCantTemporadas());
		t1.addepisodio(e1);
		t1.addepisodio(e2);
		t1.addepisodio(e3);
		System.out.println(t1.getCantEpisodios());
		
		serie serie2=new serie("en tanga","descripcion","jhjhj","drama");
		temporada tt1= new temporada(1);
		serie2.addTemporada(tt1);
		System.out.println(serie2.getCantTemporadas());
	}
	
}
