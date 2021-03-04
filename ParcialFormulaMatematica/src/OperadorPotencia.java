
public class OperadorPotencia extends Operador {

	
	public OperadorPotencia() {
		super("POT");
	}
	
	@Override
	public double realizarOperacion(double e1, double e2) {
		return Math.pow(e1, e2);
	}

	@Override
	public double realizarOperacionOpuesta(double e1, double e2) {
		return Math.pow(e1, 1/e2);
	}

}
