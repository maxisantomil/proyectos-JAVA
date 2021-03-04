
public class PocimaRetornaValorEspecifico extends Pocima {
	public PocimaRetornaValorEspecifico(int valor,String s) {
		super(s);
		this.setValor(valor);
	}
	


	@Override
	public double modificarAtributo(Atributo c) {
		return this.getValor();
	}

}
