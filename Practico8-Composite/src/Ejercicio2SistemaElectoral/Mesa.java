package Ejercicio2SistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;

public class Mesa extends ElementoElectoral {
	private String nombre;
	private ArrayList<Voto>votos;
	private ArrayList<Integer>padron;
	
	
	public Mesa (String nombre) {
		this.nombre=nombre;
		votos= new ArrayList<>();
		padron= new ArrayList<>();
	}

	public ArrayList<Candidato>listaCandidatos(){
		ArrayList<Candidato> aux= new ArrayList<>();
		for (Voto v: votos) {
			if (!aux.contains(v.getCandidato())) {
				aux.add(v.getCandidato());
			}
		}
		Collections.sort(aux);
	return aux;
	
	}
	
	
	public void agregarVoto(Voto voto) {
		if (padron.contains(voto.getDni())){
			votos.add(voto);
		}
	}
	
	public void agregardniPadron(int dni) {
		if (!padron.contains(dni))
			padron.add(dni);
	}
	
	@Override
	public int contarTotalidadVotos() {
		return votos.size();
	}
	

	public int contarVotoxCriterio(Criterio criterio) {
		int contador=0;
		for (Voto v: votos) {
			if (criterio.cumple(v)){
				contador++;
			}
		}
		return contador;
	}

	@Override
	public String getNombre() {
		return nombre;
	}



	@Override
	public double porcentajeporCriterio(Criterio criterio) {
		return ((double)(contarVotoxCriterio(criterio)/(double)contarTotalidadVotos())*100);
		
	}



	
}

