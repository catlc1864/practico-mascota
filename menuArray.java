import java.util.*;

public class ArrayNum {
public static void main (String args[]){
    Scanner input= new Scanner (System.in);

int [] array=null;
int op;
int tamanio=0;
int numero;
int dato = 0;

do{
    System.out.println("\n Menu de opciones: ");
    System.out.println("1- Definir el tamaño del Array");
    System.out.println("2- Cargar Valores del Array");
    System.out.println("3- Mostrar valores desde la primera posicion a la ultima");
    System.out.println("4- Mostrar valores desde la ultima posicion a la primera");
    System.out.println("5- Mostrar la suma de los valores del array");
    System.out.println("6- Salir");

    System.out.println("Elija un numero ");
    op =input.nextInt();

switch (op) {
   
    case 1:
    System.out.println("Ingrese el tamaño del array");
    tamanio=input.nextInt();
    array = new int[tamanio];
    break;

    case 2:
    if (array == null) {
    System.out.println("Primero debe definir el tamaño del array (opcion 1)");
    break;
} else
        
        for (int i=0; i<tamanio; i++) {
            System.out.println("Ingrese un nùmero: ");
        numero=input.nextInt();

        array[i]=numero;
        }
break;

case 3:
    
    if (array == null) {
    System.out.println("Primero debe definir el tamaño del array (opcion 1)");
    break;
    } else
    
     for (int i = 0; i < tamanio; i++) {
            
            System.out.println(array[i]);
        }

break;

case 4:
    
    if (array == null) {
    System.out.println("Primero debe definir el tamaño del array (opcion 1)");
    break;
} else
    
    for (int i = tamanio - 1; i >= 0; i--) {
            
            System.out.println(array[i]);
        }

break;

case 5:

    if (array == null) {
        System.out.println("Primero debe definir el tamaño del array (opcion 1)");
        break;
    }

    dato = 0; // reiniciar suma

    for (int i = 0; i < tamanio; i++) {
        dato += array[i];
    }

    System.out.println("La suma total es: " + dato);

break;

case 6:
break;

default:
    System.out.println("Opciòn invalida");
    break;
}


}while (op!=6);




}   
}