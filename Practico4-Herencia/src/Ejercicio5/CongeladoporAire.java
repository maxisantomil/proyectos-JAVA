package Ejercicio5;

import java.time.LocalDate;

public class CongeladoporAire extends ProductoEspecial{
	private final int nitrogeno=15;
	private final int oxigeno=30;
	private final int dioxido=25;
	private final int vapor=30;
	
	public CongeladoporAire(LocalDate fv,int lote, LocalDate fe,String granja, int cod, int temp) {
		super(fv,lote,fe,granja,cod,temp);
	}
		
	public String getInformacion() {
		return super.getInformacion()+ getTipoCongelamiento();
	}
	public String getTipoCongelamiento() {
		return " composicion del aire con que fue congelada: "+"nitrogeno %:"+this.nitrogeno +" oxigeno %:"+this.oxigeno +" dioxido %"+this.dioxido+ " vapor %:"+this.vapor ;
	};
}
