import java.util.ArrayList;

public class Celular {
	
ArrayList<Contacto>Contactos;

	public Celular() {
		Contactos= new ArrayList<>();
	}
	
	
	public void agregarConctacto(Contacto c) {
		Contactos.add(c);
	}
	
	public int cantidadContactos() {
		return Contactos.size();
	}
	
	public boolean estaRepetido(Contacto c) {
			if (Contactos.contains(c)) {
				return true;
			}
			else
		return false;
		
	}
	
	public ArrayList<Contacto> listarRepetidos(){
		ArrayList<Contacto> repetidos = new ArrayList<>();
		for (int index=0; index < this.Contactos.size();index++) {
			Contacto contacto1= Contactos.get(index);
			for (int index2= index+1; index2 < this.Contactos.size();index2++) {
				Contacto contacto2= Contactos.get(index2);
				if (contacto1.equals(contacto2)){
					repetidos.add(contacto1);
			}
			
			}
			
		}
		return repetidos;
	}
	
	public double PromedioEdad() {
		double prom=0;
		for (Contacto c: Contactos) {
			prom +=c.getedad();
		}
		
		return prom/Contactos.size();
	}
	public void mostrarContactos() {
		for (Contacto c :Contactos) {
			System.out.println(c.toString());
		}
	}
}
