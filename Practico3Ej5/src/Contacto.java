import java.time.LocalDate;
import java.util.Date;

public class Contacto {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private int tel;
	private int dni;
	private String direccion;
	private String email;
	
	
	public Contacto(String n,String a,LocalDate fecha,int t,int dni,String di,String mail) {
		nombre=n;
		apellido=a;
		fechaNac=fecha;
		tel=t;
		this.dni=dni;
		direccion=di;
		email=mail;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	@Override
	public boolean equals(Object o) {
		
		try {
			Contacto cc= ((Contacto)o);
			if ((cc.getNombre()==nombre)&&(cc.getApellido()==apellido)&&(cc.getDni()== this.dni)&&(cc.getTel()==tel)) {
				return true;
			}
			else 
				return false;	
		} catch(Exception ex) {
			return false;
		}
	}
	
	public int getedad() {
		LocalDate hoy= LocalDate.now();
		return hoy.compareTo(this.getFechaNac());
	}
	
	public String toString() {
		return "nombre: "+ this.getNombre() + " apellido: "+ this.getApellido() + " telefono: "+ tel + " edad: "+ this.getedad();
	}
	
	
}

