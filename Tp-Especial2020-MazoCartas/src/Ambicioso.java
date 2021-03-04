
public class Ambicioso implements Estrategia {

	@Override
	public Atributo retornarAtributoEstrategico(Carta c) {
		return c.atributoDeMayorValor();
	}

}
