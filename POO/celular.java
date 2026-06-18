public class celular{
    String marca;
    String modelo;
    int precio;
    String color;
    int almacenamiento;

    public celular (String marca, String modelo, int precio, String color, int almacenamiento) {
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.color=color;
        this.almacenamiento=almacenamiento;
    }

    public void llamar() {
        System.out.println("Llamando...");
    }

    public void mostrarDatos(){
        System.out.println("La marca es: "+marca);
        System.out.println("El modelo es: "+modelo);
        System.out.println("El precio es: "+precio);
        System.out.println("El color es: "+color);
        System.out.println("El almacenamiento es: "+almacenamiento);
    }

    public static void main (String[]args) {
       celular c1=new celular ("Apple", "Iphone 15 Pro", 50000, "Negro", 256);
       c1.mostrarDatos();

       celular c2= new celular ("Apple", "Iphone 17", 60000, "Rosado", 1);
       c2.mostrarDatos();

       celular c3= new celular ("Apple", "Iphone XS", 8000, "Blanco", 128);
       c3.mostrarDatos();

       celular c4= new celular ("Apple", "Iphone 13", 20000, "Azul", 1);
       c4.mostrarDatos();

       celular c5= new celular ("Apple", "Iphone 16", 40000, "Gris", 256);
       c5.mostrarDatos();
    }

}