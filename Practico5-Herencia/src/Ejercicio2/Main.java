package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CasaHowart Sliderin= new CasaHowart("siliderin", 50);
		CasaHowart Grifindor= new CasaExigente("grifindor", 2);
		
		Alumno Potter= new Alumno("Harry","Potter");
		Alumno MadrePotter= new Alumno ("Susan","Potter");
		Alumno PadrePotter= new Alumno ("Peter","Potter");
		MadrePotter.agregarFamiliar(PadrePotter);
		MadrePotter.agregarFamiliar(Potter);
		Grifindor.AgregarAlumno(MadrePotter);
		Potter.agregarFamiliar(PadrePotter);
		Potter.agregarFamiliar(MadrePotter);
		PadrePotter.agregarFamiliar(Potter);
		PadrePotter.agregarFamiliar(MadrePotter);
		Grifindor.AgregarAlumno(Potter);
		Grifindor.AgregarAlumno(PadrePotter);
		System.out.println("la casa exigente: "+ Grifindor.getNombre()+" tiene de Alumnos :" + Grifindor.getAlumnos());
		System.out.println(Potter.getFamiliares());
	}

	
	//acceder a un metodo del hijo .... desde la clase padre ?// no se puede , siempre para abajo
	
	//contains para ver si esta un String en un array sirve sin redefinir el equals??// sirve 
	
	//hacer una clase de booleanos es una buena practica ??// no es tan buena mejor un array de string

	
	
}
