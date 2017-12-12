package ejerciciopropuesto5_3;

public class Mate {
    
    
    public static long Factorial (int numero){
        long resultado=1;
       for (int i = numero; i > 0; i--){
           resultado=i*resultado;
       }
       return resultado;
    }
     public static String Primo (int numero){
        String resultado="";
        int numero1=numero;
        int modulo=numero;
        boolean fin = false;
        while (modulo>2 && !fin){
            modulo--;
            if (numero%modulo==0){
                fin=true;
                resultado = "El " + numero1 + " no es primo";
            }
        }
        if(numero%modulo==1){
            resultado = "El " + numero1 + " si es primo";
        }
        if (numero==2 || numero==1){
            resultado = "El " + numero + " si es primo";
        }
        return resultado;
     }
     
     public static String Perfecto (int numero){
         String resultado;
         int divisores=0;
         for (int i=numero-1 ; i > 0 ; i--){
             if (numero%i==0){
                 divisores=divisores+i;
             }
         }
         if (divisores==numero){
             resultado="El numero es perfecto";
         }else {
             resultado="El numero no es perfecto";
         }
         return resultado;
     }
     
     public static String Amigos (int numero ,int numero2){
         String resultado;
         int divisores=0;
         for (int i=numero-1 ; i > 0 ; i--){
             if (numero%i==0){
                 divisores=divisores+i;
             }
         }
         if (divisores==numero2 && numero!=numero2){
             resultado="Los números " + numero + " y " + numero2 + " SI son amigos ";
         }else {
             resultado="Los números " + numero + " y " + numero2 + " NO son amigos ";
         }
         return resultado;
     }
     
     public static String Primos (int numero, int numero2){
         String resultado="";
         boolean salir=false;
         for (int i=numero-1 ; i > 1 ; i--){
             if (numero%i==0 && salir==false){
                 for (int j=numero2-1 ; j > 1 ; j--){
                     if (numero2%j==0){
                         if(i==j){
                             resultado="No son primos";
                             salir=true;
                         }
                     }
                 }
             }else if (salir==false) {
                 resultado="Son primos";
             }
         }
         return resultado;
     }
     
     public static double Euler(){
         double euler=0;
         for (int i=0 ; i < 39 ; i++){
             euler = euler + 1/(double)(Factorial(i));
         }
         return euler;
     }
    
     public static String Potencia(int numero, int numero2){
         long nresultado=numero;
         for(int i=1 ; i < numero2 ; i++){
             nresultado=nresultado*numero;
         }
         String resultado="La potencia de " + numero + " elevado a " + numero2 + " es: " + nresultado;
         return resultado;
     }
}
