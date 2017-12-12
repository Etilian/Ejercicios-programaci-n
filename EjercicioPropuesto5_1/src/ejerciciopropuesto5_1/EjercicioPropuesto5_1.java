package ejerciciopropuesto5_1;
import java.util.*;
public class EjercicioPropuesto5_1 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Que quieres usar la ''Urna'' o la ''Urna Trampa''?");
        String a="Urna";
        String b="Urna Trampa";
        String c=entrada.nextLine();
        int retarder=0;
        int bola;
        while (a.equalsIgnoreCase(c)==false && b.equalsIgnoreCase(c)==false && retarder<5){
            retarder++;
            System.out.println("Por favor, escriba una de las dos opciones, gracias.");
            c=entrada.nextLine();
        }
        if (a.equalsIgnoreCase(c)==true){
            System.out.println("¿Que tamaño quieres que tenga el bombo de bolas?");
            Urna miUrna=new Urna (entrada.nextInt());
            bola=miUrna.vaciarLlenar();
            if(bola==0) System.out.println("La ultima bola es negra");
            if(bola==1) System.out.println("La ultima bola es blanca");
        }else if (b.equalsIgnoreCase(c)==true){
            System.out.println("¿Que tamaño quieres que tenga el bombo de bolas?");
            UrnaTrampa miUrna2=new UrnaTrampa (entrada.nextInt());
            bola=miUrna2.Trampa();
            if(bola==0) System.out.println("La ultima bola es negra");
            if(bola==1) System.out.println("La ultima bola es blanca");
        }else {
            System.out.println("No podemos estar asi eternamente. Hasta pronto");
        }
    }
}
