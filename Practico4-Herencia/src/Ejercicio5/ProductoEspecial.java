package Ejercicio5;

import java.time.LocalDate;

public class ProductoEspecial extends ProductoComun{

	private int codOrgSup;
	private int tempRecomendada;
	
	public ProductoEspecial (LocalDate fv,int lote, LocalDate fe,String granja, int cod, int temp) {
		super(fv,lote,fe,granja);
		codOrgSup=cod;
		tempRecomendada=temp;
	}

	public int getCodOrgSup() {
		return codOrgSup;
	}

	public void setCodOrgSup(int codOrgSup) {
		this.codOrgSup = codOrgSup;
	}

	public int getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(int tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}
	
	public String getInformacion() {
		return super.getInformacion()+" informacion del producto refrigerado: "+ " codigo: "+ this.getCodOrgSup()+ " temperatura: " + this.getTempRecomendada();
	}
	
	
}
