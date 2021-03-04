package Ejercicio4CentrodeComputos;

import java.util.ArrayList;

public class CentroComputos {

		
		ColaOrdenada colaordenadaProcesos = new ColaOrdenada();
		ColaOrdenada colaordenadaCpu = new ColaOrdenada();
			
		
		
		public void agregarProcesos(ElementoOrdenable proc) {
			colaordenadaProcesos.agregarElemento(proc);
		}
		public void agregarComputadora(ElementoOrdenable cpu) {
			colaordenadaCpu.agregarElemento(cpu);
		}
		
		public void ejecutarProcesos() {
		while (colaordenadaCpu.elementos.size()>0) {
				Computadora c1= (Computadora)colaordenadaCpu.siguiente();
			if  (colaordenadaProcesos.elementos.size()>0) {
					Proceso p1= (Proceso)colaordenadaProcesos.siguiente();
					c1.ejecuta_proceso(p1);
				}
			}
		
		}
		@Override
		public String toString() {
			return "CentroComputos [colaordenadaProcesos=" + colaordenadaProcesos + ", colaordenadaCpu="
					+ colaordenadaCpu + "]";
		}
		
		
	}
