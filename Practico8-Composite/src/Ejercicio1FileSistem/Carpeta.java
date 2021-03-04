package Ejercicio1FileSistem;

import java.util.ArrayList;

public class Carpeta extends ElementFileSystem{
	protected ArrayList<ElementFileSystem>directorio;
	
	
	public Carpeta(String nombre) {
		super(nombre);
		this.directorio= new ArrayList<>();
	}
	
	
	public void agregarElemento(ElementFileSystem e) {
		if (!contieneElemento(e)) {
			directorio.add(e);
			e.setPadre(this);
		}
	}

	
	public boolean contieneElemento(ElementFileSystem e) {
		if (this.equals(e)){
			return true;
		}
		for (ElementFileSystem elem: directorio) {
			if (elem.contieneElemento(e)) {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public double getTamanio() {
		double suma=0.0;
		for (ElementFileSystem e:directorio) {
			suma+= e.getTamanio();
		}
		return suma;
	}


	@Override
	public String toString() {
		
		return	this.getNombre()+"/";
		
	}


	@Override
	public int contarArchivo() {
		int suma=0;
		for (ElementFileSystem e:directorio) {
			suma+= e.contarArchivo();
		}
		return suma;
	}


	@Override
	public int contarElementos() {
		int suma=0;
		for (ElementFileSystem e:directorio) {
			suma+= e.contarElementos();
		}
		return suma+1;
	}


	@Override
	public int contarCarpetas() {
		int suma=0;
		for (ElementFileSystem e:directorio) {
			suma+= e.contarCarpetas();
		}
		return suma+1;
	}


	@Override
	public ArrayList<ElementFileSystem> listaelementosxCriterio(Criterio c) {
		ArrayList<ElementFileSystem>listaElem= new ArrayList<>();
		if (c.cumple(this))
			listaElem.add(this);
		
		for (ElementFileSystem e: directorio) {
			listaElem.addAll(e.listaelementosxCriterio(c));
			}
		return listaElem;
	}
	
	
	
}
