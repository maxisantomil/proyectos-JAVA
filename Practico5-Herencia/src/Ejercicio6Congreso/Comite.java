package Ejercicio6Congreso;

import java.util.ArrayList;

public class Comite {
	private String nombre;
	ArrayList<Evaluador>evaluadores;
	ArrayList<Trabajo>trabajos;
	
	public Comite (String n) {
		nombre=n;
	}
	
	
	public boolean esAptoparaEvaluar(Evaluador e, Trabajo t) {
		if (t.puedeserEvaluado(e))
			return true;
		else return false;
	}
	
	
	public ArrayList<Trabajo> trabajosAsignablesaEvaluador(Evaluador x){
	 ArrayList<Trabajo> trabajosAsig= new ArrayList<>();
		for (Trabajo t: trabajos) {
			if (t.puedeserEvaluado(x)){
				trabajosAsig.add(t);
			}
		}
		return trabajosAsig;
	}
	
	public void asignaEvaluador(Trabajo t) {
		for (int i=0; i< evaluadores.size();i++) {
			if (t.puedeserEvaluado(evaluadores.get(i))) {
				t.agregarEvaluador(evaluadores.get(i));
				i=evaluadores.size();
			}
		}
	}
}