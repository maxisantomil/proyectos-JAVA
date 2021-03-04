import java.util.ArrayList;

public class SeguroSimple extends ElementSeguros{
	private double precio;
	ArrayList<Atributo>atributos;
	
	
	public SeguroSimple(String nombre, double precio) {
		super(nombre);
		this.precio=precio;
		atributos= new ArrayList<>();
	}
	
	public void agregarAtributos(Atributo g) {
		if (!atributos.contains(g)) {
			atributos.add(g);
		}
	}


	@Override
	public String toString() {
		return "SeguroSimple [nombre=" + this.getNombre() + ", atributos=" + atributos + "]";
	}

	@Override
	public ArrayList<SeguroSimple> ListaSegurosCriterio(Criterio c) {
		ArrayList<SeguroSimple>lista= new ArrayList<>();
			if (c.cumple(this)) {
					lista.add(this);
			}
		return lista;
	}
	
	public boolean tieneCaracteristica(Atributo a) {
		return atributos.contains(a);
	}

	@Override
	public double getPrecio() {
	return this.precio;
	}

	
	
	
	
}
