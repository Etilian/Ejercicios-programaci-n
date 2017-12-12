package ejerciciopropuesto4_6;

import java.util.Scanner;

public class EjercicioPropuesto4_6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduzca segundo número");
        int numero2=entrada.nextInt();
        if (numero1%numero2==0){
            System.out.println("El primer número es divisible entre el segundo");
            }
        else if (numero2%numero1==0){
            System.out.println("El segundo número es divisible entre el primero");
            }
    }
}
