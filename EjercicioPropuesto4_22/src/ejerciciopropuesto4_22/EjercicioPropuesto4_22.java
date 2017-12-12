package ejerciciopropuesto4_22;
import java.util.*;
public class EjercicioPropuesto4_22 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número entero positivo para saber si es primo o no");
        int numero=entrada.nextInt();
        int numero1=numero;
        int modulo=numero;
        boolean fin = false;
        while (modulo>2 && !fin){
            modulo--;
            if (numero%modulo==0){
                System.out.println("El " + numero1 + " no es primo");
                fin=true;
            }
        }
        if(numero%modulo==1){
            System.out.println("El " + numero1 + " si es primo");
        }
        if (numero==2 || numero==1){
            System.out.println("El " + numero + " si es primo");
        }
    }
}
