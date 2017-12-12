package ejerciciopropuesto6_1;

public class Cadena {
	//Atributos
	private String cadena;
	//Constructor
	public Cadena(String cadena) {
		this.cadena=cadena;
	}
	//Metododo
	public void invierteCadena() {
		String cadena2="";
		for(int i=cadena.length()-1 ; i>=0 ; i--){
			cadena2=cadena2+cadena.charAt(i);
		}
		cadena=cadena2;
	}
	
	public void encriptaCadena() {
		String cadena2="";
		int oculto;
		char c;
		for(int i=0 ; i<cadena.length() ; i++) {
			c=cadena.charAt(i);
			oculto=(Caracter.ordinal(c)+7);
			cadena2=cadena2 + Caracter.ascii(oculto);
		}
		cadena=cadena2;
	}
	
	public void desencriptaCadena() {
		String cadena2="";
		int oculto;
		char c;
		for(int i=0 ; i<cadena.length() ; i++) {
			c=cadena.charAt(i);
			oculto=(Caracter.ordinal(c)-7);
			cadena2=cadena2 + Caracter.ascii(oculto);
		}
		cadena=cadena2;
	}
	
	public void visualizaCadena() {
		System.out.println(cadena);
	}
}
