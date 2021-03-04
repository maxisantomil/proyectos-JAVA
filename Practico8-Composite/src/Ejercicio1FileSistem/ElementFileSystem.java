package Ejercicio1FileSistem;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementFileSystem {
	protected String nombre;
	protected LocalDate fechaCreacion;
	protected LocalDate fechaModificacion;
	protected Carpeta padre;
	
	
	public ElementFileSystem(String nombre) {
		this.nombre=nombre;
		fechaCreacion= LocalDate.now();
		fechaModificacion= LocalDate.now();
		padre=null;
	}


	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}


	public void setFechaModificacion() {
		this.fechaModificacion = LocalDate.now();
	}


	public String getNombre() {
		return nombre;
	}


	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public abstract double getTamanio();
	
	public abstract boolean contieneElemento(ElementFileSystem e);
	
	public boolean equals(Object o1) {
		try {
		ElementFileSystem elem= (ElementFileSystem)o1;
		if (this.getNombre().equals(elem.getNombre())){
			return (this.getTamanio()== elem.getTamanio()); 
			}
		}catch(Exception exc) {
			return false;
		}
		return false;
	}
	
	
	
	
	public Carpeta getPadre() {
		return padre;
	}


	public void setPadre(Carpeta padre) {
		this.padre = padre;
	}

	

	public String ruta () {
		if (tienePadre()) 
		return this.getPadre().ruta()+ this.toString();
		else return this.toString();
	}
	

	private boolean tienePadre() {
		return this.padre!=null;
	}
	
	public abstract int contarArchivo(); 
	public abstract int contarElementos();
	public abstract int contarCarpetas();
	
	
	public abstract ArrayList<ElementFileSystem> listaelementosxCriterio(Criterio c);
	
}