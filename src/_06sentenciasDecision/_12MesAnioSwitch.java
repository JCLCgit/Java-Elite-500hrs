package _06sentenciasDecision;

import java.util.Random;

public class _12MesAnioSwitch {
    public static void main(String[] args) {

        var aleatorio = new Random();
        var numeroMes = aleatorio.nextInt(13)+1;
        String mes = "";

        mes = switch (numeroMes) {
            case 12 -> "Diciembre";
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            default -> "Número Inválido";

        };
        System.out.printf("El mes %d es %s",numeroMes,mes);
    }
}
