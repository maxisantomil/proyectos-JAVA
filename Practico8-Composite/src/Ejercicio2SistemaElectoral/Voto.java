package Ejercicio2SistemaElectoral;

import java.time.LocalDate;
import java.time.LocalTime;

public class Voto{
	private int dni;
	private Candidato candidato;
	private LocalTime hora;
	
	
	public Voto(int dni) {
		this.dni=dni;
		this.candidato=null;
		hora=  LocalTime.of(00,00);
	}
	
	
	
	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public Candidato getCandidato() {
		return candidato;
	}



	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}



	public LocalTime getHora() {
		return hora;
	}



	public void setHora(LocalTime hora) {
		this.hora = hora;
	}



	public void  votar(Candidato c) {
		this.candidato=c;
		this.hora= LocalTime.now();
		
	}
	
	
}
