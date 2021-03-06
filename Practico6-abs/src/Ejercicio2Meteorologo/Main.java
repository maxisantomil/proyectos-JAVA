package Ejercicio2Meteorologo;

public class Main {

	public static void main(String[] args) {
	
		Sensor lluviasTandil= new Sensor("lluvias de Tandil");
		lluviasTandil.agregarRegistro(110.0);
		lluviasTandil.agregarRegistro(24.0);
		lluviasTandil.agregarRegistro(0.0);
		lluviasTandil.agregarRegistro(80.0);
		
		Sensor temperaturasTandil= new Sensor("Temperaturas de Tandil");
		temperaturasTandil.agregarRegistro(12.0);
		temperaturasTandil.agregarRegistro(8.0);
		temperaturasTandil.agregarRegistro(20.0);
		temperaturasTandil.agregarRegistro(23.0);
		
		Criterio criterioTandil= new PrediccionMaxTemperatura(temperaturasTandil, 3, 15);
		Criterio criterioTandil2= new PrediccionPrecipitaciones(lluviasTandil, 4, 60);
		Criterio criterioTandilAnd= new PrediccionAND(criterioTandil, criterioTandil2);
		
		EstacionMeteorologica Tandil= new EstacionMeteorologica("Estacion Tandil",lluviasTandil, null, temperaturasTandil, null,criterioTandilAnd );
		
		System.out.println("va a llover en la proxima hora segun la prediccion de la " + Tandil.toString()+ ": "+   Tandil.valloverenproxhora());
	}

}
