import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;


public class Mazo {
	final static int PRIMER_LUGAR=0;
	private ArrayList<Carta>mazo;
	
		public Mazo() {
			this.mazo=new ArrayList<>();
		}
		
		public void agregarMazo(String mazoNuevo) {
			 File jsonInputFile = new File(mazoNuevo);
		        InputStream is;
		        try {
		            is = new FileInputStream(jsonInputFile);
		            // Creo el objeto JsonReader de Json.
		            JsonReader reader = Json.createReader(is);
		            // Obtenemos el JsonObject a partir del JsonReader.
		            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
		            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
		                String nombreCarta = carta.getString("nombre");
		                Carta cart=new Carta(nombreCarta);
		                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
		                for (String nombreAtributo:atributos.keySet()) {
		                	int valor= atributos.getInt(nombreAtributo);
		                	Atributo atr=new Atributo(nombreAtributo,valor);
		                	cart.addAtributo(atr);	
		                	}
		                this.agregarCartasalMazo(cart);
		                }
		}catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		}

		public boolean correspondealmazo(Carta c){
		    if (c.comparaAtributos(mazo.get(PRIMER_LUGAR))){
		        return true;
		    }
		    return false;
		}
		@Override
		public String toString() {
			return " " + mazo + " ";
		}

		public void agregarCartasalMazo (Carta c){
		    if (mazo.size()==0) {
		        mazo.add(c);
		    }else{
		        if (!mazo.contains(c) && correspondealmazo(c)){
		                mazo.add(c);
		        }
		    }
		}
		public boolean esImpar() {
			int cantidadCartas=dameCantidaddeCartas();
			if(cantidadCartas%2!=0) {
				return true;
			}
			 return false;
		}
		
		public void agregarCarta(Carta c) {
			if(!mazo.contains(c)) {
				mazo.add(c);
			}
		}
		
		public void mezclar() {
			Collections.shuffle(mazo);
			}
		public Carta dameCartasinRemover() {
   			return mazo.get(PRIMER_LUGAR);
   		}
		
		public Carta getCarta(){
				return mazo.remove(PRIMER_LUGAR);
				
		}

		public ArrayList<Carta> dameMazo() {
			return new ArrayList<>(this.mazo);
		}
		public int dameCantidaddeCartas() {
			return mazo.size();
		}
		
		public Atributo elegirCaracteristica(Estrategia e) {
			return this.dameCartasinRemover().atributoEstrategico(e);
		}
		
}
