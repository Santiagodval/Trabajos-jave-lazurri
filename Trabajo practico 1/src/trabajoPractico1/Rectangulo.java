package trabajoPractico1;

public class Rectangulo {
	
	private double Y1;
	private double Y2;
	private double X1;
	private double X2;
	
	
	public double getY1() {
		return Y1;
	}
	public void setY1(double y1) {
		Y1 = y1;
	}
	public double getY2() {
		return Y2;
	}
	public void setY2(double y2) {
		Y2 = y2;
	}
	public double getX1() {
		return X1;
	}
	public void setX1(double x1) {
		X1 = x1;
	}
	public double getX2() {
		return X2;
	}
	public void setX2(double x2) {
		X2 = x2;
	}
	
	public Rectangulo(){
		
		X1 = -1;
		Y1 = 1;
		X2 = 1;
		Y2 = -1;
	}
	
	public Rectangulo(double ancho, double alto){
		
		this.X1 = 1;
		this.Y1 = 1;
		this.X2 = 1 + ancho;
		this.Y2 = 1 + alto;
	}
	
	public Rectangulo(double X1, double Y1, double X2, double Y2){
		
		this.X1 = X1;
		this.Y1 = Y1;
		this.X2 = X2;
		this.Y2 = Y2;
	}
	
	public double alto() {
		
		return Math.abs(Y1-Y2);
		
	}
	
	public double ancho() {
		
		return Math.abs(X1-X2);
	}
	
	public double area() {
		
		return this.ancho() * this.alto();
	}
	
	/*
	 * no se si left, right, top y bottom se refiere a la medida del lado o a un método para mover la posición
	 * del rectángulo en la tabla, así que voy a hacer lo primero porque no pide ningun parámetro de distancia
	 * así que tengo que suponer eso, alta paja hacer lo otro tmbn aunque sea lo que tiene más sentido de hacer
	 * porque lo primero es simplemente llamar a alto y ancho como boludo y listo
	*/
	public double left() {
		
		return this.alto();		
	}
	public double right() {
		
		return this.alto();		
	}
	public double top() {
		
		return this.ancho();		
	}
	public double bottom() {
		
		return this.ancho();		
	}
	
	public double perimetro() {
		
		return this.ancho() * 2 + this.alto() * 2;
	}
	
}






