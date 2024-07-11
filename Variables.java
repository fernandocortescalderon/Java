public class Variables {
    public static void main(String[] args) throws Exception {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        // Se puede cambiar el valor de la variable unicamente colocando el nombre y su nuevo valor
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adiós";
        System.out.println(miVariableCadena);

        //var infiere el tipo de la variable
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Chaito";
        System.out.println(miVariableCadena2);
        
        
    }
}
