package ejerciciopropuesto4_3;
import java.util.Scanner;

    public class EjercicioPropuesto4_3 {
        public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);
            System.out.println("Longitud lado 1");
            double lado1=entrada.nextInt();
            System.out.println("Longitud lado 2");
            double lado2=entrada.nextInt();
            System.out.println("Longitud lado 3");
            double lado3=entrada.nextInt();
            double T=(lado1+lado2+lado3)/2;
            double area=Math.sqrt(T*(T-lado1)*(T-lado2)*(T-lado3));
            System.out.printf("El Area del triangulo es "+"%1.2f ", area);
            
    }
    
}
