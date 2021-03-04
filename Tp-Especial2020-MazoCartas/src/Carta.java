
import java.util.ArrayList;
public class Carta {
	
	private String personaje;
	   private ArrayList<Atributo>atributos;
	   private Pocima pocima;
	   
	   		public Carta(String perso) {
	   			personaje=perso;
	   			atributos=new ArrayList<>();
	   			pocima=null;
	   		}
	   		
	   		public void addAtributo(Atributo atr) {
	   			if(!atributos.contains(atr))
	   			atributos.add(atr);
	   		}
	   		public int getValorAtributoAComparar(String atributo){
	   			int valor=0;
	   			for(Atributo a: atributos) {
	   				if(a.getNombre().equals(atributo)) {
	   					return a.getValor();
	   				}
	   			}
	   			return valor;
	   		}
	   		public double comparaCarta(Carta cartaC,String s) {
	   			double valor1=0;
	   			double valor2=0;
	   			for(Atributo a:atributos) {
	   				if(a.getNombre().equals(s)) {
	   					if(this.pocima!=null) {
	   						valor1=(this.getValorAtributoconPocion(a, this.getPocima()));
	   						if (cartaC.getPocima()!=null){
	   							valor2= cartaC.getValorAtributoconPocion(cartaC.getAtributoCarta(a.getNombre()), cartaC.getPocima());
	   							return valor1-valor2;
	   						}
	   						else {
	   							return valor1 - (cartaC.getValorAtributoAComparar(a.getNombre()));
	   							}
	   						}
	   					else {
	   						  if (cartaC.getPocima()!=null) {
	   								return a.getValor()- cartaC.getValorAtributoconPocion(cartaC.getAtributoCarta(a.getNombre()), cartaC.getPocima());
	   								}
	   					}
	   					return a.getValor()- (cartaC.getValorAtributoAComparar(a.getNombre()));
	   				}
	   			}
	   			return 0;
	   		}
	   		
	   		public String tengoPocima() {
	   			return "se aplico pocima";
	   		}
	   						
	   		public Pocima getPocima() {
				return pocima;
			}

			public void setPocima(Pocima pocima) {
				this.pocima = pocima;
			}

			public Atributo getAtributoCarta(String nombreAtributo) {
				Atributo aux=null;
				for(Atributo a: atributos) {
					if(a.getNombre().equals(nombreAtributo)) {
						return a;
					}
				}
				return aux;
			}
	   	   
			
			public double getValorAtributoconPocion(Atributo a, Pocima p) {
				if(pocima!=null) {
					return p.modificarAtributo(a);
				}		
				else return a.getValor();
	   	    }
			
	  
	   		public boolean comparaAtributos(Carta c){
	   	        ArrayList <Atributo> lista= c.getAtributos();
	   	     if (lista.size()== atributos.size()) {
	   	        for (Atributo a:atributos){
	   	            for (int i=0;i< lista.size();i++){
	   	                if (a.equals(lista.get(i))){
	   	                    return true;
	   	                }
	   	                else {
	   	                    i=lista.size();
	   	                    return false;
	   	                	}
	   	            	}

	   	        	}
	   	        }
	   	        return false;
	   	    }
	   		
	   		@Override
			public String toString() {
				return  "\n"+personaje +" "+ atributos+"\n";
			}
			public boolean equals(Object o) {
	   			try{
	   				Carta carta=(Carta)o;
	   				return this.personaje.equals(carta.getPersonaje());
	   			}catch(Exception exc) {
	   				return false;
	   			}
	   		}
	   		public Atributo atributoEstrategico(Estrategia e) {
	   			return e.retornarAtributoEstrategico(this);
	   		}

			public String getPersonaje() {
				return personaje;
			}

			private void setPersonaje(String personaje) {
				this.personaje = personaje;
			}

			public ArrayList<Atributo> getAtributos() {
				return new ArrayList<Atributo>(this.atributos);
			}

			public Atributo atributoDeMayorValor() {
				Atributo atr=null;
				int mayor=0;
				for(Atributo a:atributos) {
					int valor=a.getValor();
					if(mayor<valor) {
						mayor=valor;
						atr=a;
					}
				}
				return atr;
			}
	   
	   
	}