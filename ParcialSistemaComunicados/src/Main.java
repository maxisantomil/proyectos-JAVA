import java.time.LocalDate;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Empleado e1= new Empleado("maxi", "santomil", 22,30);
		Empleado e2= new Empleado("jor", "pinchentti", 23,28);
		Empleado e3= new Empleado("raquel", "delgado", 24,69);
		Empleado e4= new Empleado("nesti", "santomil", 25,69);
		Criterio criterio1= new CriterioContienePalabra("familia");
		Grupo familia= new Grupo("familia",criterio1 );
		Comparator comparatorEdad= new ComparatorEdad();
		familia.agregarHijo(e1);
		familia.agregarHijo(e2);
		familia.agregarHijo(e3);
		familia.agregarHijo(e4);
		Mensaje m1= new Mensaje("familia como andan?", LocalDate.now(),e1);
		Mensaje m2= new Mensaje("enviame el ejercicio", LocalDate.now(),e2);
		System.out.println(familia.cantidadEmpleados());
		System.out.println(familia.cantidadMensaje());
		familia.enviarNotificacion(m1);
		e3.enviarNotificacion(m2);
		System.out.println(familia.cantidadMensaje());
		System.out.println(e3.cantidadMensaje());
		System.out.println(familia.listaEmpleados());
		
		System.out.println(familia.ListaEmpleadosOrdenado(criterio1,comparatorEdad));
		
	}

}
