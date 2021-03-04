
public class Electrodomestico {
	private String nombre;
	private double precio_base;
	private String color;
	private int consumo_energetico;
	private double peso;
	
	
	public Electrodomestico(String nombre) {
		this.nombre=nombre;
		precio_base= 100;
		color= "gris";
		consumo_energetico= 10;
		peso=2;
	}
	
	public Electrodomestico(String nombre,double precio_base) {
		this.nombre=nombre;
		this.precio_base= precio_base;
		color= "gris";
		consumo_energetico= 10;
		peso=2;
	}
	
	public Electrodomestico(String nombre,String color) {
		this.nombre=nombre;
		precio_base= 100;
		this.color= color;
		consumo_energetico= 10;
		peso=2;
	}
	
	public Electrodomestico(String nombre, double precio_b, String color, int consumo, double peso) {
		this.nombre=nombre;
		precio_base= precio_b;
		this.color= color;
		consumo_energetico= consumo;
		this.peso=peso;
	}
	
	
	public String getnombre() {
		return nombre;
	}
	
	public double getprecio_base() {
		return precio_base;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(int consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public boolean esbajo_consumo() {
		int bajo_consumo= 45;
		if (consumo_energetico < bajo_consumo) {
			return true;
		}
		else return false;
	}
	
	public double calcular_balance() {
		return precio_base / peso;
	}
	
	public boolean es_alta_gama (){
		int i= 3;
		if (calcular_balance () > i){
			return true;
		}
		else return false;
	}

	@Override
	public String toString() {
		return "Electrodomestico [nombre=" + nombre + ", precio_base=" + precio_base + ", color=" + color
				+ ", consumo_energetico=" + consumo_energetico + ", peso=" + peso + "]";
	}
	
	
}
