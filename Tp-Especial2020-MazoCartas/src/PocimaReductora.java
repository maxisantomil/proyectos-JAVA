
public class PocimaReductora extends Pocima {
	public PocimaReductora(int porc,String s) {
		super(s);
		this.setValor(porc);
	}




	@Override
	public double modificarAtributo(Atributo c) {
		return c.getValor()-(c.getValor()*this.getValor()/100);
	}

}
