package ejerciciopropuesto4_16;
import java.util.*;
public class EjercicioPropuesto4_16 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuántos números vas a introducir?");
        int n=entrada.nextInt();
        System.out.println("Introducelos");
        int minimo=entrada.nextInt();
        int maximo=minimo;
        int x;
        for(int i=0 ; i<n-1 ; i++){
            x=entrada.nextInt();
            if (minimo>x){
                minimo=x;
            }else if (maximo<x){
                maximo=x;
            }
        }
        System.out.println("El número mas pequeño que has introducido es el " + minimo);
        System.out.println("El número mas grande que has introducido es el " + maximo);
    }
}
