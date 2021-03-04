package practico2Ej4;

public class episodio {
	String titulo;
	String descripcion;
	Boolean visto;
	int calificacion;
	final static int min_calif=1;
	final static int max_calif=5;

	public episodio (String tit,String desc) {//constructor//
		titulo=tit;
		descripcion=desc;
		visto=false;
		calificacion=-1;
	}

	public void setcalificacion(int calif){
		if ((calif>min_calif) &&(calif<=max_calif)){
			calificacion=calif;
			setVisto(true);// 
		}

	}

	public int getCalificacion(){
		return calificacion;
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

	public Boolean getVisto() {
		return visto;
	}

	public void setVisto(Boolean visto) {
		this.visto = visto;
	}






















}