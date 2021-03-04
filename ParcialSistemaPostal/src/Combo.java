import java.util.ArrayList;

public class Combo extends ElementCombo{

	ArrayList<ElementCombo>envios;
	Criterio criterio;
	public Combo(Criterio cri, int track) {
		super(track);
		envios= new ArrayList<>();
		criterio=cri;
		
	}
	

	
	public void agregarEnvio(ElementCombo e) {
		if (criterio.cumple(e)){
			e.setNroTracking(this.getNroTracking());
			envios.add(e);
		}
	}

	@Override
	public int cantidadEnvios() {
		int suma=0;
		for (ElementCombo e: envios) {
			suma+= e.cantidadEnvios();
		}
		return suma;
	}


	@Override
	protected boolean contieneDireccion(String ciudad) {
	for (ElementCombo e: envios) {
		if (!e.contieneDireccion(ciudad)) {
			return  false;
			}
		else return true;
		}
	return true;
	}


	@Override
	protected boolean contieneRemitente(String remitente) {
		for (ElementCombo e: envios) {
			if (!e.contieneRemitente(remitente)) {
				return  false;
				}
			else return true;
			}
		return true;
		}



	@Override
	public Persona getDestinatario() {
		ElementCombo p= envios.get(0);
		return p.getDestinatario();
	}



	@Override
	public Persona getRemitente() {
		ElementCombo p= envios.get(0);
		return p.getRemitente();
	}



	@Override
	public double getPeso() {
		double suma=0;
	for (ElementCombo e: envios) {
		suma+= e.getPeso();
		}
	return suma;
	}



	@Override
	protected boolean contieneDestinatario(String nombre) {
		for (ElementCombo e: envios) {
			if (!e.contieneDestinatario(nombre)) {
				return  false;
				}
			else return true;
			}
		return true;
		}



	@Override
	public ArrayList<Envio> listarEnvios(Criterio c) {
		ArrayList<Envio> lista= new ArrayList<>();
		for (ElementCombo e: envios ) {
			lista.addAll(e.listarEnvios(c));
		}
		return lista;
	}
}
