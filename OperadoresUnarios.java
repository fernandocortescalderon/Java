public class OperadoresUnarios {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println(a);
        System.out.println(b);

        var c = true;
        var d = !c;
        System.out.println(c);
        System.out.println(d);

        // Incremento

        // 1. Preincremento (símbolo antes de la variable)

        var e = 3;
        var f = ++e; // Se incrementa la variable y luego se usa su valor
        System.out.println(e);
        System.out.println(f);

        // 2. Posincremento (Símbolo después de la variable)

        var g = 5;
        var h = g++; // Primero se utiliza el valor y luego se incrementa
        System.out.println(g);
        System.out.println(h);

        // Decremento

        // 1. Predecremento
        var i = 2;
        var j = --i;
        System.out.println(i);
        System.out.println(j);

        // 2. Posdecremento

        var k = 4;
        var l = k--;
        System.out.println(k);
        System.out.println(l);

    }
}
