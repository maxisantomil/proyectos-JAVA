package practico2Ej4;
import java.util.ArrayList;
public class serie {
	String titulo;
	String descripcion;
	String creador;
	String genero;
	ArrayList<temporada>temporadas;
		
	
public serie (String tit,String des,String cr,String gen) {
	titulo=tit;
	descripcion=des;
	creador=cr;
	genero=gen;
	temporadas=new ArrayList<temporada>();
}
	public boolean addTemporada(temporada t) {
		return temporadas.add(t);
	}
	public int getCantVistos() {
		int cantvistos=0;
		for (temporada t:temporadas)
				cantvistos+=t.getCantEpisodiosVistos();
		return cantvistos;
	}
	
	
	public int getCantTemporadas() {
		return temporadas.size();
	}
	
	
	
	
	
	
	
	
	
	
	
}
