package Ejercicio1Contrato;

import java.util.ArrayList;

public class Consultora {
	String nombre;
	ArrayList<Candidato>candidatos;
	
	public Consultora(String nombre) {
		this.nombre=nombre;
		candidatos= new ArrayList<>(); 
	}
	
	public void agregarCandidatos(Candidato cand) {
		candidatos.add(cand);
	}
	
	public ArrayList<Candidato>potencialesCandidatos(Contrato c){
		ArrayList<Candidato> potenciales= new ArrayList<>();
		for (Candidato cand: candidatos) {
			if (cand.aceptaContrato(c)){
				potenciales.add(cand);
			}
		}
		return potenciales;
	}
	
}
