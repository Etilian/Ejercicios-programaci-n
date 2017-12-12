package ejerciciopropuesto6_1;

public class Cola {
	//Atributos
	private Lista cola;
	//Constructor
	public Cola () {
		cola=new Lista();
	}
	//Metodos
	public Object extraeDeCola(){
		return cola.extraePrimero();
	}
	
	public void ponEnCola(Object ob){
		cola.ponUltimo(ob);
	}
	
	public String Vacia(){
		return cola.estaVacia();
	}
	
	public void Frente(){
		if(cola.estaVacia()=="Vacia"){
			System.out.println("Pila vacia");
		}
		else {
			Object x=cola.extraeUltimo();
			System.out.println(x);
			cola.ponUltimo(x);
		}
	}
}
