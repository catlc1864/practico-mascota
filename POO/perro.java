import java.util.*;

public class perro{
   
    String nombre;
    String raza;
    int edad;
    int altura;
    String duenio;

     public perro (String nombre, String raza, int edad, int altura, String duenio) {
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.altura=altura;
        this.duenio=duenio;
    }

     public void comer() {
        System.out.println("Comiendo...");
    }

     public void ladrar() {
        System.out.println("Ladrando...");
    }

     public void dormir() {
        System.out.println("Durmiendo...");
    }

    public void mostrarDatos(){
        System.out.println("La nombre es: "+nombre);
        System.out.println("La raza es: "+raza);
        System.out.println("La edad es: "+edad);
        System.out.println("La altura es: "+altura);
        System.out.println("El duenio es: "+duenio);
    }

    public static perro crearPerro(){
    
       Scanner input=new Scanner(System.in);
    
       System.out.println("Ingrese el nombre de su perro");
       String nombre=input.nextLine();

       System.out.println("Ingrese la raza de su perro");
       String raza=input.nextLine();

       System.out.println("Ingrese la edad de de su perro");
       int edad=input.nextInt();

       System.out.println("Ingrese la altura de su perro");
       int altura=input.nextInt();

       input.nextLine();

       System.out.println("Ingrese su nombre");
       String duenio=input.nextLine();

       return new perro(nombre, raza, edad, altura, duenio);
    }


     public static void main (String[]args) {

      perro p1 = crearPerro();
      p1.mostrarDatos();
      
      System.out.println("Listo! Ahora vamos con el próximo perro");
      
      perro p2 = crearPerro();
      p2.mostrarDatos();

      System.out.println("Listo! Ahora vamos con el próximo perro");

      perro p3 = crearPerro();
      p3.mostrarDatos();

}
}