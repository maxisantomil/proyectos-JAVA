
public class Atributo {
	private String nombre;
	private Object valor;
	
	public Atributo(String n , Object v) {
		this.nombre=n;
		this.valor=v;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}
	

	public boolean equals(Object o) {
		try {
		Atributo a= (Atributo)o;
		return (this.getNombre().equals(a.getNombre()) && this.getValor().equals(a.getValor()));
		}catch(Exception exc) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Atributo [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	
	
}
