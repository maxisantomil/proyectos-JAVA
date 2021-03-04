
public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean flagvisto;
	private int calificacion;
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isFlagvisto() {
		return flagvisto;
	}

	public void setFlagvisto(boolean flagvisto) {
		this.flagvisto = flagvisto;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Episodio(String t,String des) {
		titulo = t;
		descripcion = des;
		flagvisto=false;
		calificacion= -1;
	}
	
	public void  agregarCalificacion( int cali) {
		int calificacionminima = 1;
		int calificacionmaxima = 5;
		if ((cali >= calificacionminima)&& (cali<=calificacionmaxima)) {
			calificacion= cali;
			flagvisto=true;
		}
		else 
			System.out.println("la calificacion ingresada no es valida , ingrese un numero del 1 al 5");
	}
}
