package Ejercicio1Pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColeccionPila Suprema= new ColeccionPila();
		String t1="Primera" ;
		String t2="Segunda" ;
		int t3=3;
		boolean t4=true;
		Suprema.addObjeto(t1);
		Suprema.addObjeto(t2);
		Suprema.addObjeto(t3);
		Suprema.addObjeto(t4);
		
		
		System.out.println(Suprema.cantElementos());
		System.out.println(Suprema.copiarPila());
		System.out.println(Suprema.InversadePila());
	}
	

}
