import java.util.ArrayList;

public abstract class ElementCombo {

	protected int nroTracking;
	protected abstract boolean contieneDireccion(String ciudad);
	protected abstract boolean contieneRemitente(String remitente);
	protected abstract boolean contieneDestinatario(String nombre);
	
	public ElementCombo(int tra) {
		this.nroTracking=tra;
	}



	public int getNroTracking() {
		return nroTracking;
	}



	public void setNroTracking(int nroTracking) {
		this.nroTracking = nroTracking;
	}
	
	
	public abstract int cantidadEnvios();
	
	public abstract Persona getDestinatario();
	public abstract Persona getRemitente();
	public abstract double getPeso();
	
	public abstract ArrayList<Envio>listarEnvios(Criterio c);
	
	
}
