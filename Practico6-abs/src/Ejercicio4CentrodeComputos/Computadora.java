package Ejercicio4CentrodeComputos;

public class Computadora extends ElementoOrdenable{
	private String modelo;
	private int ram;
	private int velocidadCpu;
	
	
	public Computadora(String modelo, int ram, int velocidadCpu){
		this.modelo=modelo;
		this.ram=ram;
		this.velocidadCpu=velocidadCpu;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getVelocidadCpu() {
		return velocidadCpu;
	}
	public void setVelocidadCpu(int velocidadCpu) {
		this.velocidadCpu = velocidadCpu;
	}

	@Override
	public boolean esmenor(Object nuevo) {
		Computadora aux= (Computadora)nuevo;
		if (this.getVelocidadCpu() < aux.getVelocidadCpu())
			return true;
		else return false; 	
	}
	
	public String ejecuta_proceso(Proceso p) {
		return p.ejecutar();
	}

	@Override
	public String toString() {
		return "Computadora [modelo=" + modelo + ", ram=" + ram + ", velocidadCpu=" + velocidadCpu + "]";
	}
	
	
}
