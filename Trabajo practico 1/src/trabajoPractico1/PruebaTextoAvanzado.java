package trabajoPractico1;

public class PruebaTextoAvanzado {

	public static void main(String[] args) {

		TextoAvanzado txt = new TextoAvanzado();
		
		txt.setTexto("ANismanLoMataron");
		
		System.out.println(txt.cantidadApariciones('a'));
		
		System.out.println(txt.esPalindroma());
		
		System.out.println(txt.vocales());
		
	}

}
