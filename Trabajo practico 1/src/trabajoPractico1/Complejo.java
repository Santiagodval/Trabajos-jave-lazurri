package trabajoPractico1;

public class Complejo {
	
	private double real;
	private double imaginario;
	
	//setters and getters ---------------------------------
	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	//-----------------------------------------------------
		
	//metodos multiplicadores-----------------------------
	private double alterMulti(double T1, double T2, double S1, double S2) {
		
		return T1 * T2 + S1 * S2;
		
	}
	
	public void producto(Complejo multiplicador) {
		double auxReal=alterMulti(this.real , multiplicador.real , this.imaginario , multiplicador.imaginario);;
		double auxImaginario= alterMulti(this.real , multiplicador.imaginario , this.imaginario , this.real);
		this.real =auxReal; 
		this.imaginario =auxImaginario;
		
	}
	
	public void producto(double multiplicador) {
		
		this.real *= multiplicador;
		this.imaginario *= multiplicador;
		
	}
	
	//----------------------------------------------------
	
	//metodos de sumas y restas---------------------------
	
	public void suma(Complejo sumador) {
		
		this.real += sumador.real;
		this.imaginario += sumador.imaginario;
		
	}
	
	public void resta(Complejo restador) {
		
		this.real -=  restador.real;
		this.imaginario -= restador.imaginario;
		
	}
	
	//----------------------------------------------------
	
	//métodos sin parámetro-------------------------------
	public void conjugado() {
		
		
			
			this.imaginario *= -1; 
		
		
	}
	
	public double modulo() {
		
		return Math.sqrt(this.real*this.real +this.imaginario*this.imaginario);
		
	}
	//----------------------------------------------------
	
	//Métodos divisores-----------------------------------
	
	public void division(Complejo z) {
		
		double abajo;
		Complejo aux=new Complejo();
		aux.setReal(z.getReal());
		aux.setImaginario(z.getImaginario());
		z.conjugado();
		Complejo arriba=new Complejo();
		arriba.setReal(this.getReal());
		arriba.
		abajo = this.modulo()*this.modulo();
		
		this.real = alterMulti(this.real , z.real , this.imaginario , z.imaginario) / abajo;
		this.imaginario = alterMulti(this.real , multiplicador.imaginario , this.imaginario , this.real) / abajo;
	}
	
	//---------------------------------------------------

}












