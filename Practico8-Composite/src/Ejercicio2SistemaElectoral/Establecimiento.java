package Ejercicio2SistemaElectoral;

import java.util.ArrayList;
import java.util.Collections;

public class Establecimiento extends ElementoElectoral {
	private String nombre;
	private ArrayList<ElementoElectoral>lugar;
	
	
	
	public Establecimiento(String nombre) {
		this.nombre=nombre;
		lugar= new ArrayList<>();
	}
	
	
	public void agregarLugar(ElementoElectoral l) {
		lugar.add(l);
	}

	public double porcentajeporCriterio(Criterio criterio) {
		double prom=0;
		int votosTotales=0;
			votosTotales+=contarTotalidadVotos();
				prom+= contarVotoxCriterio(criterio);
		//return prom;
		//return votosTotales;
		return (double)((prom/votosTotales)*100);
	}


	@Override
	public int contarVotoxCriterio(Criterio criterio) {
		int contador=0;
		for (ElementoElectoral v: lugar) {
			contador+= v.contarVotoxCriterio(criterio);
		}
		return contador;
	}


	 public int contarTotalidadVotos() {
		 int cant=0;
		 for(ElementoElectoral e: lugar) {
		 cant+=e.contarTotalidadVotos();
		 }
		 return cant;
		 }


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<Candidato> listaCandidatos() {
		ArrayList<Candidato>listaCandidatos=new ArrayList<>();
		ArrayList<Candidato>listaC= null;
		for (ElementoElectoral e: lugar) {
			listaC=e.listaCandidatos();
			for (Candidato c: listaC) {
				if (!listaCandidatos.contains(c)){
				listaCandidatos.add(c);
				}
			}
		
		}
		return listaCandidatos;
	}
	
}
