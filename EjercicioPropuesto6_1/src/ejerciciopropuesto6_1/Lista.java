package ejerciciopropuesto6_1;
import java.util.*;
public class Lista {
	//Atributo
    private Vector vacia;
	//Constructor
    public Lista (){
        vacia=new Vector();
    }
    //Metodos
    public void ponPrimero(Object ob){
        vacia.insertElementAt(ob, 0);
    }
    
    public void ponUltimo(Object ob){
        vacia.addElement(ob);
    }
    
    public String estaVacia(){
		String comprobar;
        if (vacia.isEmpty()==false){
			comprobar="Llena";
		}else 
			comprobar="Vacia";
		return comprobar;
    }
    
    public Object extraePrimero(){
        return vacia.remove(0);
    }
    
    public Object extraeUltimo(){
        return vacia.remove(vacia.size()-1);
    }
    
    public void visualizaElementos (){
        for (int i = 0 ; i < vacia.size() ; i++){
            System.out.println(vacia.elementAt(i));
        }
    }
}
