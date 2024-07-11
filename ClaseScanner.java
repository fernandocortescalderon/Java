import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        /*
        Scanner consola = new Scanner(System.in); // La clase Scanner sirve para leer información del usuario. La palabra reservada new sirve para crear un objeto de esa clase. System.in es el acceso a la consola e in es de input
        
        System.out.println("Escribe tu nombre: ");        
        var usuario = consola.nextLine(); // El método "nextLine()" sirve para esperar a que el usuario agregue información.
        
        System.out.println("¿Cuántos años tienes?");
        var edad = consola.nextLine();
        
        System.out.println("Hola, " + usuario +". ¡Ya estás grande!");
        */

        // Ejercicio

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = consola.nextLine();

        System.out.println("El libro " + titulo + " fue escrito por " + autor);
    }
}
