package ejerciciopropuesto4_9;
import java.util.*;
public class EjercicioPropuesto4_9 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca primer numero");
        int x=entrada.nextInt();
        System.out.println("Introduzca segundo numero");
        int y=entrada.nextInt();
        int resultado=0;
        if (x<y){
            for (int i=x+1;i<y;i++){
                resultado=i+resultado;
            }
        }
        else {
            for (int i=y+1;i<x;i++){
                resultado=i+resultado;
            }
        }
        System.out.println("La suma de los pares que hay entre ellos es " + resultado);
        
    }
}
