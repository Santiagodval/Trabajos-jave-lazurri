package trabajoPractico1;

public class Persona {
	
	private int dni;
	private int edad;
	private String nombre;
	
	//source -> generate getters and setters
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean sosMayor() {
		
		return this.edad >= 18;
	}
	
	public boolean sosMayorQue(int edad) {
		
		return this.edad > edad;
	}

}
