package ejerciciopropuesto4_27;
import java.util.*;
public class EjercicioPropuesto4_27 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Vamos a tirar un dado 100 veces, \n"
                + " veamos cuantas veces sale el 6, por favor \n"
                + "pulse el 100 para empezar: ");
        int tirada=entrada.nextInt();
        int contador=0;
        int lanzar;
        for(int i=0 ; i<tirada ; i++){
            lanzar=(int)((Math.random()*(6)+1));
            if(lanzar==6){
                contador++;
            }
        }
        System.out.println("El 6 ha salido " + contador + " veces");
    }
}
