package _06sentenciasDecision;

import java.util.Scanner;

public class _10EstacionDelAnio {
    public static void main(String[] args) {
        System.out.println("**Estación del año**");
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa el número del mes: ");
        var estacion = Integer.parseInt(scanner.nextLine());
        String estacionMensaje;
        if (estacion == 1 || estacion == 2 || estacion == 12  ){
            estacionMensaje = "INVIERNO";
        } else if (estacion == 3 || estacion == 4 || estacion == 5) {
            estacionMensaje = "PRIMAVERA";
        } else if (estacion == 6 || estacion == 7 || estacion == 8) {
            estacionMensaje = "VERANO";
        } else if (estacion == 9 || estacion == 10 || estacion == 11) {
            estacionMensaje = "OTOÑO";
        } else
            estacionMensaje = "Número INVÁLIDO";

        System.out.printf("""
                \n___________________________
                El número del  mes ingresado corresponde a %s
                """,estacionMensaje);
    }
}
