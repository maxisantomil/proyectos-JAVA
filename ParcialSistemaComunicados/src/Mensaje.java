import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Mensaje {

	private ArrayList<String>palabras;
	private LocalDate fecha;
	private Empleado persona;
	
	
	public Mensaje(String texto,LocalDate f,Empleado p) {
		this.palabras = new ArrayList<>();
		agregarPalabra(texto);
		fecha=f;
		persona=p;
		
	}
	

	private void agregarPalabra(String p1) {
		this.palabras.add(p1);
		
	}

	public boolean contienePalabra(String palabra) {
		for (String p: palabras) {
			if (p.contains(p)) {
				return true;
			}
		}
		return false;
	}


	@Override
	public String toString() {
		return "Mensaje [palabras=" + palabras + ", fecha=" + fecha + ", persona=" + persona.getNombre() + "]";
	}
	
	
	
	
	
	
}
