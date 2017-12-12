package ejerciciopropuesto4_28;
import java.util.*;
public class EjercicioPropuesto4_28 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.print("Vamos a tirar dos dados 100 veces, \n"
                + " veamos cuantas veces suman 10, por favor \n"
                + "pulse el 100 para empezar: ");
        int tirada=entrada.nextInt();
        int dado1;
        int dado2;
        int contador=0;
        for(int i=0 ; i<tirada ; i++){
            dado1=(int)((Math.random()*(6)+1));
            dado2=(int)((Math.random()*(6)+1));
            if(dado1+dado2==10){
                contador++;
            }
        }
        System.out.println("Los dados han sumado 10 " + contador + " veces");
    }
}
