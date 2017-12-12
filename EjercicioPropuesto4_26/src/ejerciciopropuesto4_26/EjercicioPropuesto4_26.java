package ejerciciopropuesto4_26;
import java.util.*;
public class EjercicioPropuesto4_26 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un 1 para lanzar la moneda \n"
                + "e introduce cualquier otro para acabar");
        byte lanzar=entrada.nextByte();
        double aleatorio=Math.random()*(100);
        String moneda;
        while(lanzar==1){
            if(aleatorio<=50){
                moneda="cara";
                System.out.println("Ha salido " + moneda);
            }else if(aleatorio>50){
                moneda="cruz";
                System.out.println("Ha salido " + moneda);
            }
            lanzar=entrada.nextByte();
            aleatorio=Math.random()*(100);
        }
        System.out.println("Hasta pronto");
    }
}
