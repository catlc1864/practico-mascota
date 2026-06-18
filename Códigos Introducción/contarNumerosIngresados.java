import java.util.*;

public class contarNumerosIngresados {
    
public static int sumar (int a, int b){
    return a+b;
}

public static void main (String []args){
    Scanner input=new Scanner(System.in);

    int num;
    int contador=0;

    System.out.println("Ingrese números, 50 para salir: ");
 
do {
    num=input.nextInt();

    if(num!=50){
        contador=sumar(contador,1);
    }
} while (num!=50);
System.out.println("Cantidad de números ingresados: "+contador);

input.close();
}
}
