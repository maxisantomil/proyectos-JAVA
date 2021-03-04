package Ejercicio2Meteorologo;

import java.util.ArrayList;

public class Sensor {
	private String nombre;
	private ArrayList<Double>registros;
	
	private double suma;
	
	public Sensor(String nombre) {
		this.nombre=nombre;
		registros=new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Double> getRegistros(){
		return (ArrayList<Double>)registros.clone();
	}
	
	public void agregarRegistro(Double r) {
		registros.add(r);
	}
	
	
	private int iniciodelrecorrido(int cant) {
		if (cant< registros.size()) {
			return registros.size()- cant;
		}
		else return 0;
	}
	
	public double promedioXcantRegistros(int cant) {
		int inicio= iniciodelrecorrido(cant);
		double promedio=0.0;
		
		for (int i= inicio; i< registros.size(); i++) {
			promedio+=registros.get(i).doubleValue();
		}
		return promedio/cant;
	}
	
	public double ultimoRegistro() {
		return registros.get(registros.size()).doubleValue();
	}
	
	public double valorMaximoNRegistros(int cant) {
		double valor=0.0;    //conviene tener variables aca o directamente en la clase arriba.
		double compara=0.0;
		int inicio=iniciodelrecorrido(cant);
		
		for (int i=inicio;i<registros.size();i++) {
			valor=registros.get(i);
			if (valor>compara) {
				compara=valor;
			}
		}
		return compara;
	}
	
	public double sumaderegistros() {
		for (double d:registros) {
			suma+=d;
		}
		return suma;
	}
	
}
