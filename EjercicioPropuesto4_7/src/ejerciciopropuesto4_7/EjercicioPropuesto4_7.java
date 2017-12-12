package ejerciciopropuesto4_7;
import java.util.*;
public class EjercicioPropuesto4_7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int x=entrada.nextInt();
        System.out.println("Introduzca el segundo número");
        int y=entrada.nextInt();
        System.out.println("Introduzca el tercer número");
        int z=entrada.nextInt();
        if (x>y && x>z){
            System.out.println("El primer número es el mas grande");
        }
        else if (y>x && y>z){
            System.out.println("El segundo número es el mas grande");
        }
        else if (z>x && z>y){
            System.out.println("El tercer número es el mas grande");
        }
    }
    
}
