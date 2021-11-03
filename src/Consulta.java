import java.util.Scanner;

public class Consulta {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        String edad = entrada.nextLine();
        System.out.println("Ingrese su hobbie");
        String hobbie = entrada.nextLine();
        System.out.println("Ingrese su editor de codigo preferido");
        String editor = entrada.nextLine();
        System.out.println("Ingrese el sistema operativo que utiliza");
        String sistema = entrada.nextLine();


        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Tiene: " + edad + " años");
        System.out.println("Su hobbie es: " + hobbie);
        System.out.println("El editor preferido es: " + editor);
        System.out.println("El sistema operativo que utiliza es: " + sistema);
    }
}
