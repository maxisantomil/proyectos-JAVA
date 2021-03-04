package Ejercicio2;

public class CasaExigente extends CasaHowart{

	
	
	public CasaExigente(String n, int e) {
		super(n,e);
	}
	
	
	public boolean cumpleCondiciones (Alumno alumno) {
		if (!(super.cumpleCondiciones(alumno))){
			return false;
		}
		if (alumno.tieneFamiliarCasa(this)){
			return true;
			}else return false;
		}
	
	
	public String mensajeNocumple() {
		return "no cumple con las exigencias de la casa el alumno";
	}
}
