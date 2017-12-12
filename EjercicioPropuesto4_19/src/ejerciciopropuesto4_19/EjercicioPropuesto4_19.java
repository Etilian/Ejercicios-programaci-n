package ejerciciopropuesto4_19;
import java.util.*;
public class EjercicioPropuesto4_19 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce números e introduce el 0 cuando quieras parar");
        int n=entrada.nextInt();
        int positivos=0;
        int negativos=0;
        while (n!=0){
            if(n<0){
               negativos++; 
            }else if(n>0){
                positivos++;
            }
            n=entrada.nextInt();
        }
        System.out.println("Hay " + positivos + " números positivos");
        System.out.println("Hay " + negativos + " números negativos");
    }
}
