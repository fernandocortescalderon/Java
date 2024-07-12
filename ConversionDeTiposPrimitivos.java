import java.util.Scanner;

public class ConversionDeTiposPrimitivos {
    public static void main(String[] args) {
        /* // Para hacer una conversión de tipo Sring a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println(edad + 1);

        // Para hacer una conversión de tipo String a Double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println(valorPi + 1);

        // Para convertir Int a String
        var edadTexto = String.valueOf(10);
        System.out.println(edadTexto + 1);

        // Para convertir a Char seleccionando un solo índice
        var caracter = "hola".charAt(0);
        System.out.println(caracter); */

        // Ejercicio

        var consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre:");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        var id = consola.nextLine();
        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envío gratuito: (true/false)");
        var envio = consola.nextLine();

        System.out.println("Resumen: \n");
        System.out.println("Título y ID: " + nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envío gratuito: " + envio);
        
        
    }
}
