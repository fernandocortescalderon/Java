public class CaracteresEspeciales {
    public static void main(String[] args) {
        var nombre = "Carla";

        // Nueva línea
        System.out.println("Nueva línea: \n" + nombre );

        // Tabulador
        System.out.println("Tabulador: \t" + nombre);

        // Retroceso
        System.out.println("Retroceso: \b" + nombre);

        // Comillas simples y dobles
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
    }
}