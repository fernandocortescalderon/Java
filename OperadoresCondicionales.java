public class OperadoresCondicionales {
    public static void main(String[] args) {

        // Operador "and" (&&)
        // Operador "or" (||) funciona si ambas expresiones son falsas. Si uno de los dos valores es verdadero, toda la expresión es verdadera
        // Operador 

        var a = -1;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = a >= 0 && a <= 10;

        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }



        var vacaciones = true;
        var diaDescanso = false;

        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        }
        else{
            System.out.println("El padre está ocupado");
        }
    }
}