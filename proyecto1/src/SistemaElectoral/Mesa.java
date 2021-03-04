package SistemaElectoral;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.time.LocalDateTime;
public class Mesa extends ElementSE{
	Set<ElementSE>padron;
	Set<ElementSE>votantes;


	public Mesa(Set<ElementSE>padron){
		this.padron= padron;
		votantes= new HashSet<>();
		}
	
	public void addPadron(ElementSE e) {
		padron.add(e);
	}
	
	public boolean seEncuentra(Voto v) {
		return padron.contains(v);
	}
	
	public void registrarvoto(Voto v) {
		if (this.seEncuentra(v)){
			votantes.add(v);
		}
		
	}
	
	public int contarVoto() {
		int suma=0;
		for (ElementSE e:votantes) {
			suma+=e.contarVoto();
		}
		return suma;
	}
	public String getCandidato() {
		String cand=null;
		for (ElementSE e:votantes) {
			cand=e.getCandidato();
		}
		return cand;
	}
	
	public ArrayList <ElementSE> VotosCandidatoX(CriterioCandidato c){
		ArrayList<ElementSE> votos=new ArrayList<>();
		for (ElementSE e:votantes) {
			if (c.Cumple(e)) {
				votos.add(e);
			}
		}
		return votos;
	}
	
	public ArrayList <ElementSE> VotosEnHoraXX(CriterioHora h){
		ArrayList<ElementSE> votos=new ArrayList<>();
		for (ElementSE e:votantes) {
			if (h.Cumple(e)) {
				votos.add(e);
			}
		}
		return votos;
	}
	public double PorcentajeVotosCandidatoX(ArrayList v) {
		double suma=0;
		double totalvotos=0;
		suma=v.size();
		totalvotos=votantes.size();
		return (suma/totalvotos)*100;
	}
	
	public LocalDateTime getFecha() {
		LocalDateTime cand=null;
		for (ElementSE e:votantes) {
			cand=e.getFecha();
		}
		return cand;
	}
	
	
}
