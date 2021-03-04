
public class PuntoGeometrico {
	private double coordenadax;
	private double coordenaday;
	
	
	public PuntoGeometrico() {
		coordenadax=0;
		coordenaday=0;
	}
	
	public PuntoGeometrico(double x, double y) {
		coordenadax=x;
		coordenaday=y;
	}
	
	public double getCoordenadax() {
		return coordenadax;
	}


	public void setCoordenadax(double coordenadax) {
		this.coordenadax = coordenadax;
	}


	public double getCoordenaday() {
		return coordenaday;
	}


	public void setCoordenaday(double coordenaday) {
		this.coordenaday = coordenaday;
	}


	public void desplazarpunto(double x, double y) {
		coordenadax = coordenadax + x;
		coordenaday = coordenaday + y;
	}
	
	public double calculaEuclidea(PuntoGeometrico p2) {
		double d=0;
		double calculo1= coordenadax - p2.coordenadax;
		double calculo2= coordenaday - p2.coordenaday;
		d= Math.pow(calculo1, 2) + Math.pow(calculo2, 2);
		return Math.sqrt(d);
	}
	
	
}
