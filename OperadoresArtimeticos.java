public class OperadoresArtimeticos {
    public static void main(String[] args) {
        int a = 3, b = 2;
        var suma = a + b;
        var resta = a - b;
        var multiplicacion = a * b;
        var division = a / b;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        // El módulo es el residuo entero de la división
        var modulo = a % b;
        System.out.println(modulo);

        // Para ver si un número es par
        if (a % 2 == 0)
            System.out.println("Es número par");
        else
            System.out.println("Es número impar");

    }
}
