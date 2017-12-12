package ejerciciopropuesto4_25;
import java.util.*;
public class EjercicioPropuesto4_25 {
    public static String ExtraerNotas (int nota){
        String calificacion="";
        if (nota>=0 && nota<3){
            calificacion="Muy deficiente";
        }else if(nota>=3 && nota<5){
            calificacion="Insuficiente";
        }else if(nota>=5 && nota<6){
            calificacion="Suficiente";
        }else if(nota>=6 && nota<7){
            calificacion="Bien";
        }else if(nota>=7 && nota<9){
            calificacion="Notable";
        }else if(nota>=9 && nota<=10){
            calificacion="Sobresaliente";
        } return calificacion;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca las notas de los examenes e introduce 0 para acabar");
        int entradanota=entrada.nextInt();
        int sumatorianotas=0;
        int numnotas=0;
        int media;
        while (entradanota!=0){
            numnotas++;
            sumatorianotas=sumatorianotas+entradanota;
            entradanota=entrada.nextInt();
        }
        media=sumatorianotas/numnotas;
        System.out.println("Tu estadistica de notas es un " + ExtraerNotas(media));
    }
}
