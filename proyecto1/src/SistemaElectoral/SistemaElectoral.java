package SistemaElectoral;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class SistemaElectoral {

	public static void main(String[] args) {
		Set<ElementSE>padron=new HashSet<>();
		Set<ElementSE> padron2=new HashSet<>();
		Set<ElementSE> tandil=new HashSet<>();
		Candidato can1= new Candidato("Alberto","FP","bb");
		Candidato can2= new Candidato ("Macri","pro","dd");
		Candidato can3= new Candidato("Espert","uu","ww");
		Candidato can4= new Candidato("Blanco","","");
		
		Voto votante1= new Voto(30258251);
		Voto votante2= new Voto(30259982);
		Voto votante3= new Voto(85258251);
		Voto votante4= new Voto(25258251);
		Voto votante5= new Voto(17258251);
		Voto votante6= new Voto(30258251);
		Voto votante7= new Voto(2258251);
		Voto votante8= new Voto(123456);
		Voto votante9= new Voto(564656);
		

		padron.add(votante1);
		padron.add(votante2);
		padron.add(votante3);
		padron.add(votante4);
		padron.add(votante5);
		padron.add(votante6);
		padron.add(votante7);
		padron.add(votante8);
		padron2.add(votante9);
		
		votante1.votar(can1);
		votante2.votar(can1);
		votante3.votar(can1);
		votante4.votar(can1);
		votante5.votar(can4);
		votante6.votar(can4);
		votante7.votar(can4);
		votante8.votar(can4);
		
		//Mesa tandil= new Mesa();
		Mesa escuela= new Mesa(padron);
		//escuela.addPadron(padron2);
		
		

		
		escuela.registrarvoto(votante1);
		escuela.registrarvoto(votante2);
		escuela.registrarvoto(votante3);
		escuela.registrarvoto(votante4);
		escuela.registrarvoto(votante5);
		escuela.registrarvoto(votante6);
		escuela.registrarvoto(votante7);
		escuela.registrarvoto(votante8);
		escuela.registrarvoto(votante9);
		
		int cantvotos=escuela.contarVoto();
		System.out.println(escuela.getFecha());
		System.out.println(cantvotos);
		System.out.println("el votante: "+ votante1.getDni()+" voto a : "+ votante1.getCandidato());
		CriterioHora filtroPorHora = new CriterioHora(LocalDateTime.parse("2019-10-29T16:00:17.386776"),LocalDateTime.parse("2019-10-29T16:50:17.386776"));
		ArrayList<ElementSE>votosenHora=new ArrayList<>(escuela.VotosEnHoraXX(filtroPorHora));
		System.out.println(votosenHora);
		CriterioCandidato filtroCandidato= new CriterioCandidato ("Alberto");
		CriterioCandidato filtroCandidato2= new CriterioCandidato ("Blanco");
		ArrayList<ElementSE>votosCandY=new ArrayList<>(escuela.VotosCandidatoX(filtroCandidato2));
		ArrayList<ElementSE>votosCandX=new ArrayList<>(escuela.VotosCandidatoX(filtroCandidato));
		System.out.println(escuela.PorcentajeVotosCandidatoX(votosCandX)+"%");
		System.out.println(escuela.PorcentajeVotosCandidatoX(votosCandY)+"%");
	} 
		
}
