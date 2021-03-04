
public class PocimaSelectiva extends Pocima {
	String atributo;

			public PocimaSelectiva(String s,String atr,int porc ) {
					super(s);
					atributo=atr;
					this.setValor(porc);
				}
			
			
				
		public String getAtributo() {
				return atributo;
			}


			public void setAtributo(String atributo) {
				this.atributo = atributo;
			}


		@Override
		public double modificarAtributo(Atributo c) {
			if(c.getNombre().equals(atributo)) {
				return c.getValor()*(this.getValor()/100)+c.getValor();
			};
			return c.getValor();
		}

	}
