package practico2Ej4;

import java.util.ArrayList;

public class temporada {
int nroTemporada;
ArrayList<episodio>episodios;

public temporada(int g) {
	nroTemporada=g;
	episodios=new ArrayList<episodio>();
}
 
public void addepisodio(episodio e) {
	episodios.add(e);
}

public int getCantEpisodios() {
	return episodios.size();
}

public int getEpisodiosVistos(){
	int cantvistos=0;
	for (int i=0;i<episodios.size();i++) {
		if (episodios.get(i).getVisto()) {
			cantvistos++;
		}
	}
	return cantvistos;
}

public int getCantEpisodiosVistos() {
	int cantvistos=0;
	for (episodio e: episodios)
		if (e.getVisto()) {
			cantvistos++;
		}
	return cantvistos;
}


public double GetPromedioCalifT() {
	double sumacalif=0;
	int episodiosCalif=0;
	for (episodio e: episodios)
		if (e.getCalificacion()>0) {
			sumacalif+=e.getCalificacion();
			episodiosCalif++;
		}
	return sumacalif/episodiosCalif;
}
	




}
