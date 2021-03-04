package Ejercicio6Congreso;

import java.util.ArrayList;

public class Poster extends Trabajo {

	
	public Poster(String n) {
		super(n);
	}
	
	
	public boolean puedeserEvaluado(Evaluador e) {
		ArrayList<String> nueva= e.getPalabrasclaves();
		
		for (String p:palabrasclaves) {
			if (nueva.contains(p.toLowerCase())){
				return true;
			}
		}
		return false;
	}
}
