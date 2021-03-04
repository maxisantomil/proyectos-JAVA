
public class CriterioContienePalabra implements Criterio {

	private String palabra;
	
	public CriterioContienePalabra(String p) {
		palabra=p;
	}
	@Override
	public boolean cumple(Mensaje m) {
		return m.contienePalabra(palabra);
	}

}
