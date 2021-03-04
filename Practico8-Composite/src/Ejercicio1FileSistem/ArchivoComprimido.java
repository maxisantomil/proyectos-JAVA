package Ejercicio1FileSistem;

import java.util.ArrayList;

public class ArchivoComprimido extends Carpeta {
	private final static int TASACOMPRESION = 30;
	private String extension;
	
	public ArchivoComprimido(String nombre, String ex) {
		super(nombre);
		this.extension=ex;
	}
	
	
	public double getTamanio() {
		return super.getTamanio()/TASACOMPRESION;
	}
	
	
	@Override
	public int contarElementos() {
		return 1;
	}

	public int contarArchivo() {
		return 1;
	}
	public int contarCarpetas() {
		return 0;
	}


	@Override
	public String toString() {
		return this.getNombre()+ "."+this.extension;
	}
	
	public ArrayList<ElementFileSystem> listaelementosxCriterio(Criterio c) {
		ArrayList<ElementFileSystem> listaElementos= new ArrayList<>();
			if (super.listaelementosxCriterio(c).size()>0){
				listaElementos.add(this);
			}
		return listaElementos;
	}
	
}
