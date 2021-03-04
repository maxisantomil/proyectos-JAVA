
public class CriterioCantHabitantesMayorA implements Criterio {

	private int cant;
	
	public CriterioCantHabitantesMayorA(int c) {
		cant=c;
	}
	
	@Override
	public boolean cumple(Comarca c) {
		return c.cantHabitantes()>cant;
	}

}
