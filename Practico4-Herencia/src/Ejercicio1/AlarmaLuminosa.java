package Ejercicio1;

public class AlarmaLuminosa extends Alarma{
	Luz luz;
	
	public AlarmaLuminosa() {
		super();
		luz = new Luz("predeterminada");
	}

	public void ActivarAlarma() {
		super.ActivarAlarma();
		luz.encenderLuz();
		System.out.println("se activo y encendio la alarma luminosa");
	}
	
	
	public void setLuz(Luz l) {
		luz= l;
	}
}
