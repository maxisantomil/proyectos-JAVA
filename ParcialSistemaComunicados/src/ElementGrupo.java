import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementGrupo {

	
	public abstract void enviarNotificacion(Mensaje m);
	public abstract int cantidadEmpleados();
	public abstract int cantidadMensaje();
	public abstract ArrayList<Empleado>listaEmpleados();
	public abstract ArrayList<Empleado>ListaEmpleadosOrdenado(Criterio c , Comparator t);
	public abstract ArrayList<Empleado>ListaEmpleadosCriterio(Criterio c);
	
}
