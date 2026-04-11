package _08arreglos;

import java.util.Scanner;

public class _03PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("**Promedio Calificaciones**");
        var consola = new Scanner(System.in);
        System.out.print("Introduce el número de calficaciones: ");
        var numeroCalificaciones = Integer.parseInt(consola.nextLine());
        var boletaCalificaciones = new float [numeroCalificaciones];
        var promedio = 0.0;

        for (int i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Introduce valores enteros en [" + i +"]: ");
            boletaCalificaciones[i] = Float.parseFloat(consola.nextLine());
            promedio += boletaCalificaciones[i];
        }
        promedio /= numeroCalificaciones;

        System.out.printf("%nImpresión de promedio: %.2f",promedio);

    }
}
