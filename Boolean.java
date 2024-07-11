import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        /*
         * boolean varBoolean = true;
         * System.out.println(varBoolean);
         * 
         * if(varBoolean){
         * System.out.println("La bandera es verdadera");
         * }
         * else{
         * System.out.println("La variable es falsa");
         * }
         */

        Scanner consola = new Scanner(System.in);

        System.out.println("¿Cuántos años tienes?");
        int edad = Integer.parseInt(consola.nextLine());
        var esAdulto = edad >= 18;

        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}