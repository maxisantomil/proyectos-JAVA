package Ejercicio1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palabra a1= new Palabra("zola", "palabra que significa");
		Palabra a2= new Palabra("aola", "palabra que significa");
		Palabra a3= new Palabra("cila", "palabra que significa");
		Palabra a4= new Palabra("bula", "palabra que significa");
		Palabra a5= new Palabra("gila", "palabra que significa");
		Palabra a6= new Palabra("dela", "palabra que significa");
		Palabra a8= new Palabra("dela", "palabra que significa");
		Palabra a7= new Palabra("dela","palabra que no significa");
		
		a1.agregarSinonimo("hola");
		a1.agregarSinonimo("cola");
		a1.agregarSinonimo("bola");
		a1.agregarSinonimo("asi si");
		a1.agregarAntonimo("yyy");
		a1.agregarAntonimo("jjj");
		a1.agregarAntonimo("rrrr");
		a1.agregarAntonimo("bbb");
		a1.agregarAntonimo("eee");



		
		
		
		
		Diccionario espaniol= new Diccionario();
		
		espaniol.agregarPalabra(a1);
		espaniol.agregarPalabra(a2);
		espaniol.agregarPalabra(a3);
		espaniol.agregarPalabra(a4);
		espaniol.agregarPalabra(a5);
		espaniol.agregarPalabra(a6);
		espaniol.agregarPalabra(a8);
		espaniol.modificar_palabra(a7);
		//espaniol.eliminar_palabra(a4);
		
		//System.out.println(espaniol.mostrarDiccionario());
		System.out.println(espaniol.mostrarPalabras_entre(a2, a5));
		System.out.println("los antonimos de la palabra: "+ a1.getNombre_palabra()+ " son: "+ espaniol.mostrar_antonimos_de(a1));
	}
	

}