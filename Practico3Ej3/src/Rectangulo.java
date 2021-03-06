
public class Rectangulo {
  PuntoGeometrico vertice1;
  PuntoGeometrico vertice2;
  PuntoGeometrico vertice3;
  PuntoGeometrico vertice4;
  double largo=0;
  double ancho=0;
   
  public Rectangulo(PuntoGeometrico a, double largo, double ancho) {
	  vertice1= a;
	  vertice2= new PuntoGeometrico(0,0);
	  vertice3= new PuntoGeometrico(0,0);
	  vertice4= new PuntoGeometrico(0,0);
	  this.largo = largo;
	  this.ancho = ancho; 
  }
  
  public void estructurarRectangulo() {
	 vertice2.setCoordenadax(vertice1.getCoordenadax());
	 vertice2.setCoordenaday(this.ancho + vertice1.getCoordenaday());
	 vertice3.setCoordenadax(this.largo + vertice1.getCoordenadax());
	 vertice3.setCoordenaday(vertice2.getCoordenaday());
	 vertice4.setCoordenadax(vertice3.getCoordenadax());
	 vertice4.setCoordenaday(vertice1.getCoordenaday());
	  
  }
  
  public void desplazar_rectangulo(double valorx, double valory) {
	vertice1.desplazarpunto(valorx, valory);
	vertice2.desplazarpunto(valorx, valory);
	vertice3.desplazarpunto(valorx, valory);
	vertice4.desplazarpunto(valorx, valory);
  }
  
  public double calcular_area() {
	  return largo*ancho;
  }
  
  public double esmayor(Rectangulo r) {
	  if (this.calcular_area() > r.calcular_area()){
		  return 1;
	  }
	  else 
	  	if (this.calcular_area() == r.calcular_area()) {
	  		return 0;
	  	}
	  	else return -1;
  }
  
  public boolean es_cuadrado() {
	  if (this.ancho == this.largo) {
		  return true;
	  }
	  else return false;
  }
  
  public double largo_superior() {
	  return vertice2.calculaEuclidea(vertice3);
  }
  
  public String posicion () {
	  if (ancho > largo){
		  return "esta parado";
	  }
	  else return "esta acostado";
  }
  
}

