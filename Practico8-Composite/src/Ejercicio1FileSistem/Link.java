package Ejercicio1FileSistem;

import java.util.ArrayList;

public class Link extends ElementFileSystem {
	private ElementFileSystem aloqueapunta;
	
	
	
	public Link(String nombre,ElementFileSystem e) {
		super(nombre);
		this.aloqueapunta=e;
	}

	
	@Override
	public double getTamanio() {
		return 1;
	}

	@Override
	public boolean contieneElemento(ElementFileSystem e) {
		return this.equals(e);
	}

	public String toString () {
		return this.getNombre();
	}


	@Override
	public int contarArchivo() {
		// TODO Auto-generated method stub
		return 1;
	}


	@Override
	public int contarElementos() {
		return 1;
	}


	@Override
	public int contarCarpetas() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ArrayList<ElementFileSystem> listaelementosxCriterio(Criterio c) {
		ArrayList<ElementFileSystem> listaElementos= new ArrayList<>();
		if (c.cumple(this)) {
			listaElementos.add(this);
		}
		return listaElementos;
	}

}
