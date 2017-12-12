package ejerciciopropuesto4_14;

public class EjercicioPropuesto4_14 {

    public static void main(String[] args) {
        //int contador=0;
        for (int i=0; i<100; i++){
            //contador++;
            switch(i%2){
                case 0:
                    System.out.println("Hola");
                    break;
                case 1:
                    System.out.println("Adiós");
                    break;
            }
            //System.out.println(contador);
        }
    }
}
