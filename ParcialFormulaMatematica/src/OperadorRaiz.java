
public class OperadorRaiz extends Operador {

	public OperadorRaiz() {
		super("Raiz");
	}
	@Override
	public double realizarOperacion(double e1, double e2) {
		// TODO Auto-generated method stub
		return Math.pow(e1, 1/e2);
	}
	@Override
	public double realizarOperacionOpuesta(double e1, double e2) {
		return Math.pow(e1, e2);
	}

}
