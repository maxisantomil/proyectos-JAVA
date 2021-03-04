package Ejercicio1Contrato;

public class CriterioEmpresa extends Criterio{
	String empresa;
	public CriterioEmpresa(String e) {
		empresa=e;
	}
	
	@Override
	public boolean acepta(Contrato c) {
		if (c.getEmpresa().equals(empresa)){
			return false;
		}
		return true;
	}
	
	
}
