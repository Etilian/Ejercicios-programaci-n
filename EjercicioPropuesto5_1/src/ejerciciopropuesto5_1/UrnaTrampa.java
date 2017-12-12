package ejerciciopropuesto5_1;
    /*Esta calse 'UrnaTrampa' viene heredada de la clase 'Urna' cogiendo sus atributos
    y su constructor e implementado un nuevo atributo y un nuevo metodo*/
public class UrnaTrampa extends Urna {
    //Este es el nuevo atributo
    private int bolaTrampa;
    /*Este es el constructor que coge heredado de la clase 'Urna' tomando un entero como argumento
    al igual que pasa como en su super clase 'Urna'*/
    public UrnaTrampa (int tamaño){
        super(tamaño);
    }
    /*Este metodo lo que hace es ir comparando la primera bola y la ultima y guardando
    a su vez en la posicion [0] un (1) o un (0). Una vez recorrido el array entero 
    y comparado todas las bolas, devuelve lo que hay en la posicion [0] que corresponde 
    a la ultima bola que quedaria en el bombo. Ademas cada vez que sacca bola genera
    un Math.random por 100 que se guarda en la variable 'bolaTrampa',
    si el resultado es menor que 20 (lo que seria una probabilidad
    de 0,2) cambia el número (0 o 1) de la posicion [0] que es la ultima que va a quedar*/
    public int Trampa (){
        for (int i=0 ; i<bombo.length-2 ; i++ ){
            if(bombo[i]==bombo[bombo.length-1]){
                bombo[0]=0;
                System.out.println("Son iguales introducimos una bola Negra");
                bolaTrampa=(int)(Math.random()*100);
                if (bolaTrampa<=20){
                    bombo[0]=1;
                    System.out.println("He cambiado una bola");
                }
            }else{
                bombo[0]=1;
                System.out.println("Son diferentes introducimos una bola Blanca");
                bolaTrampa=(int)(Math.random()*100);
                if (bolaTrampa<=20){
                    bombo[0]=0;
                    System.out.println("He cambiado una bola de color");
                }
            }
        }
        bola=bombo[0];
        return bola;
    }
}
