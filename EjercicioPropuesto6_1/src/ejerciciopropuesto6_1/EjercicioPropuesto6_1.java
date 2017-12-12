package ejerciciopropuesto6_1;
import java.util.Scanner;
public class EjercicioPropuesto6_1 {

    public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
        Lista li=new Lista();
		Pila pi=new Pila();
		Cola co=new Cola();
		Cadena cadena;
		boolean salir=true;
		boolean salir2=true;
		String ob1="Soy el objeto 1";
		String ob2="Soy el objeto 2";
		String ob3="Soy el objeto 3";
		System.out.println("¿Qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
		int opcion=entrada.nextInt();
		while (opcion>6 || opcion<0){
            System.out.println("La opción no es correcta");
            System.out.println("¿Qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
            opcion=entrada.nextInt(); 
        }
		while (salir2==true && opcion<7 && opcion>0){
			salir=true;
			switch(opcion){
				case 1:
					System.out.println("¿Qué quieres hacer con la Lista?");
					System.out.println("\n1: Insertar obejo en primer lugar \n2: Insertar obejo en ultimo lugar \n3: Comprobarla "
						+ "\n4: Extraer el primero \n5: Extraer ultimo \n6: Visualizarla \n7: Salir");
					opcion=entrada.nextInt();
					while (salir==true && opcion<8 && opcion>0){
						switch (opcion){
							case 1:
								li.ponPrimero(ob1);
								System.out.println("Introducido");
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 2:
								li.ponUltimo(ob2);
								System.out.println("Introducido");
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 3:
								System.out.println("La lista esta: " + li.estaVacia());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 4:
								System.out.println(li.extraePrimero());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 5:
								System.out.println(li.extraeUltimo());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 6:
								System.out.println("Esto es lo que hay en tu Lista");
								li.visualizaElementos();
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 7:
								System.out.println("Gracias por usar la clase Lista");
								salir=false;
								break;
						}
					}
					System.out.println("Y ahora ¿qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
					opcion=entrada.nextInt();
					break;

				case 2:
					System.out.println("¿Qué quieres hacer con la Pila?");
					System.out.println("\n1: Llenarla \n2: Extraer objeto \n3: Comprobarla "
						+ "\n4: Cima \n5: Salir");
					opcion=entrada.nextInt();
					while (salir==true && opcion<6 && opcion>0){
						switch (opcion){
							case 1:
								pi.Push(ob1);
								pi.Push(ob2);
								pi.Push(ob3);
								System.out.println("Introducidos");
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 2:
								System.out.println(pi.Pop());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 3:
								System.out.println("La lista esta: " + pi.Vacia());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 4:
								pi.Cima();
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 5:
								System.out.println("Gracias por usar la clase Lista");
								salir=false;
								break;
						}
					}
					System.out.println("Y ahora ¿qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
					opcion=entrada.nextInt();
					break;

				case 3:
					System.out.println("¿Qué quieres hacer con la Cola?");
					System.out.println("\n1: Llenarla \n2: Extraer objeto \n3: Comprobarla "
						+ "\n4: Frente \n5: Salir");
					opcion=entrada.nextInt();
					while (salir==true && opcion<6 && opcion>0){
						switch (opcion){
							case 1:
								co.ponEnCola(ob1);
								co.ponEnCola(ob2);
								co.ponEnCola(ob3);
								System.out.println("Introducidos");
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 2:
								System.out.println(co.extraeDeCola());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 3:
								System.out.println("La lista esta: " + co.Vacia());
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 4:
								co.Frente();
								System.out.println("¿Y ahora?");
								opcion=entrada.nextInt();
								break;
							case 5:
								System.out.println("Gracias por usar la clase Cola");
								salir=false;
								break;
						}
					}
					System.out.println("Y ahora ¿qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
					opcion=entrada.nextInt();
					break;

				case 4:
					System.out.println("¿Qué quieres hacer? \n1: Ordinal \n2: Ascii \n3: Salir");
					opcion=entrada.nextInt();
					while (salir==true && opcion<4 && opcion>0){
						switch (opcion){
							case 1:
								System.out.println("Introduce un Caracter y te dire su número en ascii");
								System.out.println(Caracter.ordinal(entrada.next().charAt(0)));
								System.out.println("¿Y ahora que opcion quieres?");
								opcion=entrada.nextInt();
								break;
							case 2:
								System.out.println("Introduce un número ascii y te dire su caracter");
								System.out.println(Caracter.ascii(entrada.nextInt()));
								System.out.println("¿Y ahora que opcion quieres?");
								opcion=entrada.nextInt();
								break;
							case 3:
								System.out.println("Gracias por usar la clase Caracter");
								salir=false;
								break;
						}
					}
					System.out.println("Y ahora ¿qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
					opcion=entrada.nextInt();
					break;

				case 5:
					System.out.println("Introduce una palabra, frase o texto");
					String texto=entrada.nextLine();
					cadena=new Cadena(entrada.nextLine());
					System.out.println("¿Qué quieres hacerco la cadena? \n1: Invertirla \n2: Encriptarla \n3: Desencriptarla "
							+ "\n4: Visualizarla \n5: Salir");
					opcion=entrada.nextInt();
					while (salir==true && opcion<6 && opcion>0){
						switch (opcion){
							case 1:
								cadena.invierteCadena();
								System.out.println("Hecho");
								opcion=entrada.nextInt();
								break;
							case 2:
								cadena.encriptaCadena();
								System.out.println("Hecho");
								opcion=entrada.nextInt();
								break;
							case 3:
								cadena.desencriptaCadena();
								System.out.println("Hecho");
								opcion=entrada.nextInt();
								break;
							case 4:
								cadena.visualizaCadena();
								opcion=entrada.nextInt();
								break;
							case 5:
								System.out.println("Gracias por usar la clase Caracter");
								salir=false;
								break;
						}
					}
					System.out.println("Y ahora ¿qué quieres hacer? \n1: Lista \n2: Pila \n3: Cola \n4: Caracter \n5: Cadena \n6: Salir");
					opcion=entrada.nextInt();
					break;
					
				case 6:
					System.out.println("Hasta pronto");
					salir2=false;
					break;
			}
		}
	}
}
