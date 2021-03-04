package Ejercicio1FileSistem;

public class Main {

	public static void main(String[] args) {
		Carpeta discoC= new Carpeta("Windows");
		Carpeta documentos= new Carpeta("mis documentos");
		
		Archivo parcial= new Archivo("parcial", 12, "doc");
		Archivo g= new Archivo("docu", 12, "re");
		Link link= new Link("pagina",parcial);
		ArchivoComprimido parcial2= new ArchivoComprimido("parcialComprimido","rar");
		parcial2.agregarElemento(parcial);
		
		Criterio c1= new CriterioContienePalabra("par");
		
		documentos.agregarElemento(parcial);
		documentos.agregarElemento(g);
		discoC.agregarElemento(documentos);
		documentos.agregarElemento(link);
		documentos.agregarElemento(parcial2);
		
		System.out.println(parcial2.contarElementos());
		System.out.println(parcial2.ruta());
		System.out.println(documentos.listaelementosxCriterio(c1));
		
		
	
	}

}
