package ejerciciopropuesto4_29;

public class EjercicioPropuesto4_29 {

    public static void main(String[] args) {
        int quiniela;
        for (int i=0; i < 15 ; i++){
            quiniela=(int)(Math.random()*100);
            if(quiniela<=50) System.out.println("|1|  x   2 ");
            if(quiniela>50 && quiniela<=80) System.out.println(" 1  |x|  2");
            if(quiniela>80 && quiniela<=100) System.out.println(" 1   x  |2|");    
        }
    }
}
