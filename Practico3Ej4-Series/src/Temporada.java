import java.util.ArrayList;

public class Temporada {
	private int ndetemporada;
	ArrayList<Episodio>Episodios;
	
	
	
	
	public Temporada(int temp) {
		ndetemporada=temp;
		Episodios = new ArrayList<Episodio>();
	}
	
	public int getNtemporada() {
		return ndetemporada;
	}
	
	public void agregarepisodios(Episodio r) {
		Episodios.add(r);
	}
	
	public int totalepisodiosvistos() {
		int cantidad=0;
		for (Episodio e:Episodios) {
			if (e.isFlagvisto()) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public double promediotemporada() {
		double sumacalif=0;
		int cantcap=0;
		for (Episodio e: Episodios) {
			if (e.isFlagvisto()) {
			sumacalif= sumacalif + e.getCalificacion();
			cantcap++;
			}
		}
		 if (cantcap>0) {
			 return (sumacalif/cantcap); 
		 }
		 else return 0;
	}
	
	public boolean viotemporadacompleta() {
		for (Episodio e: Episodios) {
			if (!e.isFlagvisto()) {
				return false;
			}
		}
		 return true; 
	}
	
	public int cantidadepisodios() {
		return Episodios.size();
	}
}
