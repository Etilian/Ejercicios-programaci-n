package ejerciciopropuesto4_5;
import java.util.Scanner;
public class EjercicioPropuesto4_5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero");
        int numero=entrada.nextInt();
        if (numero%2==0){
            System.out.println("El número introducido es par");
        }
        else {
            System.out.println("El número introducido es impar");
        }
    }
    
}
