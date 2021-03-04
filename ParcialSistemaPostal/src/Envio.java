import java.util.ArrayList;

public class Envio extends ElementCombo{
	private Persona destinatario;
	private Persona remitente;
	private boolean retiraSucursal;
	private double peso;
	
	
	public Envio(Persona destina, Persona remi, boolean b, double p, int tr) {
		super(tr);
		this.destinatario=destina;
		this.remitente=remi;
		this.retiraSucursal=b;
		this.peso=p;
	}
	
	
	
	public boolean isRetiraSucursal() {
		return retiraSucursal;
	}
	public void setRetiraSucursal(boolean retiraSucursal) {
		this.retiraSucursal = retiraSucursal;
	}
	public Persona getDestinatario() {
		return destinatario;
	}
	public Persona getRemitente() {
		return remitente;
	}
	public double getPeso() {
		return peso;
	}


	protected boolean contieneDireccion(String ciudad) {
		return destinatario.contieneDireccion(ciudad);
	}



	@Override
	public int cantidadEnvios() {
		return 1;
	}



	@Override
	protected boolean contieneRemitente(String remitente) {
		return this.getRemitente().getNombre().equals(remitente);
	}



	@Override
	protected boolean contieneDestinatario(String destinatario) {
		return this.getDestinatario().getNombre().equals(destinatario);
	}



	@Override
	public ArrayList<Envio> listarEnvios(Criterio c) {
		ArrayList<Envio> lista= new ArrayList<>();
		if (c.cumple(this)) {
			lista.add(this);
		}
		return lista;
	}



	@Override
	public String toString() {
		return "Envio [destinatario=" + destinatario + ", remitente=" + remitente + ", retiraSucursal=" + retiraSucursal
				+ ", peso=" + peso + "]";
	}
	
	
	
}
