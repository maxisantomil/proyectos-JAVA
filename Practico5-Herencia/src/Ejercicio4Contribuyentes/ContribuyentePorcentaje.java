package Ejercicio4Contribuyentes;

public class ContribuyentePorcentaje extends Contribuyente{
	private double montoVentas;
	private double  porcentMonto=0.0;
	private double porcentVentas=0.0;
	public ContribuyentePorcentaje(String n,int cod, double mont, double venta, double pmonto, double pven) {
		super(n,cod,mont);
		montoVentas=venta;
		porcentMonto=pmonto;
		porcentVentas=pven;
	}
	

	public double getMontoVentas() {
		return montoVentas;
	}


	public void setMontoVentas(double montoVentas) {
		this.montoVentas = montoVentas;
	}


	public double getMonto() {
		return ((super.getMonto()*porcentMonto) + (montoVentas*porcentVentas));
	}
}
