package Ejercicio6WorkBreakdownStructure;

import java.time.LocalDate;

public class MainWorkBreak {

	public static void main(String[] args) {
	Tareaterminal t1= new Tareaterminal("VIAJAR", LocalDate.of(2020, 04,27), LocalDate.of(2020,05, 29));
	
	
	Recurso r1= new RecursoExclusivo("maxi");
	Recurso r2= new RecursoExclusivo("jose");
	Recurso rr3= new RecursoCompartido("serrucho");
	Recurso rr4= new RecursoCompartido("impresora");
	Recurso rr5= new RecursoCompartido("martillo");
	RecursoExclusivo r6= new RecursoExclusivo("chota");
	t1.asignarRecurso(rr4);
	Tareacompuesta TareaPrincipal= new Tareacompuesta("pintar la casa");
	Tareaterminal t2= new Tareaterminal("lijar pared",LocalDate.of(2020,1,1),LocalDate.of(2020, 1,5));
	Tareacompuesta Tareasecundaria= new Tareacompuesta("pasear al perro"); 
	
	Tareasecundaria.agregarTarea(t1);
	t2.asignarRecurso(r2);
	t2.asignarRecurso(rr3);
	t2.asignarRecurso(rr4);
	t2.asignarRecurso(r6);
	Tareaterminal t3= new Tareaterminal("pintar cocina",LocalDate.of(2020,1,6),LocalDate.of(2020, 1,8));
	Tareaterminal t4= new Tareaterminal("jugar a la payana",LocalDate.of(2020,1,9),LocalDate.of(2020, 1,13));
	
	t3.asignarRecurso(rr3);
	t3.asignarRecurso(r1);
	t3.asignarRecurso(rr5);
	t3.asignarRecurso(r6);
	
	TareaPrincipal.agregarTarea(Tareasecundaria);
	TareaPrincipal.agregarTarea(t2);
	TareaPrincipal.agregarTarea(t3);
	TareaPrincipal.agregarTarea(t4);
	
	//System.out.println(TareaPrincipal.getFechaInicio());
	
	System.out.println(Tareasecundaria.duracionTarea());
	
	//System.out.println(TareaPrincipal.listatareasRecurso(r6));
	//System.out.println(TareaPrincipal.listadeRecursosInvolucrados());
	System.out.println(TareaPrincipal.getTareas());
	//System.out.println(TareaPrincipal.duracionTarea());
	}

}