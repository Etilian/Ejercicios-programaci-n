package ejerciciopropuesto4_11;
import java.util.*;
public class EjercicioPropuesto4_11 {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       System.out.println("Introduzca un numero");
       int a=entrada.nextInt();
       long resultado=1;
       for (int i = a; i > 0; i--){
           resultado=i*resultado;
       }
       System.out.println("El Factorial de " + a + " es " + resultado);
       
    }
    
}
