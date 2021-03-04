package Ejercicio2;

public class AlarmaLuminosa extends Alarma{
	Luz luz;
	
	public AlarmaLuminosa() {
		super();
		luz = new Luz("predeterminada");
	}

	
	public void ActivarAlarma() {
		super.ActivarAlarma();
		luz.encenderLuz();
		System.out.println("alarma luminosa activa");
	}
	
	
	public void setLuz(Luz l) {
		luz= l;
	}
}
