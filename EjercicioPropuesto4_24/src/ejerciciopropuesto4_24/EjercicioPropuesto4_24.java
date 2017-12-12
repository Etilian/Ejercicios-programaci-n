package ejerciciopropuesto4_24;
import java.util.*;
public class EjercicioPropuesto4_24 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introducid la nota de una asignatura que esté comprendida entre 0 y 10");
        float nota=entrada.nextFloat();
        if (nota>=0 && nota<3){
            System.out.println("Muy deficiente");
        }else if(nota>=3 && nota<5){
            System.out.println("Insuficiente");
        }else if(nota>=5 && nota<6){
            System.out.println("Suficiente");
        }else if(nota>=6 && nota<7){
            System.out.println("Bien");
        }else if(nota>=7 && nota<9){
            System.out.println("Notable");
        }else if(nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        }
    }
}
