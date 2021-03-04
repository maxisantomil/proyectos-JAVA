package Ejercicio6Congreso;

import java.util.ArrayList;

public class Trabajo {
	String nombre;
	ArrayList<String>palabrasclaves;
	Evaluador evaluadorAsignado;
	
	
	public Trabajo(String n) {
		palabrasclaves= new ArrayList<>();
		evaluadorAsignado= new Evaluador();
	}
	
	
	public boolean puedeserEvaluado(Evaluador e) {
		ArrayList<String>claveEva= e.getPalabrasclaves();
		
		for (String p:palabrasclaves) {
			if (!(claveEva.contains(p.toLowerCase()))){
				return false;
			}
		}
		return true;
	}
	
	public void agregarEvaluador(Evaluador x) {
		this.evaluadorAsignado= x;
	}
}
