package ejerciciopropuesto4_30;
import java.util.*;
public class EjercicioPropuesto4_30 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Juguemos a un juego, adivina en que número estoy pensando del 1 al 100 \n "
                + "tienes 5 intentos.");
        int aleatorio;
        int intentos;
        boolean salir = false;
        int numero=2;
        while(numero!=0){
            aleatorio=(int)(Math.random()*(100)+1);
            numero=entrada.nextInt();
            intentos=0;
            if(aleatorio==numero) System.out.println("Diooos!!! acertaste a la primera, enhorabuena");
            if (aleatorio!=numero){
                for (int i=1; i<5 && salir != true ; i++){
                    intentos++;
                    if(aleatorio!=numero){
                        System.out.println("Has fallado, te quedan " + (5-(intentos)) + " intentos");
                    }
                    if (aleatorio<numero){
                        System.out.println("Es un número más bajo");
                        numero=entrada.nextInt();
                    }
                    else if(aleatorio>numero){
                        System.out.println("Es un número más alto");
                    numero=entrada.nextInt();
                    }else if(aleatorio==numero){
                        salir = true;
                    }
                }
            }
            if (aleatorio!=numero) System.out.println("Oh! lo siento has llegado a " + (intentos+1) + " intentos");
            if (aleatorio==numero && intentos>0) System.out.println("Enhorabuena!! lo has conseguido en " + intentos + " intentos");
            System.out.println("Para dejar de jugar introduzca el 0 o el siguiente número que ya he pensado otro");
            numero=entrada.nextInt();
        }
        System.out.println("Hasta pronto, Gracias por jugar");
    }
}
