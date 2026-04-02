package _05operadores;

import java.util.Scanner;

public class _12AreaRectangulo {
    public static void main(String[] args) {
        System.out.println("***Cálculos rectángulo***");
        var scanner = new Scanner(System.in);
        float base, altura, area, perimetro;
        System.out.print("Dame tu base: ");
        base = Float.parseFloat(scanner.nextLine());
        System.out.print("Dame tu altura: ");
        altura = Float.parseFloat(scanner.nextLine());
        perimetro = (base + altura) * 2;
        area = base * altura;

        System.out.println("perimetro = " + perimetro);
        System.out.println("area = " + area);


    }
}
