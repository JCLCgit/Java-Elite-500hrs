package _02variables;

public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("**RESERVA**");
        var nombre = "Miguel Manger";
        var diasEstancia = 4;
        final var tarifaDiaria = 345.45F;
        var costoEstancia = diasEstancia * tarifaDiaria;
        var hasVista = true;

        System.out.println("nombre = " + nombre);
        System.out.println("hasVista = " + hasVista);
        System.out.println("costoEstancia = " + costoEstancia);
    }
}
