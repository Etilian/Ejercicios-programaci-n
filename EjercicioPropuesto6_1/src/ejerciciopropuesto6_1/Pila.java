package ejerciciopropuesto6_1;

public class Pila {
	//Atributos
	private Lista pila;
	//Constructor
	public Pila (){
		pila=new Lista();
	}
	//Metodos
	public Object Pop (){
		return pila.extraePrimero();
	}
	
	public void Push (Object ob){
		pila.ponPrimero(ob);
	}
	
	public String Vacia(){
		return pila.estaVacia();
	}
	
	public void Cima(){
		if(pila.estaVacia()=="Vacia"){
			System.out.println("Pila vacia");
		}
		else {
			Object x=pila.extraePrimero();
			System.out.println(x);
			pila.ponPrimero(x);
		}
	}
}
