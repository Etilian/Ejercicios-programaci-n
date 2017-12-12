package ejerciciopropuesto4_21;
import java.util.*;
public class EjercicioPropuesto4_21 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("indica la tabla de multiplicar que quieres saber del 1 al 10");
        int numero=entrada.nextInt();
        while (numero<1 || numero>10){
            System.out.println("Por favor, escoja una tabla del 1 al 10");
            numero=entrada.nextInt();
        }
        if (numero>=1 && numero<=10){
                for(int i = 1; i <= 10; i++){
                    System.out.println(numero + " X " + i + " = " + numero*i);
                }
            System.out.println();
        }
    }
}
