
public class Main {

	public static void main(String[] args) {
		Direccion d1= new Direccion("Tandil", "belgrano", 1040);
		Persona p1= new Persona("maxi",d1);
		Direccion d2= new Direccion("Mar del Plata", "Av Juan B justo", 566);
		Persona p2= new Persona("jose", d2);
		Direccion d3= new Direccion("Tandil", "maipu ", 1190);
		Persona p3= new Persona("raquel", d3);
		Direccion d4= new Direccion("Mar del Plata", "Constitucion",327);
		Persona p4= new Persona("jorgelina", d4);
		Envio e1= new Envio(p1, p2, true, 8, 1);
		Envio e2= new Envio(p3, p4, false, 9, 2);
		Envio e3= new Envio(p1, p3, true, 2, 3);
		Envio e4= new Envio(p1, p3, true, 2, 3);
			
		Criterio c1= new CriterioCiudad("Tandil");
		Criterio c2= new CriterioRemitente("maxi");
		Combo comboEmpresarial= new Combo(c2, 55);
		Combo comboPostal= new Combo(c1,66);
		comboEmpresarial.agregarEnvio(e2);
		comboEmpresarial.agregarEnvio(e4);
		comboEmpresarial.agregarEnvio(e3);
		Criterio c3 = new CriterioPesoMayorA(5);
		comboPostal.agregarEnvio(e1);
		comboPostal.agregarEnvio(e3);
		comboPostal.agregarEnvio(e2);
		System.out.println(comboEmpresarial.listarEnvios(c1));
		System.out.println(comboEmpresarial.cantidadEnvios());
		System.out.println(e1.getNroTracking());
		System.out.println(e2.getNroTracking());
		System.out.println(e3.getNroTracking());
	}

}
