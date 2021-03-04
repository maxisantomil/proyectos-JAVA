package Ejercicio7busquedaDocumentos;

import java.util.ArrayList;

public class SistemaDigitalizador {
	
	private ArrayList<Documento>documentos;
	
	
	public SistemaDigitalizador() {
		documentos= new ArrayList<>();
	}
	
	
	public void agregarDocumento(Documento d1) {
		if (!documentos.contains(d1)){
			documentos.add(d1);
		}
	}
	
	
	
	public ArrayList<Documento> buscador(Criterio c){
		ArrayList<Documento> aux= new ArrayList<>();
		for (Documento doc:documentos) {
			if (c.cumpleCriterio(doc)){
				aux.add(doc);
			}
		}
		return aux;
	}
}
