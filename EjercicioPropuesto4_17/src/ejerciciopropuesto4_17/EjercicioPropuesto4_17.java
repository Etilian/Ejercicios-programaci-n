package ejerciciopropuesto4_17;
import java.util.*;
public class EjercicioPropuesto4_17 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce números e introduce el 0 cuando quieras parar");
        int minimo=entrada.nextInt();
        int maximo=minimo;
        int x=maximo;
        while (x!=0){
            if (minimo>x){
                minimo=x;
            }else if (maximo<x){
                maximo=x;
            }
            x=entrada.nextInt();
        }
        System.out.println("El número mas pequeño que has introducido es el " + minimo);
        System.out.println("El número mas grande que has introducido es el " + maximo);
    }
}
