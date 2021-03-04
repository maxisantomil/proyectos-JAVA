
public class OperadorSuma extends Operador {

	public OperadorSuma() {
		super("+");
	}

	@Override
	public double realizarOperacion(double e1,double  e2) {
		return e1+e2;
	}
	
	
	public double realizarOperacionOpuesta(double e1,double  e2) {
			
		return e1-e2;
	}
	
}
