package Ejercicio3Navidad;

public abstract class ElementNavidad {
	public  String nombre;
	
	
	public void nombreLugar(String nombre) {
		this.nombre=nombre;
	}
	public abstract int cantCartasTotalesRecibidas();
	public abstract int cantCartasRegalo(String regalo);
	public abstract int cantNiniosMalos();
	
	public double porcentajeCartasRegalo(String regalo) {
		return ((double)this.cantCartasRegalo(regalo)/(double)this.cantCartasTotalesRecibidas())*100;
	}

}
