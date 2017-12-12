package ejerciciopropuesto4_12;
import java.util.*;
public class EjercicioPropuesto4_12 {

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       System.out.println("Introduzca un numero para calcular su Factorial");
       double a=entrada.nextDouble();
       double resultado=1;
       while (a%1!=0 || a<0){
           if (a<0){
               System.out.println("Introduzca un numero positivo");
           }
           if (a%1!=0){
           System.out.println("Introduzca un numero sin decimales");
           }
           a=entrada.nextDouble();
       }
       for (double i = a; i > 0; i--){
           resultado=i*resultado;
       }
       System.out.println("El Factorial de " + (int)a + " es " + (int)resultado);
       
    }
    
}