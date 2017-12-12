package ejerciciopropuesto4_23;
import java.util.*;
public class EjercicioPropuesto4_23 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero de un mes tantas veces \n"
                + "como quiera e introduce culquier otro número para terminar");
        byte mes=entrada.nextByte();
        while (mes>=1 && mes<=12){
            switch (mes){
                case 1:
                    System.out.println("Enero");
                    mes=entrada.nextByte();
                    break;
                case 2:
                    System.out.println("Febrero");
                    mes=entrada.nextByte();
                    break;
                case 3:
                    System.out.println("Marzo");
                    mes=entrada.nextByte();
                    break;
                case 4:
                    System.out.println("Abril");
                    mes=entrada.nextByte();
                    break;
                case 5:
                    System.out.println("Mayo");
                    mes=entrada.nextByte();
                    break;
                case 6:
                    System.out.println("Junio");
                    mes=entrada.nextByte();
                    break;
                case 7:
                    System.out.println("Julio");
                    mes=entrada.nextByte();
                    break;
                case 8:
                    System.out.println("Agosto");
                    mes=entrada.nextByte();
                    break;
                case 9:
                    System.out.println("Septiembre");
                    mes=entrada.nextByte();
                    break;
                case 10:
                    System.out.println("Octubre");
                    mes=entrada.nextByte();
                    break;
                case 11:
                    System.out.println("Noviembre");
                    mes=entrada.nextByte();
                    break;
                case 12:
                    System.out.println("Diciembre");
                    mes=entrada.nextByte();
                    break;
                }
        }
        
        System.out.println("Hasta pronto");
            
    }
}
