package Ejercicio5;

import java.time.LocalDate;

public class ProductoComun {
	private LocalDate fechavencimiento;
	private int ndelote;
	private LocalDate fechaEnvasado;
	private String granjaOrigen;
	
	
	public ProductoComun(LocalDate fecha, int n,LocalDate fechav, String granja) {
		fechavencimiento=fecha;
		ndelote=n;
		fechaEnvasado=fechav;
		granjaOrigen=granja;
	}


	public LocalDate getFechavencimiento() {
		return fechavencimiento;
	}


	public void setFechavencimiento(LocalDate fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}


	public int getNdelote() {
		return ndelote;
	}


	public void setNdelote(int ndelote) {
		this.ndelote = ndelote;
	}
	
	public String getInformacion() {
		return "fecha de vencimiento:"+ this.getFechavencimiento()+ " nro de lote: "+ this.getNdelote();
	}
	
}
