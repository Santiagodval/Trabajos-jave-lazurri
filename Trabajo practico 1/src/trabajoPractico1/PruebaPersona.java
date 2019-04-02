package trabajoPractico1;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona miguel = new Persona();
		
		miguel.setDni(23657123);
		miguel.setEdad(23);
		miguel.setNombre("Miguel");
		
		
		
		Persona carolina = new Persona();
		
		carolina.setDni(24323657);
		carolina.setEdad(17);
		carolina.setNombre("carolina");
		
		System.out.println(miguel.sosMayor());
		System.out.println(carolina.sosMayor());
		System.out.println(miguel.sosMayorQue(carolina.getEdad()));
		System.out.println(carolina.sosMayorQue(miguel.getEdad()));
		
	}

}
