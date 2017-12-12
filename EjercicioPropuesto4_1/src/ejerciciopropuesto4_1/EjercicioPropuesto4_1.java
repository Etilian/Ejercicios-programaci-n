package ejerciciopropuesto4_1;
import java.util.Scanner;
public class EjercicioPropuesto4_1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Inroduce el primer cateto");
        int cateto1=entrada.nextInt();
        System.out.print("Introduce el segundo cateto");
        int cateto2=entrada.nextInt();
        double hipotenusa=Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2));
        System.out.printf("El valor de la Hipotenusa es"+"%1.2f",hipotenusa);
    }
    
}
