import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Grupo extends ElementGrupo{
	private String nombre;
	ArrayList<ElementGrupo>grupos;
	Criterio criterio;
	
	
	public Grupo (String n, Criterio c) {
		nombre= n;
		grupos= new ArrayList<>();
		criterio=c;
	}
	
	public void agregarHijo(ElementGrupo e) {
		if (!grupos.contains(e)){
			grupos.add(e);
		}
	}

	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public void enviarNotificacion(Mensaje m) {
		if (criterio.cumple(m)) {
			for ( ElementGrupo e : grupos) {
				e.enviarNotificacion(m);
			}
		}
		
	}

	@Override
	public int cantidadEmpleados() {
		int total= 0;
		for (ElementGrupo e : grupos) {
			total+= e.cantidadEmpleados();
		}
		return total;
	}

	@Override
	public int cantidadMensaje() {
		int total=0;
		for (ElementGrupo e: grupos) {
			total+=e.cantidadMensaje();
		}
		return total;
	}

	@Override
	public ArrayList<Empleado> listaEmpleados() {
		ArrayList<Empleado>listaTotal= new ArrayList<>();
		for (ElementGrupo e: grupos) {
			if (!listaTotal.contains(e)) {
				listaTotal.addAll(e.listaEmpleados());
			}
		}
		Collections.sort(listaTotal);
		return listaTotal;
	}

	@Override
	public ArrayList<Empleado> ListaEmpleadosOrdenado(Criterio c, Comparator t) {
		ArrayList<Empleado>listaTotal= new ArrayList<>();
		for (ElementGrupo e: grupos) {
			if (!listaTotal.contains(e)) {
				listaTotal.addAll(e.ListaEmpleadosOrdenado(c, t));
			}
		}
		Collections.sort(listaTotal, t);
		return listaTotal;
	}

	@Override
	public ArrayList<Empleado> ListaEmpleadosCriterio(Criterio c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
