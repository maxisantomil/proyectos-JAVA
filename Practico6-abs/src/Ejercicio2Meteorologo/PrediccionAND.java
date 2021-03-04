package Ejercicio2Meteorologo;

import java.util.ArrayList;

public class PrediccionAND extends Criterio {
	Criterio c1;
	Criterio c2;
	
	public PrediccionAND(Criterio cc1,Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	@Override
	
	public boolean predicelluvia() {
		return (c1.predicelluvia() && c2.predicelluvia());
	}

}
