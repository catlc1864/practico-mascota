//Año bisiesto en java
import java.util.*;

public class Metodo { 

    public static void main(String args[]) { // Método principal donde inicia el programa
        
        Scanner input = new Scanner(System.in); 

        System.out.println("Ingrese un ano para saber si es Bisiesto: ");
        
        int n = input.nextInt(); 

        //Llama al método es_bisiesto y guarda el resultado (true/false)
        boolean es = es_bisiesto(n); 

        //Si el resultado es verdadero
        if (es) 
            //Muestra que el año es bisiesto
            System.out.println(n + " es Bisiesto"); 
        //Si el resultado es falso
        else 
            //Muestra que no es bisiesto
            System.out.println(n + " no es Bisiesto"); 
    }

    //Método que determina si un año es bisiesto
    public static boolean es_bisiesto(int anio) {
        
        //Verifica la condición de año bisiesto:
        //Si Es divisible por 4 Y no por 100
        //O es divisible por 400
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0)
            return true; //Da verdadero si se cumple
        else
            return false; //Da falso si no se cumple
    }
}