import java.util.*;

public class perroSetGet {

    private String nombre;
    private String raza;
    private int edad;
    private int altura;
    private String duenio;

    public perroSetGet(String nombre, String raza, int edad, int altura, String duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
        this.duenio = duenio;
    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public String getDuenio() {
        return duenio;
    }

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
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

    public void mostrarDatos() {
        System.out.println("El nombre es: " + getNombre());
        System.out.println("La raza es: " + getRaza());
        System.out.println("La edad es: " + getEdad());
        System.out.println("La altura es: " + getAltura());
        System.out.println("El dueño es: " + getDuenio());
    }

    public static perroSetGet crearPerro() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su perro:");
        String nombre = input.nextLine();

        System.out.println("Ingrese la raza de su perro:");
        String raza = input.nextLine();

        System.out.println("Ingrese la edad de su perro:");
        int edad = input.nextInt();

        System.out.println("Ingrese la altura de su perro:");
        int altura = input.nextInt();

        input.nextLine();

        System.out.println("Ingrese nombre del dueño:");
        String duenio = input.nextLine();

        return new perroSetGet(nombre, raza, edad, altura, duenio);
    }

    public static void modificarPerro(perroSetGet perro) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nueva edad:");
        perro.setEdad(input.nextInt());
    }

    public static void main(String[] args) {

        perroSetGet p1 = crearPerro();
        p1.mostrarDatos();

        modificarPerro(p1);

        System.out.println("Nueva edad: " + p1.getEdad()); //Muestra el cambio con get

        System.out.println("Listo! Ahora vamos con el próximo perro");

        perroSetGet p2 = crearPerro();
        p2.mostrarDatos();

        modificarPerro(p2);

        System.out.println("Nueva edad: " + p2.getEdad());

        System.out.println("Listo! Ahora vamos con el próximo perro");

        perroSetGet p3 = crearPerro();
        p3.mostrarDatos();

        modificarPerro(p3);

        System.out.println("Nueva edad: " + p3.getEdad());
    }
}