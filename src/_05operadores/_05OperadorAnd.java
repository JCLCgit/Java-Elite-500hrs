package _05operadores;

public class _05OperadorAnd {
    public static void main(String[] args) {

        boolean a = true, b = false;
        var resultado = a && b;
        System.out.printf("%b && %b : %b\n", a,b,resultado);
        a = false;
        b = true;
        resultado = a && b;
        System.out.printf("%b && %b : %b\n", a,b,resultado);
        a = false;
        b = false;
        resultado = a && b;
        System.out.printf("%b && %b : %b\n", a,b,resultado);
        a = true;
        b = true;
        resultado = a && b;
        System.out.printf("%b && %b : %b\n", a,b,resultado);
    }
}
