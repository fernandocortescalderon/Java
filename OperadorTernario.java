public class OperadorTernario {
    public static void main(String[] args) {

        // Se usa como if/else. Se recomienda si son expresiones sencillas.
        // ? (if) : (else)

        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println(resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "Número par" : "Número impar";
        System.out.println(resultado);


    }
}
