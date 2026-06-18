import java.util.*;


public class calculadora {

    public static double sumar (double a, double b) {
        return a+b;
    }

public static double restar (double c, double d) {
        return c-d;
    }

    public static double multiplicar (double e, double f) {
        return e*f;
    }

    public static double dividir (double g, double h) {
        return g/h;
    }

public static void main (String []args) {
    Scanner input=new Scanner (System.in);

    int op;

double x;
double y;

System.out.println("Ingrese un número: ");
x=input.nextDouble();


System.out.println("Ingrese otro número: ");
y=input.nextDouble();

        

    do{
        System.out.println("Menú de opciones: ");
        System.out.println("1. Sumar: ");
        System.out.println("2. Restar: ");
        System.out.println("3. Multiplicar: ");
        System.out.println("4. Dividir: ");
        System.out.println("5. Salir: ");
        
        System.out.println("Elija una opción: ");
        op=input.nextInt();

        switch(op){
            case 1: 
System.out.println("Resultado de " +x+"+"+y+"= "+sumar(x,y));
break;

case 2:
    System.out.println("Resultado de "+x+"-"+y+"= "+restar(x,y));
break;

case 3:
    System.out.println("Resultado de "+x+"x"+y+"= "+multiplicar(x,y));
break;

case 4:
System.out.println("Resultado de "+x+"/"+y+"= "+dividir(x,y));
break;

        

        
        
      

    }
    System.out.println("Ingrese un número: ");
x=input.nextDouble();


System.out.println("Ingrese otro número: ");
y=input.nextDouble();

    }while (op!=5);

  
        input.close();
}
}

