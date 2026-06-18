import java.util.*;

public class fechaNac{
public static void main (String [] args) {

Scanner input= new Scanner (System.in);

    int x=2026;
    int y;

    System.out.println("Ingrese su año de nacimiento: ");
    y=input.nextInt();

    System.out.println("Su edad es: "+nacimiento(x,y));

    input.close();
}

public static int nacimiento (int x, int y) {
    return x-y;
}

}