
public class PocimaCocktail extends Pocima {
		Pocima p1;
		Pocima p2;
			public PocimaCocktail(String s,Pocima pp1, Pocima pp2) {
				super(s);
				p1=pp1;
				p2=pp2;
			}

			@Override
			public double modificarAtributo(Atributo c) {
				double valor=p1.modificarAtributo(c);
				Atributo copia=c.getCopia();
				copia.setValor((int)valor);
				double valorFinal=p2.modificarAtributo(copia);
				return valorFinal;
				
				
			}

		}
