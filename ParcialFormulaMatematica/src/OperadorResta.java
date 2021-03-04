
public class OperadorResta extends Operador {

	public OperadorResta() {
		super("-");
	}
	@Override
	public double realizarOperacion(double e1, double e2) {
		return e1-e2;
	}
	@Override
	public double realizarOperacionOpuesta(double e1, double e2) {
		return e1+e2;
	}

}
