import java.util.*;

public class mascota {

    private String nombre;
    private String color;
    private int edad;
    private int altura;
    private String duenio;

    public mascota(String nombre, String color, int edad, int altura, String duenio) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.altura = altura;
        this.duenio = duenio;
    }

    //get

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
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

    //set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
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

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Edad: " + getEdad());
        System.out.println("Altura: " + getAltura());
        System.out.println("Dueño: " + getDuenio());
    }

    public static mascota crearMascota() {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la mascota:");
        String nombre = input.nextLine();

        System.out.println("Ingrese el color:");
        String color = input.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = input.nextInt();

        System.out.println("Ingrese la altura:");
        int altura = input.nextInt();
       
        input.nextLine();

        System.out.println("Ingrese el nombre del dueño:");
        String duenio = input.nextLine();

        return new mascota(nombre, color, edad, altura, duenio);
    }

    //perro

    public static class Perro extends mascota {

        private String raza;
        private String pelaje;

        public Perro(String nombre, String color, int edad, int altura, String duenio, String raza, String pelaje) {

            super(nombre, color, edad, altura, duenio);

            this.raza = raza;
            this.pelaje = pelaje;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getPelaje() {
            return pelaje;
        }

        public void setPelaje(String pelaje) {
            this.pelaje = pelaje;
        }

        public void ladrar() {
            System.out.println("El perro ladra: ¡Guau!");
        }

        public void mostrarRaza() {
            System.out.println("Raza: " + raza);
        }

        public void mostrarPelaje() {
            System.out.println("Pelaje: " + pelaje);
        }

    }

    //gato

    public static class Gato extends mascota {

        private boolean vacunado;
        private boolean desparasitado;

        public Gato(String nombre, String color, int edad, int altura, String duenio, boolean vacunado, boolean desparasitado) {

            super(nombre, color, edad, altura, duenio);

            this.vacunado = vacunado;
            this.desparasitado = desparasitado;
        }

        public boolean getVacunado() {
            return vacunado;
        }

        public void setVacunado(boolean vacunado) {
            this.vacunado = vacunado;
        }

        public boolean getDesparasitado() {
            return desparasitado;
        }

        public void setDesparasitado(boolean desparasitado) {
            this.desparasitado = desparasitado;
        }

        public void maullar() {
            System.out.println("El gato maulla: ¡Miau!");
        }

        public void mostrarVacunado() {
            System.out.println("Vacunado: " + vacunado);
        }

        public void mostrarDesparasitado() {
            System.out.println("Desparasitado: " + desparasitado);
        }

    }



        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //gato

        System.out.println("\nDatos del Gato");

        mascota datosGato = crearMascota();

        System.out.println("¿Está vacunado? (true/false)");
        boolean vacunado = input.nextBoolean();

        System.out.println("¿Está desparasitado? (true/false)");
        boolean desparasitado = input.nextBoolean();

        Gato miGato = new Gato(
                datosGato.getNombre(),
                datosGato.getColor(),
                datosGato.getEdad(),
                datosGato.getAltura(),
                datosGato.getDuenio(),
                vacunado,
                desparasitado);

        System.out.println();

        System.out.println("\nGato");

        miGato.mostrarDatos();
        miGato.maullar();
        miGato.mostrarVacunado();
        miGato.mostrarDesparasitado();

        input.nextLine();

        //perro

        System.out.println("\nDatos del perro");

        mascota datosPerro = crearMascota();

        System.out.println("Ingrese la raza:");
        String raza = input.nextLine();

        System.out.println("Ingrese el tipo de pelaje:");
        String pelaje = input.nextLine();

        Perro miPerro = new Perro(
                datosPerro.getNombre(),
                datosPerro.getColor(),
                datosPerro.getEdad(),
                datosPerro.getAltura(),
                datosPerro.getDuenio(),
                raza,
                pelaje);

        System.out.println();

        System.out.println("\nPerro");

        miPerro.mostrarDatos();
        miPerro.ladrar();
        miPerro.mostrarRaza();
        miPerro.mostrarPelaje();

        input.close();
    }

}