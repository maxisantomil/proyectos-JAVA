
public class mainProyectoEspecial {

	public static void main(String[] args) {
		String mazoPath = "src/Json/superheroes.json";
		Mazo mazo=new Mazo();
		mazo.agregarMazo(mazoPath);
		
		Estrategia Timbero= new Timbero();
		Estrategia Ambicioso= new Ambicioso();
		Estrategia ObstinadoVelocidad= new Obstinado("velocidad"); //el jugador debe seleccionar atributo del respectivo mazo
		Estrategia ObstinadoPeso= new Obstinado("peso");
		
	
		Jugador j1= new Jugador("Maximilian el romano",Timbero);
		Jugador j2=new Jugador("Jos� el padre de Jes�s",ObstinadoPeso);
		
		Pocima p1=new PocimaFortalecedora(50,"Fortalecedora");
		Pocima p2=new PocimaReductora(40,"Reductora");
		Pocima p3=new PocimaSelectiva("SelectivaVelocidad", "velocidad", 100);
		Pocima p4=new PocimaCocktail("Cocktail",p1,p2);
		Pocima p5= new PocimaRetornaValorEspecifico(4, "Quiero vale 4");
		Pocima p6= new PocimaCocktail("CocktailSupremo", p1, p4);
		Pocima p7=new PocimaFortalecedora(50,"Fortalecedora");
		Pocima p8=new PocimaReductora(40,"Reductora");
		Pocima p9=new PocimaSelectiva("SelectivaVelocidad", "velocidad", 100);
		
		
		Juego Historietas= new Juego("Historieta", mazo, j1, j2,200,true);
			Historietas.addPocima(p1);
			Historietas.addPocima(p2);
			Historietas.addPocima(p3);
			Historietas.addPocima(p7);
			Historietas.addPocima(p8);
			Historietas.addPocima(p9);
			Historietas.addPocima(p5);
			Historietas.addPocima(p4);
			Historietas.addPocima(p6);
			
		 //System.out.println(j1);
		 //System.out.println(j2);
		 //System.out.println(mazo);
		 //System.out.println(j1.elegirAtributo());
		 Historietas.jugar();
		 
		 
		
		

	}

}