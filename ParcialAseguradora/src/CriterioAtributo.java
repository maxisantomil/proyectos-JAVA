
public class CriterioAtributo implements Criterio {

	Atributo atributo;
	
	public CriterioAtributo(Atributo a) {
		atributo=a;
	}
	
	@Override
	public boolean cumple(SeguroSimple s) {
		return s.tieneCaracteristica(atributo);
	}

}
