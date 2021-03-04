
public class CriterioDensidad implements Criterio {

	private double densi;
	
	public CriterioDensidad(double d) {
		densi=d;
	}
	
	@Override
	public boolean cumple(Comarca c) {
		return c.densidadPoblacion()> densi;
	}

}
