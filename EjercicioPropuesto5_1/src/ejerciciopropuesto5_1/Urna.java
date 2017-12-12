package ejerciciopropuesto5_1;
    //Clase urna del ejercicio propuesto 5_1.
public class Urna {
    //Esto son los atributos de mi clase Urna.
    protected int bola;
    protected int [] bombo;
    /*Este es el consttructor de mi clase, que lo que hace es generar un bombo
    con x bolas negras y blancas (1) o (0). Cogiendo como argumento del usuario
    el tamaño que quiera para el objeto de clase*/
    public Urna (int tamaño){
        bombo = new int[tamaño];
        for(int i=0 ; i<bombo.length ; i++){
            bombo [i]=(int)(Math.random()*2);
        }
    }
    /*Este metodo lo que hace es ir comparando la primera bola y la ultima y guardando
    a su vez en la posicion [0] un (1) o un (0). Una vez recorrido el array entero 
    y comparado todas las bolas, devuelve lo que hay en la posicion [0] que corresponde 
    a la ultima bola que quedaria en el bombo.*/
    public int vaciarLlenar (){
        for (int i=0 ; i<bombo.length-2 ; i++ ){
            if(bombo[i]==bombo[bombo.length-1]){
                bombo[0]=0;
                System.out.println("Son iguales introducimos una bola Negra");
            }else{
                bombo[0]=1;
                System.out.println("Son diferentes introducimos una bola Blanca");
            }
            
        }
        bola=bombo[0];
        
        return bola;
    }
}
