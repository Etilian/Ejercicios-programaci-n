package ejerciciopropuesto4_18;
import java.util.*;
public class EjercicioPropuesto4_18 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca dos número A y B para averiguar el \n"
                + "número combinatorio, sabiendo que A debe ser mayor que B");
        System.out.println("Introduzca el número A");
        int a=entrada.nextInt();
        System.out.println("Introduzca el número B");
        int b=entrada.nextInt();
        int factorial1=1;
        int a1=a;
        int b1=b;
        while ( a1!=0) {
            factorial1=factorial1*a1;
            a1--;
        }
        int factorial2=1;
        while (b1!=0){
            factorial2=factorial2*b1;
            b1--;
        }
        int factorial3=1;
        int c=a-b;
        while (c!=0){
            factorial3=factorial3*c;
            c--;
        }
        int ncombinatorio=factorial1/(factorial2*factorial3);
        /*System.out.println(factorial);
        System.out.println(factoria2);*/
        System.out.println("El número combinatorio de A y B es " + ncombinatorio);
    }
}
