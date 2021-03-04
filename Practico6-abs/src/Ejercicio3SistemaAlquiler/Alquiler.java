package Ejercicio3SistemaAlquiler;

import java.time.LocalDate;

public class Alquiler {
	private Item itemalquilado;
	private LocalDate fechaVencimiento;
	private Cliente cliente;
	
	
	public Alquiler(Cliente c,Item i, LocalDate fech) {
		itemalquilado=i;
		fechaVencimiento=fech;
		cliente=c;
	}
	
	public Item getItemalquilado() {
		return itemalquilado;
	}
	public void setItemalquilado(Item itemalquilado) {
		this.itemalquilado = itemalquilado;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public boolean alquilerVencido() {
		LocalDate hoy= LocalDate.now();
		if ((this.getFechaVencimiento().compareTo(hoy)>=0)){
		return false;
		}else 
			return true;
	}

	@Override
	public String toString() {
		return "Alquiler [itemalquilado=" + itemalquilado + ", fechaVencimiento=" + fechaVencimiento + ", cliente="
				+ cliente + "]";
	}
	
	
}
