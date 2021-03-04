
public abstract class Operador {

	protected String simbolo;
	
	
	public Operador(String simbolo) {
		this.simbolo=simbolo;
	}
	
	
	public String getSimbolo() {
		return simbolo;
	}


	public abstract double realizarOperacion(double e1, double e2);
	public abstract double realizarOperacionOpuesta(double e1,double  e2);


	@Override
	public String toString() {
		return  simbolo;  
	}
	
	
	
}
