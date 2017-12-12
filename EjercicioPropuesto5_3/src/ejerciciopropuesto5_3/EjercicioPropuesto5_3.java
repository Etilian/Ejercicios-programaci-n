package ejerciciopropuesto5_3;
import java.util.*;
public class EjercicioPropuesto5_3 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Que funcion quieres hacer?");
        System.out.println("1: Saber el factorial de un número \n2: Saber si un número es primo \n"
                + "3: Saber si un número es perfecto \n4: Saber si dos números son amigos \n"
                + "5: Saber si dos numeros son primos \n6: Conocer el número euler \n"
                + "7: Hacer una potencia");
        int x=entrada.nextInt();
        int y;
        switch (x) {
            case 1:
                System.out.println("Introduzca un número menor que 40");
                System.out.println("El factorial es: " + Mate.Factorial(entrada.nextInt()));
                break;
            case 2:
                System.out.println("Introduzca el número");
                System.out.println(Mate.Primo(entrada.nextInt()));
                break;
            case 3:
                System.out.println("Introduzca el número");
                System.out.println(Mate.Perfecto(entrada.nextInt()));
                break;
            case 4:
                System.out.println("Introduzca los números pulsando intro despues de cada uno");
                System.out.println(Mate.Amigos(entrada.nextInt(), entrada.nextInt()));
                break;
            case 5:
                System.out.println("Introduzca los números pulsando intro despues de cada uno");
                System.out.println(Mate.Primos(entrada.nextInt(), entrada.nextInt()));
                break;
            case 6:
                System.out.println("El numero euler es: " + Mate.Euler());
                
                break;
            case 7:
                System.out.println("Introduzca primero la base y despues el exponente pulsando intro entre ellos");
                System.out.println(Mate.Potencia(entrada.nextInt(), entrada.nextInt()));
                break;
        }
    }
}
