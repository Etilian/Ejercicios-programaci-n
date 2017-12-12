package ejerciciopropuesto4_2;
import java.util.Scanner;
public class EjercicioPropuesto4_2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Valor del producto");
        double producto=entrada.nextInt();
        System.out.println("Número de productos");
        double numero=entrada.nextInt(); 
        double obrero1=(producto*numero)/5;
        System.out.println("El operario 1 cobra "+obrero1+" €");
        double obrero2=(producto*numero)/5;
        System.out.println("El operario 2 cobra "+obrero2+" €");
        double obrero3=(producto*numero)/5;
        System.out.println("El operario 3 cobra "+obrero3+" €");
        double Arquitecto=obrero1+obrero2;
        System.out.println("El Arquitecto cobra "+Arquitecto+" €");
    }
    
}
 