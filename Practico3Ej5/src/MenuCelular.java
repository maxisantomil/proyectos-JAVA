import java.time.LocalDate;
import java.util.Date;

public class MenuCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c1= new Contacto("maxi", "santomil",LocalDate.of(1990, 4, 27),249437058 ,35172571, "belgrano 1040","maxisantomil90@gmail.com");
		Contacto c2= new Contacto("john", "smiht",LocalDate.of(2000, 01, 05),24944444 ,4085265, "madrid 1444","johnsmith@gmail.com");
		Contacto c3= new Contacto("john", "smiht",LocalDate.of(2000, 01, 05),24944444 ,4085265, "madrid 1444","johnsmith@gmail.com");
		Celular mio= new Celular();
		
		
		mio.agregarConctacto(c1);
		mio.agregarConctacto(c2);
		mio.agregarConctacto(c3);
		System.out.println(mio.cantidadContactos());
		System.out.println(mio.estaRepetido(c2));
		System.out.println(c1.getedad());
		System.out.println(c2.getedad());
		System.out.println(mio.PromedioEdad());
		System.out.println(c1.toString());
		System.out.println("lista de repetidos "+ mio.listarRepetidos());
		mio.mostrarContactos();
	}

}
