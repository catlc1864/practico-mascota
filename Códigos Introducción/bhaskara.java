public class bhaskara {
    //Codigo hecho en clase:

    public static void main (String args []) {
        int a=5, b=2, c=-3;
        Math.pow(b,2);
        double raiz= -(4*a*c);
        double r1=Math.sqrt(raiz);
        
        if (r1<0) {
            System.out.println("No se puede");
        }
else {
    double x1= (-b + r1) / (2*a);
    double x2= (-b - r1) / (2*a);
    //Indicamos los valores
    System.out.println("x1 corresponde a " + x1);
    System.out.println("x2 corresponde a " + x2);
}
}
}
