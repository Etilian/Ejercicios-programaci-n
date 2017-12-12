package ejerciciopropuesto4_8;
import java.util.*;
public class EjercicioPropuesto4_8 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el Lado A");
        int a=entrada.nextInt();
        System.out.println("Introduzca el Lado B");
        int b=entrada.nextInt();
        System.out.println("Introduzca el Lado C");
        int c=entrada.nextInt();
        if (a>=b+c){
            System.out.println("Esa figura no es un triangulo");
        }
        else if ((a*a)==(b*b)+(c*c)){
            System.out.println("Este triangulo es rectangulo");
        }
        else if ((a*a)>(b*b)+(c*c)){
            System.out.println("Este triangulo es obtusángo");
        }
        else if ((a*a)<(b*b)+(c*c)){
            System.out.println("Este triangulo es acutángulo");
        }
    }
    
}
