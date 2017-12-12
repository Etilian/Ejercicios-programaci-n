package ejerciciopropuesto4_15;
import java.util.*;
public class EjercicioPropuesto4_15 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un número entero, por favor");
        int a=entrada.nextInt();
        System.out.println("Introduzca otro número entero, por favor");
        int b=entrada.nextInt();
        System.out.println("Estos son los multiplos de 3 de forma \n"
                                + "Alternativa ");
        if (a<b){
            for (int i=a ; i<b ; i++){
                    if (i%3==0){
                        int c=i;
                        if (c%2==1){
                            System.out.println(c);
                        }
                    }
            }
        } else if (b<a){
            for (int i=b ; i<a ; i++){
                    if (i%3==0){
                        int c=i;
                        if (c%2==1){
                        System.out.println(c);
                        }
                    }
            }
        }
    }
}
