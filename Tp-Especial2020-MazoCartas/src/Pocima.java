
public abstract class Pocima {
	
	protected String nombre;
	protected int valor;
	protected Pocima(String s) {
		nombre=s;
	}
	
	
	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double modificarAtributo(Atributo c); 
}
