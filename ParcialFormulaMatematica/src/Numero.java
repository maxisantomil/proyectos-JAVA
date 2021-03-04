import java.util.ArrayList;

public class Numero  extends ElementMatematico{
	double valor;
	
	public Numero(double v) {
		this.valor=v;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return " " + this.getValor() + "";
	}

	@Override
	public double getOpuesto() {
		return valor;
	}

	
	public ArrayList<Double> listarNumeros() {
		ArrayList<Double>lista= new ArrayList<>();
		lista.add(this.getValor());
		
		return lista;
	}

	@Override
	public ArrayList<String> operadores() {
	return new ArrayList<String>();
	}
	
	
	
	
}
