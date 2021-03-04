package Ejercicio1Contrato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidato cand1= new Candidato("maxi","santomil","hh",20000);
		Candidato cand2= new Candidato("pepe","sanz","rr",15000);
		Candidato cand3= new Candidato("jesy","mm","technisis",80000);
		Candidato cand4= new Candidato("homer","tt","suma",25000);
		Candidato cand5= new Candidato("flor","g","centro",35000);
		Candidato cand6= new Candidato("ema","nune","uala",75000);
		Candidato cand7= new Candidato("ww","cc","link",95000);
		
		Criterio criterioHora= new CriterioHora(10);
		Criterio criterioEmpresa= new CriterioEmpresa("technisis");
		Criterio criterioExclusivo= new CriterioExclusivo();
		Criterio criterioSueldo= new CriterioSueldo(20000);
		
		cand1.setCriterioAceptacion(criterioSueldo);
		cand2.setCriterioAceptacion(criterioEmpresa);
		cand3.setCriterioAceptacion(criterioExclusivo);
		cand4.setCriterioAceptacion(criterioHora);
		Criterio criterioSueldo2= new CriterioSueldo(35000);
		cand5.setCriterioAceptacion(criterioSueldo2);
		
		
		Contrato c1= new Contrato("uu", 25000, 8);
		Contrato c2= new Contrato("technisis", 40000, 10);
		Contrato c3= new Contrato("ee", 100000, 10);
		Contrato c4= new Contrato("xx", 15000, 8);
		
		Consultora Primera= new Consultora("primera");
		Primera.agregarCandidatos(cand1);
		Primera.agregarCandidatos(cand2);
		Primera.agregarCandidatos(cand3);
		Primera.agregarCandidatos(cand4);
		Primera.agregarCandidatos(cand5);
	
		System.out.println(Primera.potencialesCandidatos(c1));
		System.out.println(Primera.potencialesCandidatos(c2));
		System.out.println(Primera.potencialesCandidatos(c3));
		System.out.println(Primera.potencialesCandidatos(c4));
		
		
	}

}
