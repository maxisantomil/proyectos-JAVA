
public class OperadorDivisor extends Operador {

	public OperadorDivisor() {
		super("/");
	}
	
	@Override
	public double realizarOperacion(double e1, double e2) {
		if (e2>0) {
		return e1/e2;
		} 
		
		{return -23;
		
		}
	}

	@Override
	public double realizarOperacionOpuesta(double e1, double e2) {
		return e1*e2;
	}

}
