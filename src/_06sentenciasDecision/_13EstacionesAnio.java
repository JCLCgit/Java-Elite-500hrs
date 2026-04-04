package _06sentenciasDecision;

import java.util.Random;

public class _13EstacionesAnio {
    public static void main(String[] args) {
        System.out.println("**Estaciones del año con Switch mejorado**");

        Random aleatorio = new Random();
        var mes = aleatorio.nextInt(13)+1;

        String estacion = switch (mes){
            case 1,2,12 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "Mes Inválido";
        };
        System.out.printf("\nEl mes %d seleccionado corresponde a la estación de %s",mes,estacion);
    }
}
