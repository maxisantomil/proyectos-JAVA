
public class Timbero implements Estrategia {

	@Override
	public Atributo retornarAtributoEstrategico(Carta c) {
		int atributo= (int)(Math.random()*c.getAtributos().size()-1)+1;
			return c.getAtributos().get(atributo);
	}

}
