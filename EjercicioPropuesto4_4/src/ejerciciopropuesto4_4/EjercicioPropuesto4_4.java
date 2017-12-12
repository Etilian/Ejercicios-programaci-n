package ejerciciopropuesto4_4;
import java.util.Scanner;
    public class EjercicioPropuesto4_4 {
        public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero");
        int numero=entrada.nextInt();
        if (numero>=0){
            System.out.println("El número introducido es positivo");
        }
        else if (numero<0){
            System.out.println("El número introducido es negativo");
        }
    }
    
}
