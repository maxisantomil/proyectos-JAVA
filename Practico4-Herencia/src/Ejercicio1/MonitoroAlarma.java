package Ejercicio1;

public class MonitoroAlarma {

	public static void main(String[] args) {
		Alarma a1= new Alarma();
		AlarmaLuminosa a2= new AlarmaLuminosa();
		
		
		Timbre t1= new Timbre("1");
		Luz l1= new Luz("blanca");

		a2.setTimbre(t1);
		a2.setLuz(l1);
		
		a2.setRompiovidrio(true);
		if (a2.isAbriopuertaventana()==true ) {
			a2.ActivarAlarma();
			System.out.println("se abrio una puerta o ventana");
		}
		else {
			if (a2.isDetectamovimiento()==true ) {
				a2.ActivarAlarma();
				System.out.println("hubo movimiento en la casa");
			}
			if (a2.isRompiovidrio()==true ) {
				a2.ActivarAlarma();
				System.out.println("se rompio un vidrio");
			}
		}
	}

}
