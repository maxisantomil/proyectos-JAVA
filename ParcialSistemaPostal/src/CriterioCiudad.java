
public class CriterioCiudad implements Criterio {

	private String ciudad;
	
	public CriterioCiudad(String c) {
		ciudad=c;
	}
	
	@Override
	public boolean cumple(ElementCombo e) {
		return e.contieneDireccion(ciudad);
	}

}
