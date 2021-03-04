package Ejercicio1;

public class Alarma {
	String nombre;
	boolean rompiovidrio;
	boolean abriopuertaventana;
	boolean detectamovimiento;
	Timbre timbre;

	public Alarma() {
		nombre="comun";
		rompiovidrio=false;
		abriopuertaventana=false;
		detectamovimiento=false;
	}

public boolean isRompiovidrio() {
		return rompiovidrio;
	}

	public void setRompiovidrio(boolean rompiovidrio) {
		this.rompiovidrio = rompiovidrio;
	}

	public boolean isAbriopuertaventana() {
		return abriopuertaventana;
	}

	public void setAbriopuertaventana(boolean abriopuertaventana) {
		this.abriopuertaventana = abriopuertaventana;
	}

	public boolean isDetectamovimiento() {
		return detectamovimiento;
	}

	public void setDetectamovimiento(boolean detectamovimiento) {
		this.detectamovimiento = detectamovimiento;
	}

public boolean   comprobar () {

		if ((this.abriopuertaventana == true) || (this.detectamovimiento==true)|| (this.rompiovidrio==true)) {
			return true;
		}
		else return false;
	}

public void ActivarAlarma() {
	if (this.comprobar()) {
		timbre.HacerSonar();
		System.out.println("se activo la alarma sonora ");
	}
	else System.out.println(" no se detecto movimientos o roturas dentro de la casa");
}

public void setTimbre(Timbre t) {
	timbre=t;
}

}

