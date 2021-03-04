package tp2.fabrica;

public class Mueble {
	
	private String nombre;
	private double peso;
	private double costo;
	private String tipo;
	private String color;
	private int stock;
	private double porcentaje;
	
	
	public Mueble(String nombre, double peso, double costo, String tipo, String color, double porcentaje) {
		this.nombre = nombre;
		this.peso = peso;
		this.costo = costo;
		this.tipo = tipo;
		this.color = color;
		this.stock = 0;
		this.porcentaje = porcentaje;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public void fabricar(int cantidad) {
		this.stock += cantidad;
	}
	
	public void vender(int cantidad) {
		this.stock -= cantidad;
	}
	
	public double getValorVenta() {
		return this.getCosto() * this.getPorcentaje(); // Asumimos que el porcentaje viene en forma 1.xx
	}
	
	public int getStock() {
		return stock;
	}
	
	public double getCostoStock() {
		return this.getStock() * this.getCosto();
	}
	
	public double getPrecioVentaStock() {
		return this.getStock() * this.getValorVenta();
	}

}
