package ejerciciopropuesto6_1;

public class Caracter {
	//Atributos
	private char caracter;
	//Constructor
	public Caracter(char caracter) {
		this.caracter=caracter;
	}
	//Metodos estaticos
	public static int ordinal(char c) {
		return ((int) c);
	}
	
	public static char ascii(int i) {
		return ((char) i);
	}
}
