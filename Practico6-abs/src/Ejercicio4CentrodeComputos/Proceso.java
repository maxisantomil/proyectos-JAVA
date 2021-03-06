package Ejercicio4CentrodeComputos;

public class Proceso extends ElementoOrdenable{
	private int memoriaRequerida;
	private int cpuRequerido;
	private String ejecutable;
	
	
	public Proceso(int memoria, int cpuR, String eje) {
		memoriaRequerida=memoria;
		cpuRequerido=cpuR;
		ejecutable=eje;
	}
	
		public int getMemoriaRequerida() {
			return memoriaRequerida;
		}

		public void setMemoriaRequerida(int memoriaRequerida) {
			this.memoriaRequerida = memoriaRequerida;
		}

		@Override
		public boolean esmenor(Object nuevo) {
			Proceso aux= (Proceso)nuevo;
			if (this.getMemoriaRequerida() <  aux.getMemoriaRequerida())
				return true;
			else return false;
			}

		@Override
		public String toString() {
			return "Proceso [memoriaRequerida=" + memoriaRequerida + ", cpuRequerido=" + cpuRequerido + ", ejecutable="
					+ ejecutable + "]";
		}
		
		public String ejecutar() {
			return "se ejecuta proceso";
		}
		
	}

