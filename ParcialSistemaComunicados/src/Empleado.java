import java.util.ArrayList;
import java.util.Comparator;

public class Empleado extends ElementGrupo implements Comparable<Empleado>{
	private String nombre;
	private String apellido;
	private int nro_legajo;
	private int edad;
	private ArrayList<Mensaje>notificaciones;
	
	
	public Empleado(String nomb, String ape, int nro, int edad) {
		nombre=nomb;
		apellido=ape;
		nro_legajo= nro;
		this.edad=edad;
		notificaciones= new ArrayList<>();
	}

	

	public int getEdad() {
		return edad;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getNro_legajo() {
		return nro_legajo;
	}


	public void setNro_legajo(int nro_legajo) {
		this.nro_legajo = nro_legajo;
	}
	
	public void addMensaje(Mensaje m) {
		notificaciones.add(m);
	}
	
	public void enviarNotificacion(Mensaje m) {
		if (!notificaciones.contains(m)) {
			addMensaje(m);
		}
	}


	@Override
	public int cantidadEmpleados() {
		return 1;
	}


	@Override
	public int cantidadMensaje() {
		return notificaciones.size(); 
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", nro_legajo=" + nro_legajo
				+ ", notificaciones=" + notificaciones + "]";
	}


	@Override
	public int compareTo(Empleado o) {
		return this.cantidadMensaje()-o.cantidadMensaje();
	}


	@Override
	public ArrayList<Empleado> listaEmpleados() {
		ArrayList<Empleado>lista= new ArrayList<>();
		lista.add(this);
		return lista;
	}



	@Override
	public ArrayList<Empleado> ListaEmpleadosOrdenado(Criterio c, Comparator t) {
		ArrayList<Empleado> lista= new ArrayList<>();
		for (Mensaje m:notificaciones) {
			if (c.cumple(m)) {
				lista.add(this);
				return lista;
			}
		}
		return lista;
	}



	@Override
	public ArrayList<Empleado> ListaEmpleadosCriterio(Criterio c) {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	
	
	
	}
	
	

