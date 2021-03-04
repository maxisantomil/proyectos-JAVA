
public class Obstinado implements Estrategia {
	String nombreAtributo;
	
	public Obstinado(String nombre) {
		nombreAtributo=nombre;
	}

	@Override
	public Atributo retornarAtributoEstrategico(Carta c) {
		return c.getAtributoCarta(nombreAtributo);
	}

}
