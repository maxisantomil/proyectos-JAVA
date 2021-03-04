package Ejercicio3CooperativaAgricola;

public class Pastura extends Cereal{
	int supRequerida;
	
	
	public Pastura(String n,int sup) {
		super(n);
		supRequerida=sup;
	}
	
	
	public int getSupRequerida() {
		return supRequerida;
	}


	public void setSupRequerida(int supRequerida) {
		this.supRequerida = supRequerida;
	}


	public boolean esaptoParaLote(Lote l) {
		if (super.esaptoParaLote(l) && l.getSuperficie()>this.getSupRequerida()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return super.toString()+ " superficie requerida : " + this.getSupRequerida();
	}
}
