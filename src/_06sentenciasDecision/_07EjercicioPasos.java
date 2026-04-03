package _06sentenciasDecision;

import java.util.Scanner;

public class _07EjercicioPasos {
    public static void main(String[] args) {
        System.out.println("**Aplicación pasos diarios**");
        final int META_PASOS_DIARIOS = 10000;
        final float CALORIAS_POR_PASO = 0.04F;

        var scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Ingresa los pasos caminados hoy: ");
        var pasosCaminados = Integer.parseInt(scanner.nextLine());

        var caloriasQuemadas = pasosCaminados * CALORIAS_POR_PASO;
        var resultadoMeta = (pasosCaminados >= META_PASOS_DIARIOS) ? "META CUMPLIDA" : "META NO ALCANZADA";
        System.out.printf("""
                \n----------------------------------
                Usuario: %s
                Sus pasos fueron %d
                %s y sus calorías quemadas fueron %.3f
                """,nombre,pasosCaminados,resultadoMeta,caloriasQuemadas);
    }
}
