public class TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos primitivos enteros: byte, short, int, long.

        System.out.println("El rango de valores del tipo byte es de " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("El rango de valores del tipo short es de " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("El rango de valores del tipo int es de " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("El rango de valores del tipo long es de " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);

        // Tipos primitivos flotante: float y double.
        System.out.println("\n");
        System.out.println("El rango de valores del tipo float es de " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("El rango de valores del tipo double es de " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        //Tipo primitivo: char. Solo guarda un caracter.
        char miCaracter = 'a';
        System.out.println(miCaracter);

    }
}