package ejerciciopropuesto4_13;
import java.util.*;
public class EjercicioPropuesto4_13 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int a=entrada.nextInt();
        System.out.println("Introduzca el segundo numero");
        int b=entrada.nextInt();
        int resultado=0;
        int numero=0;
        if (a<b){
            for (int i=a+1 ; i<b ; i+=2){
                numero++;
                System.out.println(i);
                resultado=i+resultado;
            }
            System.out.println("Estos son todos los números pares que hay entre ellos");    
        }
        else {
            for (int i=b+1 ; i<a ; i+=2){
                numero++;
                System.out.println(i);
                resultado=i+resultado;
            }
            System.out.println("Estos son todos los números pares que hay entre ellos");    
        }
        System.out.println("Son un total de " + numero + " números");
        System.out.println("La suma de ellos es " + resultado);
        
    }
    
}
