package ejerciciopropuesto4_10;
import java.util.*;
public class EjercicioPropuesto4_10 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero mayor que 4 para efectuar la suma "
                + "de los pares que hay por debajo del mismo hasta 0");
        int x=entrada.nextInt();
        int resto = x % 2;
        if(resto == 1){
            x++;
        } 
        int resultado=0;
        for (int i=x-2;i>0;i-=2){
            resultado=i+resultado;
        }
        System.out.println("La suma es " + resultado);
    }
    
}
