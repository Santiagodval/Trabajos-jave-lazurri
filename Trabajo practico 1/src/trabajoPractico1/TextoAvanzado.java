package trabajoPractico1;

public class TextoAvanzado {
	
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	public int cantidadApariciones(char caracter) {
		
		int r = 0;
		
		for(int i = 0; i < this.texto.length() -1; i++) {
			
			if(this.texto.charAt(i) == caracter) {
				
				r++;
				
			}
			
		}
		
		return r;
		
	}

	public boolean esPalindroma() {
		
		for(int i = 0; i < this.texto.length() - 1; i++) {
			
			if(this.texto.charAt(i) != this.texto.charAt(this.texto.length() - 1 - i))
			{
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public String vocales() {
		
		String vocales = "aeiouAEIOU";
		String retorno = "";
		
		for(int i = 0; i < this.texto.length(); i++) {
			
			if(vocales.indexOf(this.texto.charAt(i)) != -1)
				retorno += this.texto.charAt(i);
			
		}
		
		return retorno;
		
	}
	
}
