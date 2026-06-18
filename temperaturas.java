import java.util.*;



class main{

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

    int temp;
    System.out.println("Ingrese la temperatura del dia 1:");
    temp=input.nextInt();

    int suma=0;
    int max=temp;
    int min=temp;
    int n=7;

    

    for(int i=2; i<=7; i++){
        System.out.println("Ingrese la temperatura del dia "+i+":");
    temp=input.nextInt();

suma=suma+temp;

        if (temp>max)
            max=temp;

        if (temp<min)
            min=temp;
}
double promedio = (double) suma / n;
  int contador = 0;

        System.out.println("Ingrese nuevamente las temperaturas:");

        for (int i = 1; i <=7; i++) {
            System.out.println("Ingrese la temperatura del día " + i + ":");
            temp = input.nextInt();

            if (temp > promedio) {
                contador++;
            }
        }



System.out.println("Tuvo un promedio de: "+promedio);
System.out.println("Fueron "+contador+" las temperaturas que superaron el promedio");
System.out.println("La máxima temperatura fue:"+max);
System.out.println("La mínima temperatura fue:"+min);








    }
}