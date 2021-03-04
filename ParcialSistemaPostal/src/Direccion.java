
public class Direccion {
	private String nombreCiudad;
	private String calle;
	private int numero;
	
	
	
	public Direccion(String n, String calle, int num) {
		this.nombreCiudad=n;
		this.calle=calle;
		this.numero=num;
	}
	
	
	
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}



	public boolean contieneCiudad(String ciudad) {
		return this.getNombreCiudad().equals(ciudad);
	}



	@Override
	public String toString() {
		return "Direccion [nombreCiudad=" + nombreCiudad + ", calle=" + calle + ", numero=" + numero + "]";
	}
	
	
	
}
