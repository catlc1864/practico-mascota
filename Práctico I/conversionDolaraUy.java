import java.util.*;
public class conversionDolaraUy {
    
    public static double multiplicar (double a, double b){
        return a*b;
    }

    public static void main (String []args) {
        Scanner input=new Scanner (System.in);
        double x=40.34;

        double y;
        System.out.println("Ingrese el monto en pesos uruguayos: ");
        y= input.nextDouble();

        System.out.println("Su monto convertido en dólares es: "+multiplicar(y,x));

    }
}
