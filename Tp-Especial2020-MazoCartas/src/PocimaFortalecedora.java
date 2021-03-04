
public class PocimaFortalecedora extends Pocima {

	public PocimaFortalecedora(int porc,String s) {
		super(s);
		this.setValor(porc);
	}
	


	@Override
	public double modificarAtributo(Atributo atr) {
		return (atr.getValor()*this.getValor())/100+ atr.getValor();
		}

}
