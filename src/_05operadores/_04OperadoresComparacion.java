package _05operadores;

public class _04OperadoresComparacion {
    public static void main(String[] args) {
        int a =5, b = 7;

        var resultado = a == b;
        System.out.printf("resultado %d == %d : %b\n", a,b,resultado);
        resultado = (a != b);
        System.out.printf("resultado %d != %d : %b\n ",a,b, resultado);
        resultado = (a > b);
        System.out.printf("resultado %d > %d : %b\n ",a,b, resultado);
        resultado = (a >= b);
        System.out.printf("resultado %d >= %d : %b\n ",a,b, resultado);
        resultado = (a < b);
        System.out.printf("resultado %d < %d : %b\n ",a,b, resultado);
        resultado = (a <= b);
        System.out.printf("resultado %d <= %d : %b\n ",a,b, resultado);

    }
}
