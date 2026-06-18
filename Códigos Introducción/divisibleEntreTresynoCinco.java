import java.util.*;
 public class divisibleEntreTresynoCinco {
     public static int divisible(int n1, int n2){
        int contador = 0;
        for (int f = n1; f <= n2; f++) {
        if (f%3==0 && f%5!=0) 
        contador++;
        }
     return contador;
        }
        
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        int n1 = input.nextInt();
        
        System.out.println("Ingrese un numero: ");
        int n2 = input.nextInt();

         System.out.println( "La cantidad de numeros es: " + contador);
        
    }
 }