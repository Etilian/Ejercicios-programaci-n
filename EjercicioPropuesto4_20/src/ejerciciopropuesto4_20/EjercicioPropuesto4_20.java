package ejerciciopropuesto4_20;
import java.util.*;
public class EjercicioPropuesto4_20 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Intoduce números para averiguar la media aritmética, \n"
                + "introduce 0 para acabar");
        int n=entrada.nextInt();
        int sumatoria=0;
        int sumandos=0;
        while(n!=0){
            sumandos++;
            sumatoria=sumatoria+n;
            n=entrada.nextInt();
        }
        int media=sumatoria/sumandos;
        System.out.println("La media aritmetica es " + media);
    }
}
