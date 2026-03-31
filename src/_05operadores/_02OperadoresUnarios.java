package _05operadores;

public class _02OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("***Operadores Unarios***");
        int a = 7, b = 4, resultado;
        System.out.println("VALOR ORIGINAL a = " + a);
        System.out.println("VALOR ORIGINAL b = " + b);
        resultado = +a;
        System.out.println("+a = " + resultado);
        resultado = ++a;
        System.out.println("++a = " + resultado);

        System.out.println("a++ = " + a++);
        System.out.println("a++ aplicado = " + a);


    }
}
