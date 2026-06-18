import java.util.*;

public class sumarDosNumeros {
    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
int x;
System.out.println("Ingrese el primer número: ");
x= input.nextInt();

int y;
System.out.println("Ingrese otro número: ");
y= input.nextInt();

System.out.println(" La suma es: "+sumar (x,y));


    }
    public static int sumar (int a, int b) {
        return a+b;
    }


}
