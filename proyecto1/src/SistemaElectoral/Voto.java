package SistemaElectoral;
import java.time.LocalDateTime;
public class Voto extends ElementSE{
	Candidato Candidato;
	private int dni;
	LocalDateTime fecha;
	
	
	public String getCandidato() {
		return Candidato.getNombre();
	}
	public void setCandidato(Candidato candidato) {
		Candidato = candidato;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Voto (int d){
		this.dni=d;
		Candidato=null;
	}
	public int contarVoto() {
		return 1;
	}

	public int getdni(){
		return dni;
	}
	
	
	public void votar(Candidato candidato) {
		this.Candidato=candidato;
		this.fecha=LocalDateTime.now();
	}
	
	
	public boolean equals(Object o) {
		Voto v=(Voto) o;
		if ((this.getdni())== v.getdni()) {
			return true;
		}
		else return false;
	}
	
	
}
