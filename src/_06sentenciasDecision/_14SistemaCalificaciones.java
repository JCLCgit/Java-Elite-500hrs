package _06sentenciasDecision;

import java.util.Random;

public class _14SistemaCalificaciones {
    public static void main(String[] args) {
        double min = -1.0, max = 11.0;

        System.out.println("**Sistema de Calificaciones**");
        Random aletorio = new Random();

        var calificacion = aletorio.nextFloat()*(max)+min;
        System.out.printf("calificacion = %.2f\n", calificacion);

        if (calificacion <= 10 && calificacion >= 9 )
            System.out.println("CALIFICACIÓN -> A");
        else if (calificacion < 9 && calificacion >= 8)
            System.out.println("CALIFICACIÓN -> B");
        else if (calificacion < 8 && calificacion >= 7)
            System.out.println("CALIFICACIÓN -> C");
        else if (calificacion < 7 && calificacion >= 6)
            System.out.println("CALIFICACIÓN -> D");
        else if (calificacion < 6 && calificacion >= 0)
            System.out.println("CALIFICACIÓN -> F");
        else
            System.out.println("CALIFICACIÓN INVáLIDA");
    }
}
